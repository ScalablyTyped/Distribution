package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSGlobal("chrome.cast.ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @js.native
  sealed trait API_NOT_INITIALIZED
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait CANCEL
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait CHANNEL_ERROR
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait EXTENSION_MISSING
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait EXTENSION_NOT_COMPATIBLE
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait INVALID_PARAMETER
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait LOAD_MEDIA_FAILED
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait RECEIVER_UNAVAILABLE
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait SESSION_ERROR
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait TIMEOUT
    extends StObject
       with ErrorCode
}
