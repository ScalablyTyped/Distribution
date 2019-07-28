package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryEventInterface extends js.Object {
  @JSName("Event")
  var Event_Original: JQueryEventConstructor = js.native
  def Event(name: String): JQueryEventObject = js.native
  def Event(name: String, eventProperties: js.Any): JQueryEventObject = js.native
}

