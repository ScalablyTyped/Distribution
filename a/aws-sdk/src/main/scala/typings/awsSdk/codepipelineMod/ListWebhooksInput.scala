package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebhooksInput extends StObject {
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codepipelineMod.MaxResults] = js.native
  
  /**
    * The token that was returned from the previous ListWebhooks call, which can be used to return the next set of webhooks in the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codepipelineMod.NextToken] = js.native
}
object ListWebhooksInput {
  
  @scala.inline
  def apply(): ListWebhooksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebhooksInput]
  }
  
  @scala.inline
  implicit class ListWebhooksInputMutableBuilder[Self <: ListWebhooksInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
