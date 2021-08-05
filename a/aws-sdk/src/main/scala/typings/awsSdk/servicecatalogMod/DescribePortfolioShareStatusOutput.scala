package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePortfolioShareStatusOutput extends StObject {
  
  /**
    * Organization node identifier. It can be either account id, organizational unit id or organization id.
    */
  var OrganizationNodeValue: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNodeValue] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.undefined
  
  /**
    * The token for the portfolio share operation. For example, share-6v24abcdefghi.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.undefined
  
  /**
    * Information about the portfolio share operation.
    */
  var ShareDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ShareDetails] = js.undefined
  
  /**
    * Status of the portfolio share operation.
    */
  var Status: js.UndefOr[ShareStatus] = js.undefined
}
object DescribePortfolioShareStatusOutput {
  
  inline def apply(): DescribePortfolioShareStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
  }
  
  extension [Self <: DescribePortfolioShareStatusOutput](x: Self) {
    
    inline def setOrganizationNodeValue(value: OrganizationNodeValue): Self = StObject.set(x, "OrganizationNodeValue", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNodeValueUndefined: Self = StObject.set(x, "OrganizationNodeValue", js.undefined)
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    inline def setPortfolioIdUndefined: Self = StObject.set(x, "PortfolioId", js.undefined)
    
    inline def setPortfolioShareToken(value: Id): Self = StObject.set(x, "PortfolioShareToken", value.asInstanceOf[js.Any])
    
    inline def setPortfolioShareTokenUndefined: Self = StObject.set(x, "PortfolioShareToken", js.undefined)
    
    inline def setShareDetails(value: ShareDetails): Self = StObject.set(x, "ShareDetails", value.asInstanceOf[js.Any])
    
    inline def setShareDetailsUndefined: Self = StObject.set(x, "ShareDetails", js.undefined)
    
    inline def setStatus(value: ShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
