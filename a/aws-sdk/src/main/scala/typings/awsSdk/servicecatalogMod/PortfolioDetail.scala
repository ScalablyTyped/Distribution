package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortfolioDetail extends js.Object {
  /**
    * The ARN assigned to the portfolio.
    */
  var ARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreationTime] = js.native
  /**
    * The description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.native
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.native
  /**
    * The portfolio identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProviderName] = js.native
}

object PortfolioDetail {
  @scala.inline
  def apply(): PortfolioDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortfolioDetail]
  }
  @scala.inline
  implicit class PortfolioDetailOps[Self <: PortfolioDetail] (val x: Self) extends AnyVal {
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
    def setARN(value: ResourceARN): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setCreatedTime(value: CreationTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDescription(value: PortfolioDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayName(value: PortfolioDisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setProviderName(value: ProviderName): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
  }
  
}

