package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyResponse extends js.Object {
  /**
    * The ARN of the secret that the resource-based policy was retrieved for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret that the resource-based policy was retrieved for.
    */
  var Name: js.UndefOr[NameType] = js.native
  /**
    * A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see Authentication and Access Control for AWS Secrets Manager in the AWS Secrets Manager User Guide.
    */
  var ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType] = js.native
}

object GetResourcePolicyResponse {
  @scala.inline
  def apply(
    ARN: SecretARNType = null,
    Name: NameType = null,
    ResourcePolicy: NonEmptyResourcePolicyType = null
  ): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ResourcePolicy != null) __obj.updateDynamic("ResourcePolicy")(ResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
}

