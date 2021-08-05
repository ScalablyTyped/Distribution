package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePortfolioShareOutput extends StObject {
  
  /**
    * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.undefined
}
object DeletePortfolioShareOutput {
  
  inline def apply(): DeletePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePortfolioShareOutput]
  }
  
  extension [Self <: DeletePortfolioShareOutput](x: Self) {
    
    inline def setPortfolioShareToken(value: Id): Self = StObject.set(x, "PortfolioShareToken", value.asInstanceOf[js.Any])
    
    inline def setPortfolioShareTokenUndefined: Self = StObject.set(x, "PortfolioShareToken", js.undefined)
  }
}
