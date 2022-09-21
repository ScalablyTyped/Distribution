package typings.azureMsalCommon.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AADServerParamKeys extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "AADServerParamKeys")
@js.native
object AADServerParamKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AADServerParamKeys & String] = js.native
  
  @js.native
  sealed trait ACCESS_TOKEN
    extends StObject
       with AADServerParamKeys
  /* "access_token" */ val ACCESS_TOKEN: typings.azureMsalCommon.constantsMod.AADServerParamKeys.ACCESS_TOKEN & String = js.native
  
  @js.native
  sealed trait CCS_HEADER
    extends StObject
       with AADServerParamKeys
  /* "X-AnchorMailbox" */ val CCS_HEADER: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CCS_HEADER & String = js.native
  
  @js.native
  sealed trait CLAIMS
    extends StObject
       with AADServerParamKeys
  /* "claims" */ val CLAIMS: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CLAIMS & String = js.native
  
  @js.native
  sealed trait CLIENT_ASSERTION
    extends StObject
       with AADServerParamKeys
  /* "client_assertion" */ val CLIENT_ASSERTION: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CLIENT_ASSERTION & String = js.native
  
  @js.native
  sealed trait CLIENT_ASSERTION_TYPE
    extends StObject
       with AADServerParamKeys
  /* "client_assertion_type" */ val CLIENT_ASSERTION_TYPE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CLIENT_ASSERTION_TYPE & String = js.native
  
  @js.native
  sealed trait CLIENT_ID
    extends StObject
       with AADServerParamKeys
  /* "client_id" */ val CLIENT_ID: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CLIENT_ID & String = js.native
  
  @js.native
  sealed trait CLIENT_INFO
    extends StObject
       with AADServerParamKeys
  /* "client_info" */ val CLIENT_INFO: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CLIENT_INFO & String = js.native
  
  @js.native
  sealed trait CLIENT_REQUEST_ID
    extends StObject
       with AADServerParamKeys
  /* "client-request-id" */ val CLIENT_REQUEST_ID: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CLIENT_REQUEST_ID & String = js.native
  
  @js.native
  sealed trait CLIENT_SECRET
    extends StObject
       with AADServerParamKeys
  /* "client_secret" */ val CLIENT_SECRET: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CLIENT_SECRET & String = js.native
  
  @js.native
  sealed trait CODE
    extends StObject
       with AADServerParamKeys
  /* "code" */ val CODE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CODE & String = js.native
  
  @js.native
  sealed trait CODE_CHALLENGE
    extends StObject
       with AADServerParamKeys
  /* "code_challenge" */ val CODE_CHALLENGE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CODE_CHALLENGE & String = js.native
  
  @js.native
  sealed trait CODE_CHALLENGE_METHOD
    extends StObject
       with AADServerParamKeys
  /* "code_challenge_method" */ val CODE_CHALLENGE_METHOD: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CODE_CHALLENGE_METHOD & String = js.native
  
  @js.native
  sealed trait CODE_VERIFIER
    extends StObject
       with AADServerParamKeys
  /* "code_verifier" */ val CODE_VERIFIER: typings.azureMsalCommon.constantsMod.AADServerParamKeys.CODE_VERIFIER & String = js.native
  
  @js.native
  sealed trait DEVICE_CODE
    extends StObject
       with AADServerParamKeys
  /* "device_code" */ val DEVICE_CODE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.DEVICE_CODE & String = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with AADServerParamKeys
  /* "error" */ val ERROR: typings.azureMsalCommon.constantsMod.AADServerParamKeys.ERROR & String = js.native
  
  @js.native
  sealed trait ERROR_DESCRIPTION
    extends StObject
       with AADServerParamKeys
  /* "error_description" */ val ERROR_DESCRIPTION: typings.azureMsalCommon.constantsMod.AADServerParamKeys.ERROR_DESCRIPTION & String = js.native
  
  @js.native
  sealed trait EXPIRES_IN
    extends StObject
       with AADServerParamKeys
  /* "expires_in" */ val EXPIRES_IN: typings.azureMsalCommon.constantsMod.AADServerParamKeys.EXPIRES_IN & String = js.native
  
  @js.native
  sealed trait FOCI
    extends StObject
       with AADServerParamKeys
  /* "foci" */ val FOCI: typings.azureMsalCommon.constantsMod.AADServerParamKeys.FOCI & String = js.native
  
  @js.native
  sealed trait GRANT_TYPE
    extends StObject
       with AADServerParamKeys
  /* "grant_type" */ val GRANT_TYPE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.GRANT_TYPE & String = js.native
  
  @js.native
  sealed trait ID_TOKEN
    extends StObject
       with AADServerParamKeys
  /* "id_token" */ val ID_TOKEN: typings.azureMsalCommon.constantsMod.AADServerParamKeys.ID_TOKEN & String = js.native
  
  @js.native
  sealed trait ID_TOKEN_HINT
    extends StObject
       with AADServerParamKeys
  /* "id_token_hint" */ val ID_TOKEN_HINT: typings.azureMsalCommon.constantsMod.AADServerParamKeys.ID_TOKEN_HINT & String = js.native
  
  @js.native
  sealed trait LOGOUT_HINT
    extends StObject
       with AADServerParamKeys
  /* "logout_hint" */ val LOGOUT_HINT: typings.azureMsalCommon.constantsMod.AADServerParamKeys.LOGOUT_HINT & String = js.native
  
  @js.native
  sealed trait NATIVE_BROKER
    extends StObject
       with AADServerParamKeys
  /* "nativebroker" */ val NATIVE_BROKER: typings.azureMsalCommon.constantsMod.AADServerParamKeys.NATIVE_BROKER & String = js.native
  
  @js.native
  sealed trait NONCE
    extends StObject
       with AADServerParamKeys
  /* "nonce" */ val NONCE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.NONCE & String = js.native
  
  @js.native
  sealed trait OBO_ASSERTION
    extends StObject
       with AADServerParamKeys
  /* "assertion" */ val OBO_ASSERTION: typings.azureMsalCommon.constantsMod.AADServerParamKeys.OBO_ASSERTION & String = js.native
  
  @js.native
  sealed trait ON_BEHALF_OF
    extends StObject
       with AADServerParamKeys
  /* "on_behalf_of" */ val ON_BEHALF_OF: typings.azureMsalCommon.constantsMod.AADServerParamKeys.ON_BEHALF_OF & String = js.native
  
  @js.native
  sealed trait POST_LOGOUT_URI
    extends StObject
       with AADServerParamKeys
  /* "post_logout_redirect_uri" */ val POST_LOGOUT_URI: typings.azureMsalCommon.constantsMod.AADServerParamKeys.POST_LOGOUT_URI & String = js.native
  
  @js.native
  sealed trait PROMPT
    extends StObject
       with AADServerParamKeys
  /* "prompt" */ val PROMPT: typings.azureMsalCommon.constantsMod.AADServerParamKeys.PROMPT & String = js.native
  
  @js.native
  sealed trait REDIRECT_URI
    extends StObject
       with AADServerParamKeys
  /* "redirect_uri" */ val REDIRECT_URI: typings.azureMsalCommon.constantsMod.AADServerParamKeys.REDIRECT_URI & String = js.native
  
  @js.native
  sealed trait REFRESH_TOKEN
    extends StObject
       with AADServerParamKeys
  /* "refresh_token" */ val REFRESH_TOKEN: typings.azureMsalCommon.constantsMod.AADServerParamKeys.REFRESH_TOKEN & String = js.native
  
  @js.native
  sealed trait REQUESTED_TOKEN_USE
    extends StObject
       with AADServerParamKeys
  /* "requested_token_use" */ val REQUESTED_TOKEN_USE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.REQUESTED_TOKEN_USE & String = js.native
  
  @js.native
  sealed trait REQ_CNF
    extends StObject
       with AADServerParamKeys
  /* "req_cnf" */ val REQ_CNF: typings.azureMsalCommon.constantsMod.AADServerParamKeys.REQ_CNF & String = js.native
  
  @js.native
  sealed trait RESPONSE_MODE
    extends StObject
       with AADServerParamKeys
  /* "response_mode" */ val RESPONSE_MODE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.RESPONSE_MODE & String = js.native
  
  @js.native
  sealed trait RESPONSE_TYPE
    extends StObject
       with AADServerParamKeys
  /* "response_type" */ val RESPONSE_TYPE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.RESPONSE_TYPE & String = js.native
  
  @js.native
  sealed trait RETURN_SPA_CODE
    extends StObject
       with AADServerParamKeys
  /* "return_spa_code" */ val RETURN_SPA_CODE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.RETURN_SPA_CODE & String = js.native
  
  @js.native
  sealed trait SCOPE
    extends StObject
       with AADServerParamKeys
  /* "scope" */ val SCOPE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.SCOPE & String = js.native
  
  @js.native
  sealed trait SESSION_STATE
    extends StObject
       with AADServerParamKeys
  /* "session_state" */ val SESSION_STATE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.SESSION_STATE & String = js.native
  
  @js.native
  sealed trait STATE
    extends StObject
       with AADServerParamKeys
  /* "state" */ val STATE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.STATE & String = js.native
  
  @js.native
  sealed trait TOKEN_TYPE
    extends StObject
       with AADServerParamKeys
  /* "token_type" */ val TOKEN_TYPE: typings.azureMsalCommon.constantsMod.AADServerParamKeys.TOKEN_TYPE & String = js.native
  
  @js.native
  sealed trait X_APP_NAME
    extends StObject
       with AADServerParamKeys
  /* "x-app-name" */ val X_APP_NAME: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_APP_NAME & String = js.native
  
  @js.native
  sealed trait X_APP_VER
    extends StObject
       with AADServerParamKeys
  /* "x-app-ver" */ val X_APP_VER: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_APP_VER & String = js.native
  
  @js.native
  sealed trait X_CLIENT_CPU
    extends StObject
       with AADServerParamKeys
  /* "x-client-CPU" */ val X_CLIENT_CPU: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_CLIENT_CPU & String = js.native
  
  @js.native
  sealed trait X_CLIENT_CURR_TELEM
    extends StObject
       with AADServerParamKeys
  /* "x-client-current-telemetry" */ val X_CLIENT_CURR_TELEM: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_CLIENT_CURR_TELEM & String = js.native
  
  @js.native
  sealed trait X_CLIENT_LAST_TELEM
    extends StObject
       with AADServerParamKeys
  /* "x-client-last-telemetry" */ val X_CLIENT_LAST_TELEM: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_CLIENT_LAST_TELEM & String = js.native
  
  @js.native
  sealed trait X_CLIENT_OS
    extends StObject
       with AADServerParamKeys
  /* "x-client-OS" */ val X_CLIENT_OS: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_CLIENT_OS & String = js.native
  
  @js.native
  sealed trait X_CLIENT_SKU
    extends StObject
       with AADServerParamKeys
  /* "x-client-SKU" */ val X_CLIENT_SKU: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_CLIENT_SKU & String = js.native
  
  @js.native
  sealed trait X_CLIENT_VER
    extends StObject
       with AADServerParamKeys
  /* "x-client-VER" */ val X_CLIENT_VER: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_CLIENT_VER & String = js.native
  
  @js.native
  sealed trait X_MS_LIB_CAPABILITY
    extends StObject
       with AADServerParamKeys
  /* "x-ms-lib-capability" */ val X_MS_LIB_CAPABILITY: typings.azureMsalCommon.constantsMod.AADServerParamKeys.X_MS_LIB_CAPABILITY & String = js.native
}
