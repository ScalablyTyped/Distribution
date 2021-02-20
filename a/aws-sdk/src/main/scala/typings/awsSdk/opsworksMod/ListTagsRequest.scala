package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsRequest extends StObject {
  
  /**
    * Do not use. A validation exception occurs if you add a MaxResults parameter to a ListTagsRequest call. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opsworksMod.MaxResults] = js.native
  
  /**
    * Do not use. A validation exception occurs if you add a NextToken parameter to a ListTagsRequest call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opsworksMod.NextToken] = js.native
  
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsSdk.opsworksMod.ResourceArn = js.native
}
object ListTagsRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  @scala.inline
  implicit class ListTagsRequestMutableBuilder[Self <: ListTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
