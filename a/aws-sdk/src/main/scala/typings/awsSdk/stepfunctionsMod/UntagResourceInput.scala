package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Step Functions state machine or activity.
    */
  var resourceArn: Arn = js.native
  /**
    * The list of tags to remove from the resource.
    */
  var tagKeys: TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
}

