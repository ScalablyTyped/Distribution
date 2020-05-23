package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastContextEventType extends js.Object

@JSGlobal("cast.framework.CastContextEventType")
@js.native
object CastContextEventType extends js.Object {
  @js.native
  sealed trait CAST_STATE_CHANGED extends CastContextEventType
  
  @js.native
  sealed trait SESSION_STATE_CHANGED extends CastContextEventType
  
}

