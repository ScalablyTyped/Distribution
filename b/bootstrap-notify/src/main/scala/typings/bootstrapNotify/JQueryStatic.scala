package typings.bootstrapNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def notify(message: String): NotifyReturn = js.native
  def notify(opts: NotifyOptions): NotifyReturn = js.native
  def notify(opts: NotifyOptions, settings: NotifySettings): NotifyReturn = js.native
  def notifyClose(): Unit = js.native
  def notifyClose(command: String): Unit = js.native
  def notifyDefaults(settings: NotifySettings): Unit = js.native
}

