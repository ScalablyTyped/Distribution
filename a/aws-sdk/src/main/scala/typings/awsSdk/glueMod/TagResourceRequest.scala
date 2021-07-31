package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource ARNs, see the AWS Glue ARN string pattern.
    */
  var ResourceArn: GlueResourceArn
  
  /**
    * Tags to add to this resource.
    */
  var TagsToAdd: TagsMap
}
object TagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: GlueResourceArn, TagsToAdd: TagsMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagsToAdd = TagsToAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToAdd(value: TagsMap): Self = StObject.set(x, "TagsToAdd", value.asInstanceOf[js.Any])
  }
}
