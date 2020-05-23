package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastStateEventData extends EventData {
  var castState: CastState
}

object CastStateEventData {
  @scala.inline
  def apply(castState: CastState, `type`: String): CastStateEventData = {
    val __obj = js.Dynamic.literal(castState = castState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastStateEventData]
  }
}

