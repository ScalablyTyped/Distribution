package typings.bootstrapDashNotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyReturn extends js.Object {
  @JSName("$ele")
  var $ele: JQuery[HTMLElement] = js.native
  def close(): Unit = js.native
  def update(command: String, update: js.Any): Unit = js.native
}

