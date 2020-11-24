package typings.awsSdkClientPinpointBrowser.typesBaiduChannelRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaiduChannelRequest extends js.Object {
  
  /**
    * Platform credential API key from Baidu.
    */
  var ApiKey: js.UndefOr[String] = js.native
  
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Platform credential Secret key from Baidu.
    */
  var SecretKey: js.UndefOr[String] = js.native
}
object BaiduChannelRequest {
  
  @scala.inline
  def apply(): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaiduChannelRequest]
  }
  
  @scala.inline
  implicit class BaiduChannelRequestOps[Self <: BaiduChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("ApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("ApiKey", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("SecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("SecretKey", js.undefined)
  }
}
