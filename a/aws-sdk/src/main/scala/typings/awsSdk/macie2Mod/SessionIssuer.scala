package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionIssuer extends js.Object {
  /**
    * The unique identifier for the AWS account that owns the entity that was used to get the credentials.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the credentials.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the entity that was used to get the credentials.
    */
  var principalId: js.UndefOr[string] = js.native
  /**
    * The source of the temporary security credentials, such as Root, IAMUser, or Role.
    */
  var `type`: js.UndefOr[string] = js.native
  /**
    * The name or alias of the user or role that issued the session. This value is null if the credentials were obtained from a root account that doesn't have an alias.
    */
  var userName: js.UndefOr[string] = js.native
}

object SessionIssuer {
  @scala.inline
  def apply(): SessionIssuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionIssuer]
  }
  @scala.inline
  implicit class SessionIssuerOps[Self <: SessionIssuer] (val x: Self) extends AnyVal {
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
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setPrincipalId(value: string): Self = this.set("principalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUserName(value: string): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

