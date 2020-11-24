package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAcceptedPortfolioSharesInput extends js.Object {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.native
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
  
  /**
    * The type of shared portfolios to list. The default is to list imported portfolios.    AWS_ORGANIZATIONS - List portfolios shared by the management account of your organization    AWS_SERVICECATALOG - List default portfolios    IMPORTED - List imported portfolios  
    */
  var PortfolioShareType: js.UndefOr[typings.awsSdk.servicecatalogMod.PortfolioShareType] = js.native
}
object ListAcceptedPortfolioSharesInput {
  
  @scala.inline
  def apply(): ListAcceptedPortfolioSharesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceptedPortfolioSharesInput]
  }
  
  @scala.inline
  implicit class ListAcceptedPortfolioSharesInputOps[Self <: ListAcceptedPortfolioSharesInput] (val x: Self) extends AnyVal {
    
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
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = this.set("PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("PageToken", js.undefined)
    
    @scala.inline
    def setPortfolioShareType(value: PortfolioShareType): Self = this.set("PortfolioShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortfolioShareType: Self = this.set("PortfolioShareType", js.undefined)
  }
}
