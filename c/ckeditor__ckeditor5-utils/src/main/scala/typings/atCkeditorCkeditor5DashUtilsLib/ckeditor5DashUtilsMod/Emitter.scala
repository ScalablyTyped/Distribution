package typings
package atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  def delegate(events: java.lang.String*): EmitterMixinDelegateChain = js.native
  def fire(eventOrInfo: EventInfo[Emitter], args: js.Any*): js.Any = js.native
  def fire(eventOrInfo: java.lang.String, args: js.Any*): js.Any = js.native
  def listenTo(emitter: Emitter, event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def listenTo(
    emitter: Emitter,
    event: java.lang.String,
    callback: js.Function,
    options: atCkeditorCkeditor5DashUtilsLib.Anon_PriorityPriorityString
  ): scala.Unit = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def off(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def on(
    event: java.lang.String,
    callback: js.Function,
    options: atCkeditorCkeditor5DashUtilsLib.Anon_Priority
  ): scala.Unit = js.native
  def once(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def once(
    event: java.lang.String,
    callback: js.Function,
    options: atCkeditorCkeditor5DashUtilsLib.Anon_Priority
  ): scala.Unit = js.native
  def stopDelegating(): scala.Unit = js.native
  def stopDelegating(event: java.lang.String): scala.Unit = js.native
  def stopDelegating(event: java.lang.String, emitter: Emitter): scala.Unit = js.native
  def stopListening(): scala.Unit = js.native
  def stopListening(emitter: Emitter): scala.Unit = js.native
  def stopListening(emitter: Emitter, event: java.lang.String): scala.Unit = js.native
  def stopListening(emitter: Emitter, event: java.lang.String, callback: js.Function): scala.Unit = js.native
}

