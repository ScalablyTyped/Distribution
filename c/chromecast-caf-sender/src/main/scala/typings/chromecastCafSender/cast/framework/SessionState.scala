package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionState extends StObject
@JSGlobal("cast.framework.SessionState")
@js.native
object SessionState extends StObject {
  
  @js.native
  sealed trait NO_SESSION
    extends StObject
       with SessionState
  
  @js.native
  sealed trait SESSION_ENDED
    extends StObject
       with SessionState
  
  @js.native
  sealed trait SESSION_ENDING
    extends StObject
       with SessionState
  
  @js.native
  sealed trait SESSION_RESUMED
    extends StObject
       with SessionState
  
  @js.native
  sealed trait SESSION_STARTED
    extends StObject
       with SessionState
  
  @js.native
  sealed trait SESSION_STARTING
    extends StObject
       with SessionState
  
  @js.native
  sealed trait SESSION_START_FAILED
    extends StObject
       with SessionState
}
