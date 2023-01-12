package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebsiteAuthorizationProviderSummary extends StObject {
  
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.undefined
  
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typings.awsSdk.clientsWorklinkMod.AuthorizationProviderType
  
  /**
    * The time of creation.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DomainName] = js.undefined
}
object WebsiteAuthorizationProviderSummary {
  
  inline def apply(AuthorizationProviderType: AuthorizationProviderType): WebsiteAuthorizationProviderSummary = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteAuthorizationProviderSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebsiteAuthorizationProviderSummary] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationProviderId(value: Id): Self = StObject.set(x, "AuthorizationProviderId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationProviderIdUndefined: Self = StObject.set(x, "AuthorizationProviderId", js.undefined)
    
    inline def setAuthorizationProviderType(value: AuthorizationProviderType): Self = StObject.set(x, "AuthorizationProviderType", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
