package typings
package bootstrapDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def notify(message: java.lang.String): NotifyReturn = js.native
  def notify(opts: NotifyOptions): NotifyReturn = js.native
  def notify(opts: NotifyOptions, settings: NotifySettings): NotifyReturn = js.native
  def notifyClose(): scala.Unit = js.native
  def notifyClose(command: java.lang.String): scala.Unit = js.native
  def notifyDefaults(settings: NotifySettings): scala.Unit = js.native
}

