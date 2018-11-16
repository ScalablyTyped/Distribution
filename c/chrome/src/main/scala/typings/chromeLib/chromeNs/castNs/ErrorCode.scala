package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSGlobal("chrome.cast.ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait API_NOT_INITIALIZED
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait CANCEL
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait CHANNEL_ERROR
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait EXTENSION_MISSING
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait EXTENSION_NOT_COMPATIBLE
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait INVALID_PARAMETER
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait LOAD_MEDIA_FAILED
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait RECEIVER_UNAVAILABLE
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait SESSION_ERROR
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  @js.native
  sealed trait TIMEOUT
    extends chromeLib.chromeNs.castNs.ErrorCode
  
  /* "api_not_initialized" */ val API_NOT_INITIALIZED: API_NOT_INITIALIZED with java.lang.String = js.native
  /* "cancel" */ val CANCEL: CANCEL with java.lang.String = js.native
  /* "channel_error" */ val CHANNEL_ERROR: CHANNEL_ERROR with java.lang.String = js.native
  /* "extension_missing" */ val EXTENSION_MISSING: EXTENSION_MISSING with java.lang.String = js.native
  /* "extension_not_compatible" */ val EXTENSION_NOT_COMPATIBLE: EXTENSION_NOT_COMPATIBLE with java.lang.String = js.native
  /* "invalid_parameter" */ val INVALID_PARAMETER: INVALID_PARAMETER with java.lang.String = js.native
  /* "load_media_failed" */ val LOAD_MEDIA_FAILED: LOAD_MEDIA_FAILED with java.lang.String = js.native
  /* "receiver_unavailable" */ val RECEIVER_UNAVAILABLE: RECEIVER_UNAVAILABLE with java.lang.String = js.native
  /* "session_error" */ val SESSION_ERROR: SESSION_ERROR with java.lang.String = js.native
  /* "timeout" */ val TIMEOUT: TIMEOUT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.ErrorCode with java.lang.String] = js.native
}

