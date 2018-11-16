package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryEventInterface extends js.Object {
  @JSName("Event")
  var Event_Original: JQueryEventConstructor = js.native
  def Event(name: java.lang.String): JQueryEventObject = js.native
  def Event(name: java.lang.String, eventProperties: js.Any): JQueryEventObject = js.native
}

