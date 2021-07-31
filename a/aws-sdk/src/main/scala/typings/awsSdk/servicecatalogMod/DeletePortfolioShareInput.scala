package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePortfolioShareInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The AWS account ID.
    */
  var AccountId: js.UndefOr[typings.awsSdk.servicecatalogMod.AccountId] = js.undefined
  
  /**
    * The organization node to whom you are going to stop sharing.
    */
  var OrganizationNode: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNode] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
}
object DeletePortfolioShareInput {
  
  @scala.inline
  def apply(PortfolioId: Id): DeletePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortfolioShareInput]
  }
  
  @scala.inline
  implicit class DeletePortfolioShareInputMutableBuilder[Self <: DeletePortfolioShareInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setOrganizationNode(value: OrganizationNode): Self = StObject.set(x, "OrganizationNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationNodeUndefined: Self = StObject.set(x, "OrganizationNode", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
  }
}
