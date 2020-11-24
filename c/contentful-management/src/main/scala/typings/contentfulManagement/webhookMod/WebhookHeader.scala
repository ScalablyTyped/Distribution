package typings.contentfulManagement.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookHeader extends js.Object {
  
  var key: String = js.native
  
  var secret: js.UndefOr[Boolean] = js.native
  
  var value: String = js.native
}
object WebhookHeader {
  
  @scala.inline
  def apply(key: String, value: String): WebhookHeader = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookHeader]
  }
  
  @scala.inline
  implicit class WebhookHeaderOps[Self <: WebhookHeader] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: Boolean): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
