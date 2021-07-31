package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActiveInputState extends StObject
@JSGlobal("cast.framework.ActiveInputState")
@js.native
object ActiveInputState extends StObject {
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_NO
    extends StObject
       with ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_UNKNOWN
    extends StObject
       with ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_YES
    extends StObject
       with ActiveInputState
}
