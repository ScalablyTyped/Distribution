package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  ContentType :string,   CorrelationId :string,   Label :string,   Properties :string,   ReplyTo :string,   ReplyToSessionId :string,   RequiresPreprocessing :string,   SessionId :string,   To :string}> */
trait CorrelationFilter extends StObject {
  
  var ContentType: js.UndefOr[String] = js.undefined
  
  var CorrelationId: js.UndefOr[String] = js.undefined
  
  var Label: js.UndefOr[String] = js.undefined
  
  var Properties: js.UndefOr[String] = js.undefined
  
  var ReplyTo: js.UndefOr[String] = js.undefined
  
  var ReplyToSessionId: js.UndefOr[String] = js.undefined
  
  var RequiresPreprocessing: js.UndefOr[String] = js.undefined
  
  var SessionId: js.UndefOr[String] = js.undefined
  
  var To: js.UndefOr[String] = js.undefined
}
object CorrelationFilter {
  
  inline def apply(): CorrelationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrelationFilter]
  }
  
  extension [Self <: CorrelationFilter](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "CorrelationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "CorrelationId", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setProperties(value: String): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setReplyTo(value: String): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToSessionId(value: String): Self = StObject.set(x, "ReplyToSessionId", value.asInstanceOf[js.Any])
    
    inline def setReplyToSessionIdUndefined: Self = StObject.set(x, "ReplyToSessionId", js.undefined)
    
    inline def setReplyToUndefined: Self = StObject.set(x, "ReplyTo", js.undefined)
    
    inline def setRequiresPreprocessing(value: String): Self = StObject.set(x, "RequiresPreprocessing", value.asInstanceOf[js.Any])
    
    inline def setRequiresPreprocessingUndefined: Self = StObject.set(x, "RequiresPreprocessing", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
