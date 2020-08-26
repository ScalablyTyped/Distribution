package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * An AWS account ID of the account that was not processed.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.native
  /**
    * The reason that the account was not processed.
    */
  var ProcessingResult: js.UndefOr[NonEmptyString] = js.native
}

object Result {
  @scala.inline
  def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setProcessingResult(value: NonEmptyString): Self = this.set("ProcessingResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingResult: Self = this.set("ProcessingResult", js.undefined)
  }
  
}

