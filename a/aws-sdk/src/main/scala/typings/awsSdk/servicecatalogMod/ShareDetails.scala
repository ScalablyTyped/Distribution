package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareDetails extends js.Object {
  /**
    * List of errors.
    */
  var ShareErrors: js.UndefOr[typings.awsSdk.servicecatalogMod.ShareErrors] = js.native
  /**
    * List of accounts for whom the operation succeeded.
    */
  var SuccessfulShares: js.UndefOr[typings.awsSdk.servicecatalogMod.SuccessfulShares] = js.native
}

object ShareDetails {
  @scala.inline
  def apply(): ShareDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDetails]
  }
  @scala.inline
  implicit class ShareDetailsOps[Self <: ShareDetails] (val x: Self) extends AnyVal {
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
    def setShareErrorsVarargs(value: ShareError*): Self = this.set("ShareErrors", js.Array(value :_*))
    @scala.inline
    def setShareErrors(value: ShareErrors): Self = this.set("ShareErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareErrors: Self = this.set("ShareErrors", js.undefined)
    @scala.inline
    def setSuccessfulSharesVarargs(value: AccountId*): Self = this.set("SuccessfulShares", js.Array(value :_*))
    @scala.inline
    def setSuccessfulShares(value: SuccessfulShares): Self = this.set("SuccessfulShares", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfulShares: Self = this.set("SuccessfulShares", js.undefined)
  }
  
}

