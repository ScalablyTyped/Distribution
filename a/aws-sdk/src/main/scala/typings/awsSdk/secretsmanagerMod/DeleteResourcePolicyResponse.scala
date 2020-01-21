package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcePolicyResponse extends js.Object {
  /**
    * The ARN of the secret that the resource-based policy was deleted for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret that the resource-based policy was deleted for.
    */
  var Name: js.UndefOr[NameType] = js.native
}

object DeleteResourcePolicyResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, Name: NameType = null): DeleteResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyResponse]
  }
}

