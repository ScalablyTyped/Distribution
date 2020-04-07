package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRInputSourceChangeEvent extends js.Object {
  var added: js.Array[XRInputSource]
  var removed: js.Array[XRInputSource]
  var session: XRSession
}

object XRInputSourceChangeEvent {
  @scala.inline
  def apply(added: js.Array[XRInputSource], removed: js.Array[XRInputSource], session: XRSession): XRInputSourceChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XRInputSourceChangeEvent]
  }
}

