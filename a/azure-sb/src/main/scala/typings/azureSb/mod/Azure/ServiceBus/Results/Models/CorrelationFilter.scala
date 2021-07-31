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
  
  @scala.inline
  def apply(): CorrelationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrelationFilter]
  }
  
  @scala.inline
  implicit class CorrelationFilterMutableBuilder[Self <: CorrelationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: String): Self = StObject.set(x, "CorrelationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdUndefined: Self = StObject.set(x, "CorrelationId", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setProperties(value: String): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToSessionId(value: String): Self = StObject.set(x, "ReplyToSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToSessionIdUndefined: Self = StObject.set(x, "ReplyToSessionId", js.undefined)
    
    @scala.inline
    def setReplyToUndefined: Self = StObject.set(x, "ReplyTo", js.undefined)
    
    @scala.inline
    def setRequiresPreprocessing(value: String): Self = StObject.set(x, "RequiresPreprocessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresPreprocessingUndefined: Self = StObject.set(x, "RequiresPreprocessing", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
