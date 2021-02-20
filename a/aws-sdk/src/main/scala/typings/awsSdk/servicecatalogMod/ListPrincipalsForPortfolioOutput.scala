package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPrincipalsForPortfolioOutput extends StObject {
  
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
  implicit class ListPrincipalsForPortfolioOutputMutableBuilder[Self <: ListPrincipalsForPortfolioOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setPrincipals(value: Principals): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "Principals", js.Array(value :_*))
  }
}
