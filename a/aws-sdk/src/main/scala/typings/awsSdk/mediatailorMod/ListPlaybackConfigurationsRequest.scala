package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlaybackConfigurationsRequest extends StObject {
  
  /**
    * Maximum number of records to return. 
    */
  var MaxResults: js.UndefOr[integerMin1Max100] = js.undefined
  
  /**
    * Pagination token returned by the GET list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListPlaybackConfigurationsRequest {
  
  @scala.inline
  def apply(): ListPlaybackConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlaybackConfigurationsRequest]
  }
  
  @scala.inline
  implicit class ListPlaybackConfigurationsRequestMutableBuilder[Self <: ListPlaybackConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: integerMin1Max100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
