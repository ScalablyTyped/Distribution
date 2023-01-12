package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlProperties extends StObject {
  
  /**
    * The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is redirected to the user access URL from the WorkSpaces client application, this relay state parameter name is appended as a query parameter to the URL along with the relay state endpoint to return the user to the client application session. To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the relay state URL. Consult your IdP documentation for more information.
    */
  var RelayStateParameterName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates the status of SAML 2.0 authentication. These statuses include the following.   If the setting is DISABLED, end users will be directed to login with their directory credentials.   If the setting is ENABLED, end users will be directed to login via the user access URL. Users attempting to connect to WorkSpaces from a client application that does not support SAML 2.0 authentication will not be able to connect.   If the setting is ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK, end users will be directed to login via the user access URL on supported client applications, but will not prevent clients that do not support SAML 2.0 authentication from connecting as if SAML 2.0 authentication was disabled.  
    */
  var Status: js.UndefOr[SamlStatusEnum] = js.undefined
  
  /**
    * The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web browser in order to federate from the IdP and directly access the application, without any SAML 2.0 service provider (SP) bindings.
    */
  var UserAccessUrl: js.UndefOr[SamlUserAccessUrl] = js.undefined
}
object SamlProperties {
  
  inline def apply(): SamlProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamlProperties] (val x: Self) extends AnyVal {
    
    inline def setRelayStateParameterName(value: NonEmptyString): Self = StObject.set(x, "RelayStateParameterName", value.asInstanceOf[js.Any])
    
    inline def setRelayStateParameterNameUndefined: Self = StObject.set(x, "RelayStateParameterName", js.undefined)
    
    inline def setStatus(value: SamlStatusEnum): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserAccessUrl(value: SamlUserAccessUrl): Self = StObject.set(x, "UserAccessUrl", value.asInstanceOf[js.Any])
    
    inline def setUserAccessUrlUndefined: Self = StObject.set(x, "UserAccessUrl", js.undefined)
  }
}
