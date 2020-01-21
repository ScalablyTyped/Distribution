package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.CastStateEventData")
@js.native
class CastStateEventData protected () extends EventData {
  def this(castState: CastState) = this()
  var castState: CastState = js.native
}

