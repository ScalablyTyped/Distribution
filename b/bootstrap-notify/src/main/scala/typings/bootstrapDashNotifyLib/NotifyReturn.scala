package typings
package bootstrapDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: jqueryLib.JQuery[stdLib.HTMLElement]
  def close(): scala.Unit
  def update(command: java.lang.String, update: js.Any): scala.Unit
}

object NotifyReturn {
  @scala.inline
  def apply(
    $ele: jqueryLib.JQuery[stdLib.HTMLElement],
    close: () => scala.Unit,
    update: (java.lang.String, js.Any) => scala.Unit
  ): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele, close = js.Any.fromFunction0(close), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[NotifyReturn]
  }
}

