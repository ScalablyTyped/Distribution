package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePortfolioShareStatusOutput extends js.Object {
  
  /**
    * Organization node identifier. It can be either account id, organizational unit id or organization id.
    */
  var OrganizationNodeValue: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNodeValue] = js.native
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.native
  
  /**
    * The token for the portfolio share operation. For example, share-6v24abcdefghi.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
  
  /**
    * Information about the portfolio share operation.
    */
  var ShareDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ShareDetails] = js.native
  
  /**
    * Status of the portfolio share operation.
    */
  var Status: js.UndefOr[ShareStatus] = js.native
}
object DescribePortfolioShareStatusOutput {
  
  @scala.inline
  def apply(): DescribePortfolioShareStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
  }
  
  @scala.inline
  implicit class DescribePortfolioShareStatusOutputOps[Self <: DescribePortfolioShareStatusOutput] (val x: Self) extends AnyVal {
    
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
    def setOrganizationNodeValue(value: OrganizationNodeValue): Self = this.set("OrganizationNodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationNodeValue: Self = this.set("OrganizationNodeValue", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = this.set("PortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortfolioId: Self = this.set("PortfolioId", js.undefined)
    
    @scala.inline
    def setPortfolioShareToken(value: Id): Self = this.set("PortfolioShareToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortfolioShareToken: Self = this.set("PortfolioShareToken", js.undefined)
    
    @scala.inline
    def setShareDetails(value: ShareDetails): Self = this.set("ShareDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareDetails: Self = this.set("ShareDetails", js.undefined)
    
    @scala.inline
    def setStatus(value: ShareStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
