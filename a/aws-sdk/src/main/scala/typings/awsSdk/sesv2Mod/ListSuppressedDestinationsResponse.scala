package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSuppressedDestinationsResponse extends StObject {
  
  /**
    * A token that indicates that there are additional email addresses on the suppression list for your account. To view additional suppressed addresses, issue another request to ListSuppressedDestinations, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.undefined
  
  /**
    * A list of summaries, each containing a summary for a suppressed email destination.
    */
  var SuppressedDestinationSummaries: js.UndefOr[typings.awsSdk.sesv2Mod.SuppressedDestinationSummaries] = js.undefined
}
object ListSuppressedDestinationsResponse {
  
  @scala.inline
  def apply(): ListSuppressedDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuppressedDestinationsResponse]
  }
  
  @scala.inline
  implicit class ListSuppressedDestinationsResponseMutableBuilder[Self <: ListSuppressedDestinationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSuppressedDestinationSummaries(value: SuppressedDestinationSummaries): Self = StObject.set(x, "SuppressedDestinationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressedDestinationSummariesUndefined: Self = StObject.set(x, "SuppressedDestinationSummaries", js.undefined)
    
    @scala.inline
    def setSuppressedDestinationSummariesVarargs(value: SuppressedDestinationSummary*): Self = StObject.set(x, "SuppressedDestinationSummaries", js.Array(value :_*))
  }
}
