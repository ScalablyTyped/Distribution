package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsRequest extends StObject {
  
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackageMod.MaxResults] = js.undefined
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListChannelsRequest {
  
  @scala.inline
  def apply(): ListChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsRequest]
  }
  
  @scala.inline
  implicit class ListChannelsRequestMutableBuilder[Self <: ListChannelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
