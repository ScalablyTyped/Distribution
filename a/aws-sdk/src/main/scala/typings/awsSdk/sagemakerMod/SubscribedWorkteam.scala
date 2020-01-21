package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribedWorkteam extends js.Object {
  /**
    * 
    */
  var ListingId: js.UndefOr[String] = js.native
  /**
    * The description of the vendor from the Amazon Marketplace.
    */
  var MarketplaceDescription: js.UndefOr[String200] = js.native
  /**
    * The title of the service provided by the vendor in the Amazon Marketplace.
    */
  var MarketplaceTitle: js.UndefOr[String200] = js.native
  /**
    * The name of the vendor in the Amazon Marketplace.
    */
  var SellerName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object SubscribedWorkteam {
  @scala.inline
  def apply(
    WorkteamArn: WorkteamArn,
    ListingId: String = null,
    MarketplaceDescription: String200 = null,
    MarketplaceTitle: String200 = null,
    SellerName: String = null
  ): SubscribedWorkteam = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    if (ListingId != null) __obj.updateDynamic("ListingId")(ListingId.asInstanceOf[js.Any])
    if (MarketplaceDescription != null) __obj.updateDynamic("MarketplaceDescription")(MarketplaceDescription.asInstanceOf[js.Any])
    if (MarketplaceTitle != null) __obj.updateDynamic("MarketplaceTitle")(MarketplaceTitle.asInstanceOf[js.Any])
    if (SellerName != null) __obj.updateDynamic("SellerName")(SellerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribedWorkteam]
  }
}

