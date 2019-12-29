package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
  /* "api_not_initialized" */ @js.native
  object API_NOT_INITIALIZED extends TopLevel[API_NOT_INITIALIZED with String]
  
  /* "cancel" */ @js.native
  object CANCEL extends TopLevel[CANCEL with String]
  
  /* "channel_error" */ @js.native
  object CHANNEL_ERROR extends TopLevel[CHANNEL_ERROR with String]
  
  /* "extension_missing" */ @js.native
  object EXTENSION_MISSING extends TopLevel[EXTENSION_MISSING with String]
  
  /* "extension_not_compatible" */ @js.native
  object EXTENSION_NOT_COMPATIBLE extends TopLevel[EXTENSION_NOT_COMPATIBLE with String]
  
  /* "invalid_parameter" */ @js.native
  object INVALID_PARAMETER extends TopLevel[INVALID_PARAMETER with String]
  
  /* "load_media_failed" */ @js.native
  object LOAD_MEDIA_FAILED extends TopLevel[LOAD_MEDIA_FAILED with String]
  
  /* "receiver_unavailable" */ @js.native
  object RECEIVER_UNAVAILABLE extends TopLevel[RECEIVER_UNAVAILABLE with String]
  
  /* "session_error" */ @js.native
  object SESSION_ERROR extends TopLevel[SESSION_ERROR with String]
  
  /* "timeout" */ @js.native
  object TIMEOUT extends TopLevel[TIMEOUT with String]
  
}

