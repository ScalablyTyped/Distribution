package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPortfolioAccessInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The ID of an organization node the portfolio is shared with. All children of this node with an inherited portfolio share will be returned.
    */
  var OrganizationParentId: js.UndefOr[Id] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
}

object ListPortfolioAccessInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    AcceptLanguage: AcceptLanguage = null,
    OrganizationParentId: Id = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null
  ): ListPortfolioAccessInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (OrganizationParentId != null) __obj.updateDynamic("OrganizationParentId")(OrganizationParentId.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPortfolioAccessInput]
  }
}

