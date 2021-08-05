package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAcceptedPortfolioSharesInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.undefined
  
  /**
    * The type of shared portfolios to list. The default is to list imported portfolios.    AWS_ORGANIZATIONS - List portfolios shared by the management account of your organization    AWS_SERVICECATALOG - List default portfolios    IMPORTED - List imported portfolios  
    */
  var PortfolioShareType: js.UndefOr[typings.awsSdk.servicecatalogMod.PortfolioShareType] = js.undefined
}
object ListAcceptedPortfolioSharesInput {
  
  inline def apply(): ListAcceptedPortfolioSharesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceptedPortfolioSharesInput]
  }
  
  extension [Self <: ListAcceptedPortfolioSharesInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    inline def setPortfolioShareType(value: PortfolioShareType): Self = StObject.set(x, "PortfolioShareType", value.asInstanceOf[js.Any])
    
    inline def setPortfolioShareTypeUndefined: Self = StObject.set(x, "PortfolioShareType", js.undefined)
  }
}
