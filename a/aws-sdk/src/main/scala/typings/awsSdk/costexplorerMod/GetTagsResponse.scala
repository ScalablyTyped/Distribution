package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTagsResponse extends StObject {
  
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * The number of query results that AWS returns at a time.
    */
  var ReturnSize: PageSize = js.native
  
  /**
    * The tags that match your request.
    */
  var Tags: TagList = js.native
  
  /**
    * The total number of query results.
    */
  var TotalSize: PageSize = js.native
}
object GetTagsResponse {
  
  @scala.inline
  def apply(ReturnSize: PageSize, Tags: TagList, TotalSize: PageSize): GetTagsResponse = {
    val __obj = js.Dynamic.literal(ReturnSize = ReturnSize.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], TotalSize = TotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsResponse]
  }
  
  @scala.inline
  implicit class GetTagsResponseMutableBuilder[Self <: GetTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setReturnSize(value: PageSize): Self = StObject.set(x, "ReturnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Entity*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTotalSize(value: PageSize): Self = StObject.set(x, "TotalSize", value.asInstanceOf[js.Any])
  }
}
