package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptPortfolioShareInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  
  /**
    * The type of shared portfolios to accept. The default is to accept imported portfolios.    AWS_ORGANIZATIONS - Accept portfolios shared by the management account of your organization.    IMPORTED - Accept imported portfolios.    AWS_SERVICECATALOG - Not supported. (Throws ResourceNotFoundException.)   For example, aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS 
    */
  var PortfolioShareType: js.UndefOr[typings.awsSdk.servicecatalogMod.PortfolioShareType] = js.native
}
object AcceptPortfolioShareInput {
  
  @scala.inline
  def apply(PortfolioId: Id): AcceptPortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptPortfolioShareInput]
  }
  
  @scala.inline
  implicit class AcceptPortfolioShareInputMutableBuilder[Self <: AcceptPortfolioShareInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioShareType(value: PortfolioShareType): Self = StObject.set(x, "PortfolioShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioShareTypeUndefined: Self = StObject.set(x, "PortfolioShareType", js.undefined)
  }
}
