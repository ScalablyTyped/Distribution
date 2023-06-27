package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.identity
//////////////
// Identity //
//////////////
/**
  * Use the chrome.identity API to get OAuth2 access tokens.
  * @requires Permissions: 'identity'
  * @see https://developer.chrome.com/apps/app_identity
  * @since Chrome 29.
  */
object identity {
  
  /** @since Chrome 32. */
  trait AccountInfo extends StObject {
    
    /**
      * A unique identifier for the account.
      * This ID will not change for the lifetime of the account.
      */
    var id: String
  }
  object AccountInfo {
    
    inline def apply(id: String): AccountInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenDetails extends StObject {
    
    /**
      * Optional.
      * The account ID whose token should be returned.
      * If not specified, the primary account for the profile will be used.
      * account is only supported when the 'enable-new-profile-management' flag is set.
      * @since Chrome 37.
      */
    var account: js.UndefOr[AccountInfo] = js.undefined
    
    /**
      * Fetching a token may require the user to sign-in to Chrome,
      * or approve the application's requested scopes.
      * If the interactive flag is true, getAuthToken will prompt the user as necessary.
      * When the flag is false or omitted, getAuthToken will return failure any time
      * a prompt would be required.
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional.
      * A list of OAuth2 scopes to request.
      * When the scopes field is present, it overrides the list of scopes specified in manifest.json.
      * @since Chrome 37.
      */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TokenDetails {
    
    inline def apply(): TokenDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenDetails] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait TokenInformation extends StObject {
    
    /** The specific token that should be removed from the cache. */
    var token: String
  }
  object TokenInformation {
    
    inline def apply(token: String): TokenInformation = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenInformation] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserInfo extends StObject {
    
    /**
      * An email address for the user account signed into the current profile.
      * Empty if the user is not signed in or the identity.email manifest permission is not specified.
      */
    var email: String
    
    /**
      * A unique identifier for the account.
      * This ID will not change for the lifetime of the account.
      * Empty if the user is not signed in or (in M41+) the identity.email
      * manifest permission is not specified.
      */
    var id: String
  }
  object UserInfo {
    
    inline def apply(email: String, id: String): UserInfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAuthFlowOptions extends StObject {
    
    /**
      * Optional.
      * Whether to launch auth flow in interactive mode.
      * Since some auth flows may immediately redirect to a result URL, launchWebAuthFlow hides its web view until the first navigation either redirects to the final URL, or finishes loading a page meant to be displayed.
      * If the interactive flag is true, the window will be displayed when a page load completes. If the flag is false or omitted, launchWebAuthFlow will return with an error if the initial navigation does not complete the flow.
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The URL that initiates the auth flow.
      */
    var url: String
  }
  object WebAuthFlowOptions {
    
    inline def apply(url: String): WebAuthFlowOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAuthFlowOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebAuthFlowOptions] (val x: Self) extends AnyVal {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
