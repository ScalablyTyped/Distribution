package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePortfolioOutput extends js.Object {
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.PortfolioDetail] = js.native
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}

object UpdatePortfolioOutput {
  @scala.inline
  def apply(PortfolioDetail: PortfolioDetail = null, Tags: Tags = null): UpdatePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    if (PortfolioDetail != null) __obj.updateDynamic("PortfolioDetail")(PortfolioDetail.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortfolioOutput]
  }
}

