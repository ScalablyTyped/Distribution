package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePortfolioShareStatusInput extends StObject {
  
  /**
    * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by DeletePortfolioShare.
    */
  var PortfolioShareToken: Id
}
object DescribePortfolioShareStatusInput {
  
  inline def apply(PortfolioShareToken: Id): DescribePortfolioShareStatusInput = {
    val __obj = js.Dynamic.literal(PortfolioShareToken = PortfolioShareToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortfolioShareStatusInput]
  }
  
  extension [Self <: DescribePortfolioShareStatusInput](x: Self) {
    
    inline def setPortfolioShareToken(value: Id): Self = StObject.set(x, "PortfolioShareToken", value.asInstanceOf[js.Any])
  }
}
