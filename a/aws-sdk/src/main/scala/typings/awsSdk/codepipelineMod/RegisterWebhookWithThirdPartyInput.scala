package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterWebhookWithThirdPartyInput extends StObject {
  
  /**
    * The name of an existing webhook created with PutWebhook to register with a supported third party. 
    */
  var webhookName: js.UndefOr[WebhookName] = js.undefined
}
object RegisterWebhookWithThirdPartyInput {
  
  inline def apply(): RegisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterWebhookWithThirdPartyInput]
  }
  
  extension [Self <: RegisterWebhookWithThirdPartyInput](x: Self) {
    
    inline def setWebhookName(value: WebhookName): Self = StObject.set(x, "webhookName", value.asInstanceOf[js.Any])
    
    inline def setWebhookNameUndefined: Self = StObject.set(x, "webhookName", js.undefined)
  }
}
