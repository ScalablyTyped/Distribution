package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplexAspect extends js.Object {
  var complexObject: ComplexObject
  var originalValues: js.Object
  var parent: js.Object
  var parentProperty: DataProperty
  def getEntityAspect(): EntityAspect
  def getPropertyPath(propName: String): String
}

object ComplexAspect {
  @scala.inline
  def apply(
    complexObject: ComplexObject,
    getEntityAspect: () => EntityAspect,
    getPropertyPath: String => String,
    originalValues: js.Object,
    parent: js.Object,
    parentProperty: DataProperty
  ): ComplexAspect = {
    val __obj = js.Dynamic.literal(complexObject = complexObject.asInstanceOf[js.Any], getEntityAspect = js.Any.fromFunction0(getEntityAspect), getPropertyPath = js.Any.fromFunction1(getPropertyPath), originalValues = originalValues.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentProperty = parentProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexAspect]
  }
}

