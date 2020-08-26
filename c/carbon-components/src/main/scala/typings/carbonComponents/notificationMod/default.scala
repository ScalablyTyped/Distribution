package typings.carbonComponents.notificationMod

import typings.carbonComponents.anon.EventAfterDeleteNotification
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/components/notification/notification", JSImport.Default)
@js.native
class default protected () extends Notification {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/components/notification/notification", JSImport.Default)
@js.native
object default extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  var options: EventAfterDeleteNotification = js.native
}

