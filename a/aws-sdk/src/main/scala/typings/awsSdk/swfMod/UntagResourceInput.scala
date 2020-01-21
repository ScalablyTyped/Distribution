package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Amazon SWF domain.
    */
  var resourceArn: Arn = js.native
  /**
    * The list of tags to remove from the Amazon SWF domain.
    */
  var tagKeys: ResourceTagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tagKeys: ResourceTagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

