package typings.cswAasJs

import typings.cswAasJs.authContextProviderMod.AuthContextConfig
import typings.keycloakJs.mod.KeycloakError
import typings.keycloakJs.mod.KeycloakInstance
import typings.keycloakJs.mod.KeycloakProfile
import typings.keycloakJs.mod.KeycloakPromise
import typings.keycloakJs.mod.KeycloakResourceAccess
import typings.keycloakJs.mod.KeycloakRoles
import typings.keycloakJs.mod.KeycloakTokenParsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("csw-aas-js/dist/components/Auth", "TMTAuth")
  @js.native
  val TMTAuth: AuthStore = js.native
  
  @js.native
  trait Auth extends StObject {
    
    def hasRealmRole(role: String): Boolean = js.native
    
    def hasResourceRole(role: String): Boolean = js.native
    def hasResourceRole(role: String, resource: String): Boolean = js.native
    
    def isAuthenticated(): js.UndefOr[Boolean] = js.native
    
    def loadUserProfile(): KeycloakPromise[KeycloakProfile, Unit] = js.native
    
    def logout(): KeycloakPromise[Unit, Unit] = js.native
    def logout(options: js.Any): KeycloakPromise[Unit, Unit] = js.native
    
    def realmAccess(): js.UndefOr[KeycloakRoles] = js.native
    
    def resourceAccess(): js.UndefOr[KeycloakResourceAccess] = js.native
    
    def token(): js.UndefOr[String] = js.native
    
    def tokenParsed(): js.UndefOr[KeycloakTokenParsed] = js.native
  }
  
  /**
    * Adapter for authentication and authorization service
    */
  @js.native
  trait AuthStore extends StObject {
    
    /**
      * Responsible for instantiating keycloak using provided config and authentication. It also creates hooks for refreshing token when
      * token is expired which silently refresh token resulting seamless user experience once logged in
      *
      * @param config json object which is UI application specific keycloak configuration e.g. realm and clientID.
      * @param url json object which contains AAS url
      * @param redirect boolean which decides instantiation mode for keycloak. e.g. login-required or check-sso.
      * login-required mode redirects user to login screen if not logged in already. check-sso only checks if already
      * logged in without redirecting to login screen if not logged in.
      * @return {{ keycloak, authenticated }} json which contains keycloak instance and authenticated which is promise after
      * initializing keycloak
      */
    def authenticate(config: AuthContextConfig, url: String, redirect: Boolean): AuthenticateResult = js.native
    
    /**
      * Create instance of TMTAuth from keycloak.
      *
      * @param keycloak keycloak instance instantiated using keyclok-js
      */
    def from(keycloak: KeycloakInstance): Auth = js.native
    
    /**
      * Responsible for resolving AAS Server using location service. If not found returns AAS-server-url specified in
      * config
      *
      * @return url string which is AAS server url
      */
    def getAASUrl(): js.Promise[String] = js.native
  }
  object AuthStore {
    
    @scala.inline
    def apply(
      authenticate: (AuthContextConfig, String, Boolean) => AuthenticateResult,
      from: KeycloakInstance => Auth,
      getAASUrl: () => js.Promise[String]
    ): AuthStore = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction3(authenticate), from = js.Any.fromFunction1(from), getAASUrl = js.Any.fromFunction0(getAASUrl))
      __obj.asInstanceOf[AuthStore]
    }
    
    @scala.inline
    implicit class AuthStoreMutableBuilder[Self <: AuthStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticate(value: (AuthContextConfig, String, Boolean) => AuthenticateResult): Self = StObject.set(x, "authenticate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFrom(value: KeycloakInstance => Auth): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAASUrl(value: () => js.Promise[String]): Self = StObject.set(x, "getAASUrl", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AuthenticateResult extends StObject {
    
    var authenticated: KeycloakPromise[Boolean, KeycloakError] = js.native
    
    var keycloak: KeycloakInstance = js.native
  }
  object AuthenticateResult {
    
    @scala.inline
    def apply(authenticated: KeycloakPromise[Boolean, KeycloakError], keycloak: KeycloakInstance): AuthenticateResult = {
      val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], keycloak = keycloak.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateResult]
    }
    
    @scala.inline
    implicit class AuthenticateResultMutableBuilder[Self <: AuthenticateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticated(value: KeycloakPromise[Boolean, KeycloakError]): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeycloak(value: KeycloakInstance): Self = StObject.set(x, "keycloak", value.asInstanceOf[js.Any])
    }
  }
}
