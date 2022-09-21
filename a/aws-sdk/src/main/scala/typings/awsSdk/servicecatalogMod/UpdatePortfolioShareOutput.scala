package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortfolioShareOutput extends StObject {
  
  /**
    * The token that tracks the status of the UpdatePortfolioShare operation for external account to account or organizational type sharing.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of UpdatePortfolioShare operation. You can also obtain the operation status using DescribePortfolioShareStatus API. 
    */
  var Status: js.UndefOr[ShareStatus] = js.undefined
}
object UpdatePortfolioShareOutput {
  
  inline def apply(): UpdatePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePortfolioShareOutput]
  }
  
  extension [Self <: UpdatePortfolioShareOutput](x: Self) {
    
    inline def setPortfolioShareToken(value: Id): Self = StObject.set(x, "PortfolioShareToken", value.asInstanceOf[js.Any])
    
    inline def setPortfolioShareTokenUndefined: Self = StObject.set(x, "PortfolioShareToken", js.undefined)
    
    inline def setStatus(value: ShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
