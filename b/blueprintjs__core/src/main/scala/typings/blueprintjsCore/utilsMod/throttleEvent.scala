package typings.blueprintjsCore.utilsMod

import typings.std.EventTarget
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", "throttleEvent")
@js.native
object throttleEvent extends js.Object {
  def apply(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event_, Unit] = js.native
}

