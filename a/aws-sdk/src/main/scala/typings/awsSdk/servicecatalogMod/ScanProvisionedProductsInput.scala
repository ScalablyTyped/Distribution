package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanProvisionedProductsInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The access level to use to obtain results. The default is User.
    */
  var AccessLevelFilter: js.UndefOr[typings.awsSdk.servicecatalogMod.AccessLevelFilter] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
}

object ScanProvisionedProductsInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    AccessLevelFilter: AccessLevelFilter = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null
  ): ScanProvisionedProductsInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (AccessLevelFilter != null) __obj.updateDynamic("AccessLevelFilter")(AccessLevelFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanProvisionedProductsInput]
  }
}

