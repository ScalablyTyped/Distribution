package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.webhookMod.WebHooks
import typings.contentfulManagement.webhookMod.WebhookProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwebhook extends js.Object {
  
  def wrapWebhook(http: AxiosInstance, data: WebhookProps): WebHooks = js.native
  
  def wrapWebhookCollection(http: AxiosInstance, data: CollectionProp[WebhookProps]): Collection[WebHooks, WebhookProps] = js.native
}
object Typeofwebhook {
  
  @scala.inline
  def apply(
    wrapWebhook: (AxiosInstance, WebhookProps) => WebHooks,
    wrapWebhookCollection: (AxiosInstance, CollectionProp[WebhookProps]) => Collection[WebHooks, WebhookProps]
  ): Typeofwebhook = {
    val __obj = js.Dynamic.literal(wrapWebhook = js.Any.fromFunction2(wrapWebhook), wrapWebhookCollection = js.Any.fromFunction2(wrapWebhookCollection))
    __obj.asInstanceOf[Typeofwebhook]
  }
  
  @scala.inline
  implicit class TypeofwebhookOps[Self <: Typeofwebhook] (val x: Self) extends AnyVal {
    
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
    def setWrapWebhook(value: (AxiosInstance, WebhookProps) => WebHooks): Self = this.set("wrapWebhook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapWebhookCollection(value: (AxiosInstance, CollectionProp[WebhookProps]) => Collection[WebHooks, WebhookProps]): Self = this.set("wrapWebhookCollection", js.Any.fromFunction2(value))
  }
}
