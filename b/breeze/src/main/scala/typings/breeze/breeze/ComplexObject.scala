package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplexObject extends js.Object {
  var complexAspect: ComplexAspect
  var complexType: ComplexType
}

object ComplexObject {
  @scala.inline
  def apply(complexAspect: ComplexAspect, complexType: ComplexType): ComplexObject = {
    val __obj = js.Dynamic.literal(complexAspect = complexAspect.asInstanceOf[js.Any], complexType = complexType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComplexObject]
  }
}

