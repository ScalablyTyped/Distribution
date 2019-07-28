package typings.breeze.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.ComplexAspect")
@js.native
class ComplexAspect () extends js.Object {
  var complexObject: ComplexObject = js.native
  var originalValues: js.Object = js.native
  var parent: js.Object = js.native
  var parentProperty: DataProperty = js.native
  def getEntityAspect(): EntityAspect = js.native
  def getPropertyPath(propName: String): String = js.native
}

