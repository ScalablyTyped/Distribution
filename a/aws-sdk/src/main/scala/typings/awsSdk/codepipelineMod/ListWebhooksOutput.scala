package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebhooksOutput extends StObject {
  
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListWebhooks call to return the next set of webhooks in the list. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codepipelineMod.NextToken] = js.undefined
  
  /**
    * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
    */
  var webhooks: js.UndefOr[WebhookList] = js.undefined
}
object ListWebhooksOutput {
  
  @scala.inline
  def apply(): ListWebhooksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebhooksOutput]
  }
  
  @scala.inline
  implicit class ListWebhooksOutputMutableBuilder[Self <: ListWebhooksOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWebhooks(value: WebhookList): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
    
    @scala.inline
    def setWebhooksVarargs(value: ListWebhookItem*): Self = StObject.set(x, "webhooks", js.Array(value :_*))
  }
}
