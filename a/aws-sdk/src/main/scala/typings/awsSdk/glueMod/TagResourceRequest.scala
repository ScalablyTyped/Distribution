package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource ARNs, see the AWS Glue ARN string pattern.
    */
  var ResourceArn: GlueResourceArn = js.native
  /**
    * Tags to add to this resource.
    */
  var TagsToAdd: TagsMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GlueResourceArn, TagsToAdd: TagsMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagsToAdd = TagsToAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

