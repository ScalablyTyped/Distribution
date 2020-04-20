package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Step Functions state machine or activity.
    */
  var resourceArn: Arn = js.native
  /**
    * The list of tags to add to a resource. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  var tags: TagList = js.native
}

object TagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
}

