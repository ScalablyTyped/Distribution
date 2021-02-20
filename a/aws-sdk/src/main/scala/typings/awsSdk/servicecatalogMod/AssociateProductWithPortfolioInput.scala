package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateProductWithPortfolioInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  
  /**
    * The identifier of the source portfolio.
    */
  var SourcePortfolioId: js.UndefOr[Id] = js.native
}
object AssociateProductWithPortfolioInput {
  
  @scala.inline
  def apply(PortfolioId: Id, ProductId: Id): AssociateProductWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateProductWithPortfolioInput]
  }
  
  @scala.inline
  implicit class AssociateProductWithPortfolioInputMutableBuilder[Self <: AssociateProductWithPortfolioInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortfolioId(value: Id): Self = StObject.set(x, "SourcePortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortfolioIdUndefined: Self = StObject.set(x, "SourcePortfolioId", js.undefined)
  }
}
