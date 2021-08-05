package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortfolioShareInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The AWS account ID. For example, 123456789012.
    */
  var AccountId: js.UndefOr[typings.awsSdk.servicecatalogMod.AccountId] = js.undefined
  
  /**
    * The organization node to whom you are going to share. If OrganizationNode is passed in, PortfolioShare will be created for the node an ListOrganizationPortfolioAccessd its children (when applies), and a PortfolioShareToken will be returned in the output in order for the administrator to monitor the status of the PortfolioShare creation process.
    */
  var OrganizationNode: js.UndefOr[typings.awsSdk.servicecatalogMod.OrganizationNode] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
}
object CreatePortfolioShareInput {
  
  inline def apply(PortfolioId: Id): CreatePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortfolioShareInput]
  }
  
  extension [Self <: CreatePortfolioShareInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setOrganizationNode(value: OrganizationNode): Self = StObject.set(x, "OrganizationNode", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNodeUndefined: Self = StObject.set(x, "OrganizationNode", js.undefined)
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
  }
}
