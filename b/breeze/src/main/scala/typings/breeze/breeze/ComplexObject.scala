package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexObject extends StObject {
  
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
  implicit class ComplexObjectMutableBuilder[Self <: ComplexObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplexAspect(value: ComplexAspect): Self = StObject.set(x, "complexAspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplexType(value: ComplexType): Self = StObject.set(x, "complexType", value.asInstanceOf[js.Any])
  }
}
