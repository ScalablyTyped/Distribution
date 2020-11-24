package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CastState extends js.Object
@JSGlobal("cast.framework.CastState")
@js.native
object CastState extends js.Object {
  
  @js.native
  sealed trait CONNECTED extends CastState
  
  @js.native
  sealed trait CONNECTING extends CastState
  
  @js.native
  sealed trait NOT_CONNECTED extends CastState
  
  @js.native
  sealed trait NO_DEVICES_AVAILABLE extends CastState
}
