package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingSubscribeOptions extends js.Object {
  
  var invocationContext: js.UndefOr[js.Object] = js.native
  
  var onFailure: js.UndefOr[js.Function] = js.native
  
  var onSuccess: js.UndefOr[js.Function] = js.native
  
  var qos: js.UndefOr[MessagingQOS] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object MessagingSubscribeOptions {
  
  @scala.inline
  def apply(): MessagingSubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingSubscribeOptions]
  }
  
  @scala.inline
  implicit class MessagingSubscribeOptionsOps[Self <: MessagingSubscribeOptions] (val x: Self) extends AnyVal {
    
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
    def setInvocationContext(value: js.Object): Self = this.set("invocationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationContext: Self = this.set("invocationContext", js.undefined)
    
    @scala.inline
    def setOnFailure(value: js.Function): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: js.Function): Self = this.set("onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setQos(value: MessagingQOS): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
