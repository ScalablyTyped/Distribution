package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.ErrorCode & String] = js.native
  
  /* "api_not_initialized" */ val API_NOT_INITIALIZED: typings.chrome.chrome.cast.ErrorCode.API_NOT_INITIALIZED & String = js.native
  
  /* "cancel" */ val CANCEL: typings.chrome.chrome.cast.ErrorCode.CANCEL & String = js.native
  
  /* "channel_error" */ val CHANNEL_ERROR: typings.chrome.chrome.cast.ErrorCode.CHANNEL_ERROR & String = js.native
  
  /* "extension_missing" */ val EXTENSION_MISSING: typings.chrome.chrome.cast.ErrorCode.EXTENSION_MISSING & String = js.native
  
  /* "extension_not_compatible" */ val EXTENSION_NOT_COMPATIBLE: typings.chrome.chrome.cast.ErrorCode.EXTENSION_NOT_COMPATIBLE & String = js.native
  
  /* "invalid_parameter" */ val INVALID_PARAMETER: typings.chrome.chrome.cast.ErrorCode.INVALID_PARAMETER & String = js.native
  
  /* "load_media_failed" */ val LOAD_MEDIA_FAILED: typings.chrome.chrome.cast.ErrorCode.LOAD_MEDIA_FAILED & String = js.native
  
  /* "receiver_unavailable" */ val RECEIVER_UNAVAILABLE: typings.chrome.chrome.cast.ErrorCode.RECEIVER_UNAVAILABLE & String = js.native
  
  /* "session_error" */ val SESSION_ERROR: typings.chrome.chrome.cast.ErrorCode.SESSION_ERROR & String = js.native
  
  /* "timeout" */ val TIMEOUT: typings.chrome.chrome.cast.ErrorCode.TIMEOUT & String = js.native
}
