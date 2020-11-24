package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPrincipalsForPortfolioOutput extends js.Object {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The IAM principals (users or roles) associated with the portfolio.
    */
  var Principals: js.UndefOr[typings.awsSdk.servicecatalogMod.Principals] = js.native
}
object ListPrincipalsForPortfolioOutput {
  
  @scala.inline
  def apply(): ListPrincipalsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalsForPortfolioOutput]
  }
  
  @scala.inline
  implicit class ListPrincipalsForPortfolioOutputOps[Self <: ListPrincipalsForPortfolioOutput] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = this.set("Principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: Principals): Self = this.set("Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipals: Self = this.set("Principals", js.undefined)
  }
}
