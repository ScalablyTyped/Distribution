package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteActionTargetRequest extends js.Object {
  /**
    * The ARN of the custom action target to delete.
    */
  var ActionTargetArn: NonEmptyString = js.native
}

object DeleteActionTargetRequest {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteActionTargetRequest]
  }
}

