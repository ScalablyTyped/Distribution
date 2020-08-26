package typings.carbonComponents.mod

import typings.carbonComponents.anon.EventAfterDeleteNotification
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components", "Notification")
@js.native
class Notification protected ()
  extends typings.carbonComponents.componentsMod.Notification {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components", "Notification")
@js.native
object Notification extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  var options: EventAfterDeleteNotification = js.native
}

