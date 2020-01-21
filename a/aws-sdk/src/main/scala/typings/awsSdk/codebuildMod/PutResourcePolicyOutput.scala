package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyOutput extends js.Object {
  /**
    *  The ARN of the Project or ReportGroup resource that is associated with a resource policy. 
    */
  var resourceArn: js.UndefOr[NonEmptyString] = js.native
}

object PutResourcePolicyOutput {
  @scala.inline
  def apply(resourceArn: NonEmptyString = null): PutResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyOutput]
  }
}

