package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The ID of the resource to add a tag to.
    */
  var ResourceId: TaggableResourceId
  
  /**
    * A list of tags to add to the specified resource. You can specify any of the following taggable resources.   AWS account – specify the account ID number.   Organizational unit – specify the OU ID that begins with ou- and looks similar to: ou-1a2b-34uvwxyz     Root – specify the root ID that begins with r- and looks similar to: r-1a2b     Policy – specify the policy ID that begins with p- andlooks similar to: p-12abcdefg3     For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to null.  If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then the entire request fails and the account is not created. 
    */
  var Tags: typings.awsSdk.organizationsMod.Tags
}
object TagResourceRequest {
  
  inline def apply(ResourceId: TaggableResourceId, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceId(value: TaggableResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
