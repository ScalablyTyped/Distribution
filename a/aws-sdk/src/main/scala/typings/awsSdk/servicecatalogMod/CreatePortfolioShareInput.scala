package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePortfolioShareInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The AWS account ID. For example, 123456789012.
    */
  var AccountId: js.UndefOr[typings.awsSdk.servicecatalogMod.AccountId] = js.native
  /**
    * The organization node to whom you are going to share. If OrganizationNode is passed in, PortfolioShare will be created for the node and its children (when applies), and a PortfolioShareToken will be returned in the output in order for the administrator to monitor the status of the PortfolioShare creation process.
    */
  var OrganizationNode: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNode] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
}

object CreatePortfolioShareInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    AcceptLanguage: AcceptLanguage = null,
    AccountId: AccountId = null,
    OrganizationNode: OrganizationNode = null
  ): CreatePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (OrganizationNode != null) __obj.updateDynamic("OrganizationNode")(OrganizationNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortfolioShareInput]
  }
}

