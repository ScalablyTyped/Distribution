package typings
package bootstrapDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: JQueryStatic
  def close(): scala.Unit
  def update(command: java.lang.String, update: js.Any): scala.Unit
}

object NotifyReturn {
  @scala.inline
  def apply(
    $ele: JQueryStatic,
    close: js.Function0[scala.Unit],
    update: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele, close = close, update = update)
  
    __obj.asInstanceOf[NotifyReturn]
  }
}

