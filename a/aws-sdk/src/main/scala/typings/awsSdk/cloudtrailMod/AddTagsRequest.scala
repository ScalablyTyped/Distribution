package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsRequest extends StObject {
  
  /**
    * Specifies the ARN of the trail to which one or more tags will be added. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String = js.native
  
  /**
    * Contains a list of CloudTrail tags, up to a limit of 50
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.native
}
object AddTagsRequest {
  
  @scala.inline
  def apply(ResourceId: String): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  
  @scala.inline
  implicit class AddTagsRequestMutableBuilder[Self <: AddTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    @scala.inline
    def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value :_*))
  }
}
