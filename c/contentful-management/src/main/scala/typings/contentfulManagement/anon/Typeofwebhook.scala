package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.webhookMod.WebHooks
import typings.contentfulManagement.webhookMod.WebhookProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofwebhook extends StObject {
  
  def wrapWebhook(http: AxiosInstance, data: WebhookProps): WebHooks
  
  def wrapWebhookCollection(http: AxiosInstance, data: CollectionProp[WebhookProps]): Collection[WebHooks, WebhookProps]
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
  implicit class TypeofwebhookMutableBuilder[Self <: Typeofwebhook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapWebhook(value: (AxiosInstance, WebhookProps) => WebHooks): Self = StObject.set(x, "wrapWebhook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapWebhookCollection(value: (AxiosInstance, CollectionProp[WebhookProps]) => Collection[WebHooks, WebhookProps]): Self = StObject.set(x, "wrapWebhookCollection", js.Any.fromFunction2(value))
  }
}
