package typings
package breezeLib.breezeNs

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
    val __obj = js.Dynamic.literal(complexAspect = complexAspect, complexType = complexType)
  
    __obj.asInstanceOf[ComplexObject]
  }
}

