package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsAccount extends js.Object {
  /**
    * The unique identifier for the AWS account.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the entity that performed the action.
    */
  var principalId: js.UndefOr[string] = js.native
}

object AwsAccount {
  @scala.inline
  def apply(): AwsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAccount]
  }
  @scala.inline
  implicit class AwsAccountOps[Self <: AwsAccount] (val x: Self) extends AnyVal {
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
    def setPrincipalId(value: string): Self = this.set("principalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
  }
  
}

