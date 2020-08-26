package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdentity extends js.Object {
  /**
    * If the action was performed with temporary security credentials that were obtained using the AssumeRole operation of the AWS Security Token Service (AWS STS) API, the identifiers, session context, and other details about the identity.
    */
  var assumedRole: js.UndefOr[AssumedRole] = js.native
  /**
    * If the action was performed using the credentials for another AWS account, the details of that account.
    */
  var awsAccount: js.UndefOr[AwsAccount] = js.native
  /**
    * If the action was performed by an AWS account that belongs to an AWS service, the name of the service.
    */
  var awsService: js.UndefOr[AwsService] = js.native
  /**
    * If the action was performed with temporary security credentials that were obtained using the GetFederationToken operation of the AWS Security Token Service (AWS STS) API, the identifiers, session context, and other details about the identity.
    */
  var federatedUser: js.UndefOr[FederatedUser] = js.native
  /**
    * If the action was performed using the credentials for an AWS Identity and Access Management (IAM) user, the name and other details about the user.
    */
  var iamUser: js.UndefOr[IamUser] = js.native
  /**
    * If the action was performed using the credentials for your AWS account, the details of your account.
    */
  var root: js.UndefOr[UserIdentityRoot] = js.native
  /**
    * The type of entity that performed the action.
    */
  var `type`: js.UndefOr[UserIdentityType] = js.native
}

object UserIdentity {
  @scala.inline
  def apply(): UserIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentity]
  }
  @scala.inline
  implicit class UserIdentityOps[Self <: UserIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssumedRole(value: AssumedRole): Self = this.set("assumedRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumedRole: Self = this.set("assumedRole", js.undefined)
    @scala.inline
    def setAwsAccount(value: AwsAccount): Self = this.set("awsAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccount: Self = this.set("awsAccount", js.undefined)
    @scala.inline
    def setAwsService(value: AwsService): Self = this.set("awsService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsService: Self = this.set("awsService", js.undefined)
    @scala.inline
    def setFederatedUser(value: FederatedUser): Self = this.set("federatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFederatedUser: Self = this.set("federatedUser", js.undefined)
    @scala.inline
    def setIamUser(value: IamUser): Self = this.set("iamUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamUser: Self = this.set("iamUser", js.undefined)
    @scala.inline
    def setRoot(value: UserIdentityRoot): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setType(value: UserIdentityType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

