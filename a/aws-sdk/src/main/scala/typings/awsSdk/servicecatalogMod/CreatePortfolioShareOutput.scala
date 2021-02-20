package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePortfolioShareOutput extends StObject {
  
  /**
    * The portfolio shares a unique identifier that only returns if the portfolio is shared to an organization node.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
}
object CreatePortfolioShareOutput {
  
  @scala.inline
  def apply(): CreatePortfolioShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePortfolioShareOutput]
  }
  
  @scala.inline
  implicit class CreatePortfolioShareOutputMutableBuilder[Self <: CreatePortfolioShareOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortfolioShareToken(value: Id): Self = StObject.set(x, "PortfolioShareToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioShareTokenUndefined: Self = StObject.set(x, "PortfolioShareToken", js.undefined)
  }
}
