package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConstraintsForPortfolioOutput extends StObject {
  
  /**
    * Information about the constraints.
    */
  var ConstraintDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintDetails] = js.undefined
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
}
object ListConstraintsForPortfolioOutput {
  
  @scala.inline
  def apply(): ListConstraintsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConstraintsForPortfolioOutput]
  }
  
  @scala.inline
  implicit class ListConstraintsForPortfolioOutputMutableBuilder[Self <: ListConstraintsForPortfolioOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraintDetails(value: ConstraintDetails): Self = StObject.set(x, "ConstraintDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintDetailsUndefined: Self = StObject.set(x, "ConstraintDetails", js.undefined)
    
    @scala.inline
    def setConstraintDetailsVarargs(value: ConstraintDetail*): Self = StObject.set(x, "ConstraintDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
