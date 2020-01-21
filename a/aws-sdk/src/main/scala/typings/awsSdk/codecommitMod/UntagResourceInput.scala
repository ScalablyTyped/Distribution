package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which you want to remove tags.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * The tag key for each tag that you want to remove from the resource.
    */
  var tagKeys: TagKeysList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, tagKeys: TagKeysList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

