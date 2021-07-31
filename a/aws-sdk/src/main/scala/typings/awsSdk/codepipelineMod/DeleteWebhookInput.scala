package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWebhookInput extends StObject {
  
  /**
    * The name of the webhook you want to delete.
    */
  var name: WebhookName
}
object DeleteWebhookInput {
  
  @scala.inline
  def apply(name: WebhookName): DeleteWebhookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookInput]
  }
  
  @scala.inline
  implicit class DeleteWebhookInputMutableBuilder[Self <: DeleteWebhookInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: WebhookName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
