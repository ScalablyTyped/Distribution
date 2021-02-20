package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceRequest extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  
  /**
    * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this metadata to user accounts for any purpose.
    */
  var Tags: typings.awsSdk.transferMod.Tags = js.native
}
object TagResourceRequest {
  
  @scala.inline
  def apply(Arn: Arn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
