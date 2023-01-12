package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationSummary extends StObject {
  
  /**
    * The alias associated with the organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.undefined
  
  /**
    * The default email domain associated with the organization.
    */
  var DefaultMailDomain: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The error message associated with the organization. It is only present if unexpected behavior has occurred with regards to the organization. It provides insight or solutions regarding unexpected behavior.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier associated with the organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.OrganizationId] = js.undefined
  
  /**
    * The state associated with the organization.
    */
  var State: js.UndefOr[String] = js.undefined
}
object OrganizationSummary {
  
  inline def apply(): OrganizationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationSummary] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: OrganizationName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setDefaultMailDomain(value: DomainName): Self = StObject.set(x, "DefaultMailDomain", value.asInstanceOf[js.Any])
    
    inline def setDefaultMailDomainUndefined: Self = StObject.set(x, "DefaultMailDomain", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
