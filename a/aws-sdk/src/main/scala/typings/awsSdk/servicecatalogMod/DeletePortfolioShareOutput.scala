package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePortfolioShareOutput extends StObject {
  
  /**
    * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
}
object DeletePortfolioShareOutput {
  
  @scala.inline
  def apply(): DeletePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePortfolioShareOutput]
  }
  
  @scala.inline
  implicit class DeletePortfolioShareOutputMutableBuilder[Self <: DeletePortfolioShareOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortfolioShareToken(value: Id): Self = StObject.set(x, "PortfolioShareToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioShareTokenUndefined: Self = StObject.set(x, "PortfolioShareToken", js.undefined)
  }
}
