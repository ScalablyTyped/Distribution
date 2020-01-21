package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedPolicy extends js.Object {
  var PolicyArn: js.UndefOr[arnType] = js.native
  /**
    * The friendly name of the attached policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.native
}

object AttachedPolicy {
  @scala.inline
  def apply(PolicyArn: arnType = null, PolicyName: policyNameType = null): AttachedPolicy = {
    val __obj = js.Dynamic.literal()
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedPolicy]
  }
}

