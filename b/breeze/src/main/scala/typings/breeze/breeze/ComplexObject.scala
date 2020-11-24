package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexObject extends js.Object {
  
  var complexAspect: ComplexAspect = js.native
  
  var complexType: ComplexType = js.native
}
object ComplexObject {
  
  @scala.inline
  def apply(complexAspect: ComplexAspect, complexType: ComplexType): ComplexObject = {
    val __obj = js.Dynamic.literal(complexAspect = complexAspect.asInstanceOf[js.Any], complexType = complexType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexObject]
  }
  
  @scala.inline
  implicit class ComplexObjectOps[Self <: ComplexObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplexAspect(value: ComplexAspect): Self = this.set("complexAspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexType(value: ComplexType): Self = this.set("complexType", value.asInstanceOf[js.Any])
  }
}
