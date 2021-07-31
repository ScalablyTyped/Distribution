package typings.awsSdk.worklinkMod

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
  var AuthorizationProviderType: typings.awsSdk.worklinkMod.AuthorizationProviderType
  
  /**
    * The time of creation.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typings.awsSdk.worklinkMod.DomainName] = js.undefined
}
object WebsiteAuthorizationProviderSummary {
  
  @scala.inline
  def apply(AuthorizationProviderType: AuthorizationProviderType): WebsiteAuthorizationProviderSummary = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteAuthorizationProviderSummary]
  }
  
  @scala.inline
  implicit class WebsiteAuthorizationProviderSummaryMutableBuilder[Self <: WebsiteAuthorizationProviderSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationProviderId(value: Id): Self = StObject.set(x, "AuthorizationProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationProviderIdUndefined: Self = StObject.set(x, "AuthorizationProviderId", js.undefined)
    
    @scala.inline
    def setAuthorizationProviderType(value: AuthorizationProviderType): Self = StObject.set(x, "AuthorizationProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
