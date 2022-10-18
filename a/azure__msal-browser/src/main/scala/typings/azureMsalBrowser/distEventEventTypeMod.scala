package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventEventTypeMod {
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("@azure/msal-browser/dist/event/EventType", "EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType & String] = js.native
    
    @js.native
    sealed trait ACCOUNT_ADDED
      extends StObject
         with EventType
    /* "msal:accountAdded" */ val ACCOUNT_ADDED: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACCOUNT_ADDED & String = js.native
    
    @js.native
    sealed trait ACCOUNT_REMOVED
      extends StObject
         with EventType
    /* "msal:accountRemoved" */ val ACCOUNT_REMOVED: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACCOUNT_REMOVED & String = js.native
    
    @js.native
    sealed trait ACQUIRE_TOKEN_BY_CODE_FAILURE
      extends StObject
         with EventType
    /* "msal:acquireTokenByCodeFailure" */ val ACQUIRE_TOKEN_BY_CODE_FAILURE: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACQUIRE_TOKEN_BY_CODE_FAILURE & String = js.native
    
    @js.native
    sealed trait ACQUIRE_TOKEN_BY_CODE_START
      extends StObject
         with EventType
    /* "msal:acquireTokenByCodeStart" */ val ACQUIRE_TOKEN_BY_CODE_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACQUIRE_TOKEN_BY_CODE_START & String = js.native
    
    @js.native
    sealed trait ACQUIRE_TOKEN_BY_CODE_SUCCESS
      extends StObject
         with EventType
    /* "msal:acquireTokenByCodeSuccess" */ val ACQUIRE_TOKEN_BY_CODE_SUCCESS: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACQUIRE_TOKEN_BY_CODE_SUCCESS & String = js.native
    
    @js.native
    sealed trait ACQUIRE_TOKEN_FAILURE
      extends StObject
         with EventType
    /* "msal:acquireTokenFailure" */ val ACQUIRE_TOKEN_FAILURE: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACQUIRE_TOKEN_FAILURE & String = js.native
    
    @js.native
    sealed trait ACQUIRE_TOKEN_NETWORK_START
      extends StObject
         with EventType
    /* "msal:acquireTokenFromNetworkStart" */ val ACQUIRE_TOKEN_NETWORK_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACQUIRE_TOKEN_NETWORK_START & String = js.native
    
    @js.native
    sealed trait ACQUIRE_TOKEN_START
      extends StObject
         with EventType
    /* "msal:acquireTokenStart" */ val ACQUIRE_TOKEN_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACQUIRE_TOKEN_START & String = js.native
    
    @js.native
    sealed trait ACQUIRE_TOKEN_SUCCESS
      extends StObject
         with EventType
    /* "msal:acquireTokenSuccess" */ val ACQUIRE_TOKEN_SUCCESS: typings.azureMsalBrowser.distEventEventTypeMod.EventType.ACQUIRE_TOKEN_SUCCESS & String = js.native
    
    @js.native
    sealed trait HANDLE_REDIRECT_END
      extends StObject
         with EventType
    /* "msal:handleRedirectEnd" */ val HANDLE_REDIRECT_END: typings.azureMsalBrowser.distEventEventTypeMod.EventType.HANDLE_REDIRECT_END & String = js.native
    
    @js.native
    sealed trait HANDLE_REDIRECT_START
      extends StObject
         with EventType
    /* "msal:handleRedirectStart" */ val HANDLE_REDIRECT_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.HANDLE_REDIRECT_START & String = js.native
    
    @js.native
    sealed trait INITIALIZE_END
      extends StObject
         with EventType
    /* "msal:initializeEnd" */ val INITIALIZE_END: typings.azureMsalBrowser.distEventEventTypeMod.EventType.INITIALIZE_END & String = js.native
    
    @js.native
    sealed trait INITIALIZE_START
      extends StObject
         with EventType
    /* "msal:initializeStart" */ val INITIALIZE_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.INITIALIZE_START & String = js.native
    
    @js.native
    sealed trait LOGIN_FAILURE
      extends StObject
         with EventType
    /* "msal:loginFailure" */ val LOGIN_FAILURE: typings.azureMsalBrowser.distEventEventTypeMod.EventType.LOGIN_FAILURE & String = js.native
    
    @js.native
    sealed trait LOGIN_START
      extends StObject
         with EventType
    /* "msal:loginStart" */ val LOGIN_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.LOGIN_START & String = js.native
    
    @js.native
    sealed trait LOGIN_SUCCESS
      extends StObject
         with EventType
    /* "msal:loginSuccess" */ val LOGIN_SUCCESS: typings.azureMsalBrowser.distEventEventTypeMod.EventType.LOGIN_SUCCESS & String = js.native
    
    @js.native
    sealed trait LOGOUT_END
      extends StObject
         with EventType
    /* "msal:logoutEnd" */ val LOGOUT_END: typings.azureMsalBrowser.distEventEventTypeMod.EventType.LOGOUT_END & String = js.native
    
    @js.native
    sealed trait LOGOUT_FAILURE
      extends StObject
         with EventType
    /* "msal:logoutFailure" */ val LOGOUT_FAILURE: typings.azureMsalBrowser.distEventEventTypeMod.EventType.LOGOUT_FAILURE & String = js.native
    
    @js.native
    sealed trait LOGOUT_START
      extends StObject
         with EventType
    /* "msal:logoutStart" */ val LOGOUT_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.LOGOUT_START & String = js.native
    
    @js.native
    sealed trait LOGOUT_SUCCESS
      extends StObject
         with EventType
    /* "msal:logoutSuccess" */ val LOGOUT_SUCCESS: typings.azureMsalBrowser.distEventEventTypeMod.EventType.LOGOUT_SUCCESS & String = js.native
    
    @js.native
    sealed trait POPUP_OPENED
      extends StObject
         with EventType
    /* "msal:popupOpened" */ val POPUP_OPENED: typings.azureMsalBrowser.distEventEventTypeMod.EventType.POPUP_OPENED & String = js.native
    
    @js.native
    sealed trait SSO_SILENT_FAILURE
      extends StObject
         with EventType
    /* "msal:ssoSilentFailure" */ val SSO_SILENT_FAILURE: typings.azureMsalBrowser.distEventEventTypeMod.EventType.SSO_SILENT_FAILURE & String = js.native
    
    @js.native
    sealed trait SSO_SILENT_START
      extends StObject
         with EventType
    /* "msal:ssoSilentStart" */ val SSO_SILENT_START: typings.azureMsalBrowser.distEventEventTypeMod.EventType.SSO_SILENT_START & String = js.native
    
    @js.native
    sealed trait SSO_SILENT_SUCCESS
      extends StObject
         with EventType
    /* "msal:ssoSilentSuccess" */ val SSO_SILENT_SUCCESS: typings.azureMsalBrowser.distEventEventTypeMod.EventType.SSO_SILENT_SUCCESS & String = js.native
  }
}
