package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of an X-Ray group or sampling rule.
    */
  var ResourceARN: AmazonResourceName
  
  /**
    * A map that contains one or more tag keys and tag values to attach to an X-Ray group or sampling rule. For more information about ways to use tags, see Tagging AWS resources in the AWS General Reference. The following restrictions apply to tags:   Maximum number of user-applied tags per resource: 50   Maximum tag key length: 128 Unicode characters   Maximum tag value length: 256 Unicode characters   Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @   Tag keys and values are case sensitive.   Don't use aws: as a prefix for keys; it's reserved for AWS use. You cannot edit or delete system tags.  
    */
  var Tags: TagList
}
object TagResourceRequest {
  
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
