package typings.chrome.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSGlobal("chrome.cast.ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait API_NOT_INITIALIZED extends ErrorCode
  
  @js.native
  sealed trait CANCEL extends ErrorCode
  
  @js.native
  sealed trait CHANNEL_ERROR extends ErrorCode
  
  @js.native
  sealed trait EXTENSION_MISSING extends ErrorCode
  
  @js.native
  sealed trait EXTENSION_NOT_COMPATIBLE extends ErrorCode
  
  @js.native
  sealed trait INVALID_PARAMETER extends ErrorCode
  
  @js.native
  sealed trait LOAD_MEDIA_FAILED extends ErrorCode
  
  @js.native
  sealed trait RECEIVER_UNAVAILABLE extends ErrorCode
  
  @js.native
  sealed trait SESSION_ERROR extends ErrorCode
  
  @js.native
  sealed trait TIMEOUT extends ErrorCode
  
  /* "api_not_initialized" */ val API_NOT_INITIALIZED: typings.chrome.chromeNs.castNs.ErrorCode.API_NOT_INITIALIZED with String = js.native
  /* "cancel" */ val CANCEL: typings.chrome.chromeNs.castNs.ErrorCode.CANCEL with String = js.native
  /* "channel_error" */ val CHANNEL_ERROR: typings.chrome.chromeNs.castNs.ErrorCode.CHANNEL_ERROR with String = js.native
  /* "extension_missing" */ val EXTENSION_MISSING: typings.chrome.chromeNs.castNs.ErrorCode.EXTENSION_MISSING with String = js.native
  /* "extension_not_compatible" */ val EXTENSION_NOT_COMPATIBLE: typings.chrome.chromeNs.castNs.ErrorCode.EXTENSION_NOT_COMPATIBLE with String = js.native
  /* "invalid_parameter" */ val INVALID_PARAMETER: typings.chrome.chromeNs.castNs.ErrorCode.INVALID_PARAMETER with String = js.native
  /* "load_media_failed" */ val LOAD_MEDIA_FAILED: typings.chrome.chromeNs.castNs.ErrorCode.LOAD_MEDIA_FAILED with String = js.native
  /* "receiver_unavailable" */ val RECEIVER_UNAVAILABLE: typings.chrome.chromeNs.castNs.ErrorCode.RECEIVER_UNAVAILABLE with String = js.native
  /* "session_error" */ val SESSION_ERROR: typings.chrome.chromeNs.castNs.ErrorCode.SESSION_ERROR with String = js.native
  /* "timeout" */ val TIMEOUT: typings.chrome.chromeNs.castNs.ErrorCode.TIMEOUT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
}

