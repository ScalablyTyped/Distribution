package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  ContentType :string,   CorrelationId :string,   Label :string,   Properties :string,   ReplyTo :string,   ReplyToSessionId :string,   RequiresPreprocessing :string,   SessionId :string,   To :string}> */
@js.native
trait CorrelationFilter extends js.Object {
  
  var ContentType: js.UndefOr[String] = js.native
  
  var CorrelationId: js.UndefOr[String] = js.native
  
  var Label: js.UndefOr[String] = js.native
  
  var Properties: js.UndefOr[String] = js.native
  
  var ReplyTo: js.UndefOr[String] = js.native
  
  var ReplyToSessionId: js.UndefOr[String] = js.native
  
  var RequiresPreprocessing: js.UndefOr[String] = js.native
  
  var SessionId: js.UndefOr[String] = js.native
  
  var To: js.UndefOr[String] = js.native
}
object CorrelationFilter {
  
  @scala.inline
  def apply(): CorrelationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrelationFilter]
  }
  
  @scala.inline
  implicit class CorrelationFilterOps[Self <: CorrelationFilter] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("CorrelationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("CorrelationId", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setProperties(value: String): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("Properties", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = this.set("ReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("ReplyTo", js.undefined)
    
    @scala.inline
    def setReplyToSessionId(value: String): Self = this.set("ReplyToSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyToSessionId: Self = this.set("ReplyToSessionId", js.undefined)
    
    @scala.inline
    def setRequiresPreprocessing(value: String): Self = this.set("RequiresPreprocessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresPreprocessing: Self = this.set("RequiresPreprocessing", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("SessionId", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("To", js.undefined)
  }
}
