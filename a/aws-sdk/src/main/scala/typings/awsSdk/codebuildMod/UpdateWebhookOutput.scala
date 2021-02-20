package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWebhookOutput extends StObject {
  
  /**
    *  Information about a repository's webhook that is associated with a project in AWS CodeBuild. 
    */
  var webhook: js.UndefOr[Webhook] = js.native
}
object UpdateWebhookOutput {
  
  @scala.inline
  def apply(): UpdateWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWebhookOutput]
  }
  
  @scala.inline
  implicit class UpdateWebhookOutputMutableBuilder[Self <: UpdateWebhookOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
