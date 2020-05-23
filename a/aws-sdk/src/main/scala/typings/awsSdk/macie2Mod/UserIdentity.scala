package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdentity extends js.Object {
  var assumedRole: js.UndefOr[AssumedRole] = js.native
  var awsAccount: js.UndefOr[AwsAccount] = js.native
  var awsService: js.UndefOr[AwsService] = js.native
  var federatedUser: js.UndefOr[FederatedUser] = js.native
  var iamUser: js.UndefOr[IamUser] = js.native
  var root: js.UndefOr[UserIdentityRoot] = js.native
  var `type`: js.UndefOr[UserIdentityType] = js.native
}

object UserIdentity {
  @scala.inline
  def apply(
    assumedRole: AssumedRole = null,
    awsAccount: AwsAccount = null,
    awsService: AwsService = null,
    federatedUser: FederatedUser = null,
    iamUser: IamUser = null,
    root: UserIdentityRoot = null,
    `type`: UserIdentityType = null
  ): UserIdentity = {
    val __obj = js.Dynamic.literal()
    if (assumedRole != null) __obj.updateDynamic("assumedRole")(assumedRole.asInstanceOf[js.Any])
    if (awsAccount != null) __obj.updateDynamic("awsAccount")(awsAccount.asInstanceOf[js.Any])
    if (awsService != null) __obj.updateDynamic("awsService")(awsService.asInstanceOf[js.Any])
    if (federatedUser != null) __obj.updateDynamic("federatedUser")(federatedUser.asInstanceOf[js.Any])
    if (iamUser != null) __obj.updateDynamic("iamUser")(iamUser.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
}

