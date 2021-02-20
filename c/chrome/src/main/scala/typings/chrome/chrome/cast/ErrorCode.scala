package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSGlobal("chrome.cast.ErrorCode")
@js.native
object ErrorCode extends StObject {
  
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
}
