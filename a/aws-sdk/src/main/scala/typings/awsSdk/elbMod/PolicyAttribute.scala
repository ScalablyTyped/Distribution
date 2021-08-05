package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyAttribute extends StObject {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.elbMod.AttributeName] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[typings.awsSdk.elbMod.AttributeValue] = js.undefined
}
object PolicyAttribute {
  
  inline def apply(): PolicyAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttribute]
  }
  
  extension [Self <: PolicyAttribute](x: Self) {
    
    inline def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
  }
}
