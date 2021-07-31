package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortfolioOutput extends StObject {
  
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.PortfolioDetail] = js.undefined
  
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.undefined
}
object CreatePortfolioOutput {
  
  @scala.inline
  def apply(): CreatePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePortfolioOutput]
  }
  
  @scala.inline
  implicit class CreatePortfolioOutputMutableBuilder[Self <: CreatePortfolioOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortfolioDetail(value: PortfolioDetail): Self = StObject.set(x, "PortfolioDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioDetailUndefined: Self = StObject.set(x, "PortfolioDetail", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
