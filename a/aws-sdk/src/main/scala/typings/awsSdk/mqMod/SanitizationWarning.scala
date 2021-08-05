package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SanitizationWarning extends StObject {
  
  /**
    * The name of the XML attribute that has been sanitized.
    */
  var AttributeName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the XML element that has been sanitized.
    */
  var ElementName: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The reason for which the XML elements or attributes were sanitized.
    */
  var Reason: js.UndefOr[SanitizationWarningReason] = js.undefined
}
object SanitizationWarning {
  
  inline def apply(): SanitizationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SanitizationWarning]
  }
  
  extension [Self <: SanitizationWarning](x: Self) {
    
    inline def setAttributeName(value: string): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setElementName(value: string): Self = StObject.set(x, "ElementName", value.asInstanceOf[js.Any])
    
    inline def setElementNameUndefined: Self = StObject.set(x, "ElementName", js.undefined)
    
    inline def setReason(value: SanitizationWarningReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
