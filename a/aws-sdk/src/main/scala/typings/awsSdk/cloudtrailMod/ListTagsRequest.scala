package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsRequest extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies a list of trail ARNs whose tags will be listed. The list has a limit of 20 ARNs. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceIdList: typings.awsSdk.cloudtrailMod.ResourceIdList = js.native
}
object ListTagsRequest {
  
  @scala.inline
  def apply(ResourceIdList: ResourceIdList): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceIdList = ResourceIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  @scala.inline
  implicit class ListTagsRequestMutableBuilder[Self <: ListTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceIdList(value: ResourceIdList): Self = StObject.set(x, "ResourceIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdListVarargs(value: String*): Self = StObject.set(x, "ResourceIdList", js.Array(value :_*))
  }
}
