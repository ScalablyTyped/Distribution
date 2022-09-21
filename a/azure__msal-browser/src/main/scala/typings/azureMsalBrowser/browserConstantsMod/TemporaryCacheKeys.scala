package typings.azureMsalBrowser.browserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TemporaryCacheKeys extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "TemporaryCacheKeys")
@js.native
object TemporaryCacheKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TemporaryCacheKeys & String] = js.native
  
  @js.native
  sealed trait ACQUIRE_TOKEN_ACCOUNT
    extends StObject
       with TemporaryCacheKeys
  /* "acquireToken.account" */ val ACQUIRE_TOKEN_ACCOUNT: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.ACQUIRE_TOKEN_ACCOUNT & String = js.native
  
  @js.native
  sealed trait AUTHORITY
    extends StObject
       with TemporaryCacheKeys
  /* "authority" */ val AUTHORITY: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.AUTHORITY & String = js.native
  
  @js.native
  sealed trait CCS_CREDENTIAL
    extends StObject
       with TemporaryCacheKeys
  /* "ccs.credential" */ val CCS_CREDENTIAL: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.CCS_CREDENTIAL & String = js.native
  
  @js.native
  sealed trait CORRELATION_ID
    extends StObject
       with TemporaryCacheKeys
  /* "request.correlationId" */ val CORRELATION_ID: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.CORRELATION_ID & String = js.native
  
  @js.native
  sealed trait INTERACTION_STATUS_KEY
    extends StObject
       with TemporaryCacheKeys
  /* "interaction.status" */ val INTERACTION_STATUS_KEY: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.INTERACTION_STATUS_KEY & String = js.native
  
  @js.native
  sealed trait NATIVE_REQUEST
    extends StObject
       with TemporaryCacheKeys
  /* "request.native" */ val NATIVE_REQUEST: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.NATIVE_REQUEST & String = js.native
  
  @js.native
  sealed trait NONCE_IDTOKEN
    extends StObject
       with TemporaryCacheKeys
  /* "nonce.id_token" */ val NONCE_IDTOKEN: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.NONCE_IDTOKEN & String = js.native
  
  @js.native
  sealed trait ORIGIN_URI
    extends StObject
       with TemporaryCacheKeys
  /* "request.origin" */ val ORIGIN_URI: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.ORIGIN_URI & String = js.native
  
  @js.native
  sealed trait RENEW_STATUS
    extends StObject
       with TemporaryCacheKeys
  /* "token.renew.status" */ val RENEW_STATUS: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.RENEW_STATUS & String = js.native
  
  @js.native
  sealed trait REQUEST_PARAMS
    extends StObject
       with TemporaryCacheKeys
  /* "request.params" */ val REQUEST_PARAMS: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.REQUEST_PARAMS & String = js.native
  
  @js.native
  sealed trait REQUEST_STATE
    extends StObject
       with TemporaryCacheKeys
  /* "request.state" */ val REQUEST_STATE: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.REQUEST_STATE & String = js.native
  
  @js.native
  sealed trait SCOPES
    extends StObject
       with TemporaryCacheKeys
  /* "scopes" */ val SCOPES: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.SCOPES & String = js.native
  
  @js.native
  sealed trait SESSION_STATE
    extends StObject
       with TemporaryCacheKeys
  /* "session.state" */ val SESSION_STATE: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.SESSION_STATE & String = js.native
  
  @js.native
  sealed trait URL_HASH
    extends StObject
       with TemporaryCacheKeys
  /* "urlHash" */ val URL_HASH: typings.azureMsalBrowser.browserConstantsMod.TemporaryCacheKeys.URL_HASH & String = js.native
}
