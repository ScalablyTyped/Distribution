package typings.ckeditorCkeditor5Core.anon

import typings.ckeditorCkeditor5Utils.mod.BindChain
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.EmitterMixinDelegateChain
import typings.ckeditorCkeditor5Utils.mod.EventInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils.Observable & {  message  :string} */
@js.native
trait Observablemessagestring extends js.Object {
  var message: String = js.native
  def bind(bindProperties: String*): BindChain = js.native
  def decorate(methodName: String): Unit = js.native
  // Emitter
  def delegate(events: String*): EmitterMixinDelegateChain = js.native
  def fire(eventOrInfo: String, args: js.Any*): js.Any = js.native
  def fire(eventOrInfo: EventInfo[Emitter], args: js.Any*): js.Any = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
  def listenTo(
    emitter: Emitter,
    event: String,
    callback: js.Function,
    options: typings.ckeditorCkeditor5Utils.anon.Priority
  ): Unit = js.native
  def off(event: String): Unit = js.native
  def off(event: String, callback: js.Function): Unit = js.native
  def on(event: String, callback: js.Function): Unit = js.native
  def on(event: String, callback: js.Function, options: typings.ckeditorCkeditor5Utils.anon.`0`): Unit = js.native
  def once(event: String, callback: js.Function): Unit = js.native
  def once(event: String, callback: js.Function, options: typings.ckeditorCkeditor5Utils.anon.`0`): Unit = js.native
  def set(name: String, value: js.Any): Unit = js.native
  def set(name: js.Object): Unit = js.native
  def stopDelegating(): Unit = js.native
  def stopDelegating(event: String): Unit = js.native
  def stopDelegating(event: String, emitter: Emitter): Unit = js.native
  def stopListening(): Unit = js.native
  def stopListening(emitter: Emitter): Unit = js.native
  def stopListening(emitter: Emitter, event: String): Unit = js.native
  def stopListening(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
  def unbind(unbindProperties: String*): Unit = js.native
}

