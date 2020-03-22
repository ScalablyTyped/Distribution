package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  /**
    * Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide.
    */
  var keyArn: js.UndefOr[String] = js.native
}

object Provider {
  @scala.inline
  def apply(keyArn: String = null): Provider = {
    val __obj = js.Dynamic.literal()
    if (keyArn != null) __obj.updateDynamic("keyArn")(keyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

