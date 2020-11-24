package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryOptions extends js.Object {
  
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[PoolName] = js.native
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typings.awsSdk.pinpointemailMod.TlsPolicy] = js.native
}
object DeliveryOptions {
  
  @scala.inline
  def apply(): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryOptions]
  }
  
  @scala.inline
  implicit class DeliveryOptionsOps[Self <: DeliveryOptions] (val x: Self) extends AnyVal {
    
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
    def setSendingPoolName(value: PoolName): Self = this.set("SendingPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingPoolName: Self = this.set("SendingPoolName", js.undefined)
    
    @scala.inline
    def setTlsPolicy(value: TlsPolicy): Self = this.set("TlsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsPolicy: Self = this.set("TlsPolicy", js.undefined)
  }
}
