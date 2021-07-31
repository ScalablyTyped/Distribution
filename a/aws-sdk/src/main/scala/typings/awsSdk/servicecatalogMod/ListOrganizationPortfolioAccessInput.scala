package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationPortfolioAccessInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The organization node type that will be returned in the output.    ORGANIZATION - Organization that has access to the portfolio.     ORGANIZATIONAL_UNIT - Organizational unit that has access to the portfolio within your organization.    ACCOUNT - Account that has access to the portfolio within your organization.  
    */
  var OrganizationNodeType: typings.awsSdk.servicecatalogMod.OrganizationNodeType
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.undefined
  
  /**
    * The portfolio identifier. For example, port-2abcdext3y5fk.
    */
  var PortfolioId: Id
}
object ListOrganizationPortfolioAccessInput {
  
  @scala.inline
  def apply(OrganizationNodeType: OrganizationNodeType, PortfolioId: Id): ListOrganizationPortfolioAccessInput = {
    val __obj = js.Dynamic.literal(OrganizationNodeType = OrganizationNodeType.asInstanceOf[js.Any], PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationPortfolioAccessInput]
  }
  
  @scala.inline
  implicit class ListOrganizationPortfolioAccessInputMutableBuilder[Self <: ListOrganizationPortfolioAccessInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setOrganizationNodeType(value: OrganizationNodeType): Self = StObject.set(x, "OrganizationNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
  }
}
