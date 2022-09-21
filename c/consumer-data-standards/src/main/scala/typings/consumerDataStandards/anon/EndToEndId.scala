package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndToEndId
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * An end to end ID for the payment created at initiation
    */
  var endToEndId: js.UndefOr[String] = js.undefined
  
  /**
    * An extended string description. Only present if specified by the extensionUType field
    */
  var extendedDescription: String
  
  /**
    * Purpose of the payment.  Format is defined by NPP standards for the x2p1.01 overlay service
    */
  var purposeCode: js.UndefOr[String] = js.undefined
}
object EndToEndId {
  
  inline def apply(extendedDescription: String): EndToEndId = {
    val __obj = js.Dynamic.literal(extendedDescription = extendedDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndToEndId]
  }
  
  extension [Self <: EndToEndId](x: Self) {
    
    inline def setEndToEndId(value: String): Self = StObject.set(x, "endToEndId", value.asInstanceOf[js.Any])
    
    inline def setEndToEndIdUndefined: Self = StObject.set(x, "endToEndId", js.undefined)
    
    inline def setExtendedDescription(value: String): Self = StObject.set(x, "extendedDescription", value.asInstanceOf[js.Any])
    
    inline def setPurposeCode(value: String): Self = StObject.set(x, "purposeCode", value.asInstanceOf[js.Any])
    
    inline def setPurposeCodeUndefined: Self = StObject.set(x, "purposeCode", js.undefined)
  }
}
