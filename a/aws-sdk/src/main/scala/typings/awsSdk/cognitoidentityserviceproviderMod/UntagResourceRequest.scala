package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user pool that the tags are assigned to.
    */
  var ResourceArn: ArnType = js.native
  /**
    * The keys of the tags to remove from the user pool.
    */
  var TagKeys: UserPoolTagsListType = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ArnType, TagKeys: UserPoolTagsListType): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

