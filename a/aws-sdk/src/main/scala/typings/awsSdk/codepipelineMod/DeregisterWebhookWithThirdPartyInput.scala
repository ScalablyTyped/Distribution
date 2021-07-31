package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterWebhookWithThirdPartyInput extends StObject {
  
  /**
    * The name of the webhook you want to deregister.
    */
  var webhookName: js.UndefOr[WebhookName] = js.undefined
}
object DeregisterWebhookWithThirdPartyInput {
  
  @scala.inline
  def apply(): DeregisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
  }
  
  @scala.inline
  implicit class DeregisterWebhookWithThirdPartyInputMutableBuilder[Self <: DeregisterWebhookWithThirdPartyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhookName(value: WebhookName): Self = StObject.set(x, "webhookName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookNameUndefined: Self = StObject.set(x, "webhookName", js.undefined)
  }
}
