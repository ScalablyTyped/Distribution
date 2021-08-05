package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutWebhookOutput extends StObject {
  
  /**
    * The detail returned from creating the webhook, such as the webhook name, webhook URL, and webhook ARN.
    */
  var webhook: js.UndefOr[ListWebhookItem] = js.undefined
}
object PutWebhookOutput {
  
  inline def apply(): PutWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutWebhookOutput]
  }
  
  extension [Self <: PutWebhookOutput](x: Self) {
    
    inline def setWebhook(value: ListWebhookItem): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
