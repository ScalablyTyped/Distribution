package typings.azureSb.queuemessageresultMod.Azure.ServiceBus.Results

import typings.azureSb.mod.Azure.ServiceBus.BrokerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueMessageResponse extends js.Object {
  
  var body: js.Any = js.native
  
  var brokerProperties: js.UndefOr[BrokerProperties] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var customProperties: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any
  ] = js.native
  
  var location: js.UndefOr[String] = js.native
}
object QueueMessageResponse {
  
  @scala.inline
  def apply(body: js.Any): QueueMessageResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueMessageResponse]
  }
  
  @scala.inline
  implicit class QueueMessageResponseOps[Self <: QueueMessageResponse] (val x: Self) extends AnyVal {
    
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerProperties(value: BrokerProperties): Self = this.set("brokerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerProperties: Self = this.set("brokerProperties", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCustomProperties(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any
    ): Self = this.set("customProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomProperties: Self = this.set("customProperties", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
