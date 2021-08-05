package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the resources, separated by spaces. Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
    */
  var Resources: ResourceIdList
  
  /**
    * The tags to delete. Specify a tag key and an optional tag value to delete specific tags. If you specify a tag key without a tag value, we delete any tag with this key regardless of its value. If you specify a tag key with an empty string as the tag value, we delete the tag only if its value is an empty string. If you omit this parameter, we delete all user-defined tags for the specified resources. We do not delete AWS-generated tags (tags that have the aws: prefix).
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object DeleteTagsRequest {
  
  inline def apply(Resources: ResourceIdList): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
  
  extension [Self <: DeleteTagsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setResources(value: ResourceIdList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: TaggableResourceId*): Self = StObject.set(x, "Resources", js.Array(value :_*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
