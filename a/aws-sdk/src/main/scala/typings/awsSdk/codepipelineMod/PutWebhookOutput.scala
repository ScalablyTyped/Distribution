package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutWebhookOutput extends StObject {
  
  /**
    * The detail returned from creating the webhook, such as the webhook name, webhook URL, and webhook ARN.
    */
  var webhook: js.UndefOr[ListWebhookItem] = js.native
}
object PutWebhookOutput {
  
  @scala.inline
  def apply(): PutWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutWebhookOutput]
  }
  
  @scala.inline
  implicit class PutWebhookOutputMutableBuilder[Self <: PutWebhookOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhook(value: ListWebhookItem): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
