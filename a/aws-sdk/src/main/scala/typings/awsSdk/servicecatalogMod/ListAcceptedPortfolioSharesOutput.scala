package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAcceptedPortfolioSharesOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the portfolios.
    */
  var PortfolioDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.PortfolioDetails] = js.undefined
}
object ListAcceptedPortfolioSharesOutput {
  
  @scala.inline
  def apply(): ListAcceptedPortfolioSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceptedPortfolioSharesOutput]
  }
  
  @scala.inline
  implicit class ListAcceptedPortfolioSharesOutputMutableBuilder[Self <: ListAcceptedPortfolioSharesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setPortfolioDetails(value: PortfolioDetails): Self = StObject.set(x, "PortfolioDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioDetailsUndefined: Self = StObject.set(x, "PortfolioDetails", js.undefined)
    
    @scala.inline
    def setPortfolioDetailsVarargs(value: PortfolioDetail*): Self = StObject.set(x, "PortfolioDetails", js.Array(value :_*))
  }
}
