package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebhookOutput extends StObject {
  
  /**
    * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
    */
  var webhook: js.UndefOr[Webhook] = js.undefined
}
object CreateWebhookOutput {
  
  inline def apply(): CreateWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWebhookOutput]
  }
  
  extension [Self <: CreateWebhookOutput](x: Self) {
    
    inline def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
