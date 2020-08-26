package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePortfolioShareInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The AWS account ID.
    */
  var AccountId: js.UndefOr[typings.awsSdk.servicecatalogMod.AccountId] = js.native
  /**
    * The organization node to whom you are going to stop sharing.
    */
  var OrganizationNode: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNode] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
}

object DeletePortfolioShareInput {
  @scala.inline
  def apply(PortfolioId: Id): DeletePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortfolioShareInput]
  }
  @scala.inline
  implicit class DeletePortfolioShareInputOps[Self <: DeletePortfolioShareInput] (val x: Self) extends AnyVal {
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
    def setPortfolioId(value: Id): Self = this.set("PortfolioId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setOrganizationNode(value: OrganizationNode): Self = this.set("OrganizationNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationNode: Self = this.set("OrganizationNode", js.undefined)
  }
  
}

