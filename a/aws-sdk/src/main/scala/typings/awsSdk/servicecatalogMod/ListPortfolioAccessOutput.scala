package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPortfolioAccessOutput extends StObject {
  
  /**
    * Information about the AWS accounts with access to the portfolio.
    */
  var AccountIds: js.UndefOr[typings.awsSdk.servicecatalogMod.AccountIds] = js.undefined
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
}
object ListPortfolioAccessOutput {
  
  @scala.inline
  def apply(): ListPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortfolioAccessOutput]
  }
  
  @scala.inline
  implicit class ListPortfolioAccessOutputMutableBuilder[Self <: ListPortfolioAccessOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
