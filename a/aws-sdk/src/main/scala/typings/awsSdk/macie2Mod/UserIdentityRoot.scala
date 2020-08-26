package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdentityRoot extends js.Object {
  /**
    * The unique identifier for the AWS account.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN contains the name of the user or role that performed the action.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the entity that performed the action.
    */
  var principalId: js.UndefOr[string] = js.native
}

object UserIdentityRoot {
  @scala.inline
  def apply(): UserIdentityRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityRoot]
  }
  @scala.inline
  implicit class UserIdentityRootOps[Self <: UserIdentityRoot] (val x: Self) extends AnyVal {
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
  }
  
}

