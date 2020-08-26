package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribedWorkteam extends js.Object {
  /**
    * Marketplace product listing ID.
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
  def apply(WorkteamArn: WorkteamArn): SubscribedWorkteam = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribedWorkteam]
  }
  @scala.inline
  implicit class SubscribedWorkteamOps[Self <: SubscribedWorkteam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWorkteamArn(value: WorkteamArn): Self = this.set("WorkteamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setListingId(value: String): Self = this.set("ListingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListingId: Self = this.set("ListingId", js.undefined)
    @scala.inline
    def setMarketplaceDescription(value: String200): Self = this.set("MarketplaceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketplaceDescription: Self = this.set("MarketplaceDescription", js.undefined)
    @scala.inline
    def setMarketplaceTitle(value: String200): Self = this.set("MarketplaceTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketplaceTitle: Self = this.set("MarketplaceTitle", js.undefined)
    @scala.inline
    def setSellerName(value: String): Self = this.set("SellerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerName: Self = this.set("SellerName", js.undefined)
  }
  
}

