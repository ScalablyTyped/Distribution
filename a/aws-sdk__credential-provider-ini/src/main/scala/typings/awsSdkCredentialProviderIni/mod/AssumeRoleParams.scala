package typings.awsSdkCredentialProviderIni.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssumeRoleParams extends js.Object {
  /**
    * A unique identifier that is used by third parties when assuming roles in
    * their customers' accounts.
    */
  var ExternalId: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the role to be assumed.
    */
  var RoleArn: String
  /**
    * A name for the assumed role session.
    */
  var RoleSessionName: String
  /**
    * The identification number of the MFA device that is associated with the
    * user who is making the `AssumeRole` call.
    */
  var SerialNumber: js.UndefOr[String] = js.undefined
  /**
    * The value provided by the MFA device.
    */
  var TokenCode: js.UndefOr[String] = js.undefined
}

object AssumeRoleParams {
  @scala.inline
  def apply(
    RoleArn: String,
    RoleSessionName: String,
    ExternalId: String = null,
    SerialNumber: String = null,
    TokenCode: String = null
  ): AssumeRoleParams = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber.asInstanceOf[js.Any])
    if (TokenCode != null) __obj.updateDynamic("TokenCode")(TokenCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeRoleParams]
  }
}

