package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssetsRequest extends StObject {
  
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackagevodMod.MaxResults] = js.native
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * Returns Assets associated with the specified PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
}
object ListAssetsRequest {
  
  @scala.inline
  def apply(): ListAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsRequest]
  }
  
  @scala.inline
  implicit class ListAssetsRequestMutableBuilder[Self <: ListAssetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingGroupIdUndefined: Self = StObject.set(x, "PackagingGroupId", js.undefined)
  }
}
