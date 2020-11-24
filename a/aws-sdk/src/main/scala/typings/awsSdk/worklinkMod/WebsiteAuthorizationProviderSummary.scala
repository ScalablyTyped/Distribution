package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsiteAuthorizationProviderSummary extends js.Object {
  
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.native
  
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typings.awsSdk.worklinkMod.AuthorizationProviderType = js.native
  
  /**
    * The time of creation.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typings.awsSdk.worklinkMod.DomainName] = js.native
}
object WebsiteAuthorizationProviderSummary {
  
  @scala.inline
  def apply(AuthorizationProviderType: AuthorizationProviderType): WebsiteAuthorizationProviderSummary = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteAuthorizationProviderSummary]
  }
  
  @scala.inline
  implicit class WebsiteAuthorizationProviderSummaryOps[Self <: WebsiteAuthorizationProviderSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizationProviderType(value: AuthorizationProviderType): Self = this.set("AuthorizationProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationProviderId(value: Id): Self = this.set("AuthorizationProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationProviderId: Self = this.set("AuthorizationProviderId", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
  }
}
