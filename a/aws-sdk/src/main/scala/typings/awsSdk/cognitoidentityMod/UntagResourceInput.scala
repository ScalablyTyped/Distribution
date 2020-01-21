package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the identity pool that the tags are assigned to.
    */
  var ResourceArn: ARNString = js.native
  /**
    * The keys of the tags to remove from the user pool.
    */
  var TagKeys: IdentityPoolTagsListType = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARNString, TagKeys: IdentityPoolTagsListType): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

