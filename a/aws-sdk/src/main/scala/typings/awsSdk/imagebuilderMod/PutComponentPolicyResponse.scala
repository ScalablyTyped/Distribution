package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutComponentPolicyResponse extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the component that this policy was applied to. 
    */
  var componentArn: js.UndefOr[ComponentBuildVersionArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object PutComponentPolicyResponse {
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn = null, requestId: NonEmptyString = null): PutComponentPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (componentArn != null) __obj.updateDynamic("componentArn")(componentArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutComponentPolicyResponse]
  }
}

