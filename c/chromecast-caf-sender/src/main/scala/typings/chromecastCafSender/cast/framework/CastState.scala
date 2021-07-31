package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CastState extends StObject
@JSGlobal("cast.framework.CastState")
@js.native
object CastState extends StObject {
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with CastState
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with CastState
  
  @js.native
  sealed trait NOT_CONNECTED
    extends StObject
       with CastState
  
  @js.native
  sealed trait NO_DEVICES_AVAILABLE
    extends StObject
       with CastState
}
