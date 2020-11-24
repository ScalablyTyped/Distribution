package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonMessagingProperties extends js.Object {
  
  var cleanSession: js.UndefOr[Boolean] = js.native
  
  var hosts: js.UndefOr[String] = js.native
  
  var onFailure: js.UndefOr[js.Function] = js.native
  
  var onSuccess: js.UndefOr[js.Function] = js.native
  
  var ports: js.UndefOr[String] = js.native
  
  var useSSL: js.UndefOr[Boolean] = js.native
}
object CommonMessagingProperties {
  
  @scala.inline
  def apply(): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMessagingProperties]
  }
  
  @scala.inline
  implicit class CommonMessagingPropertiesOps[Self <: CommonMessagingProperties] (val x: Self) extends AnyVal {
    
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
    def setCleanSession(value: Boolean): Self = this.set("cleanSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanSession: Self = this.set("cleanSession", js.undefined)
    
    @scala.inline
    def setHosts(value: String): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setOnFailure(value: js.Function): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: js.Function): Self = this.set("onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setPorts(value: String): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    
    @scala.inline
    def setUseSSL(value: Boolean): Self = this.set("useSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSSL: Self = this.set("useSSL", js.undefined)
  }
}
