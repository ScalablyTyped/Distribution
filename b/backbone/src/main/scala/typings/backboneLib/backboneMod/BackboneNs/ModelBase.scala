package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelBase extends Events {
  def bind(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def bind(eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def listenTo(`object`: js.Any, events: java.lang.String, callback: js.Function): js.Any = js.native
  def listenToOnce(`object`: js.Any, events: java.lang.String, callback: js.Function): js.Any = js.native
  def off(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def off(eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def on(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def on(eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def on(eventName: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
  def once(events: java.lang.String, callback: js.Function): js.Any = js.native
  def once(events: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def parse(response: js.Any): js.Any = js.native
  def parse(response: js.Any, options: js.Any): js.Any = js.native
  def stopListening(`object`: js.Any, events: java.lang.String, callback: js.Function): js.Any = js.native
  def sync(arg: js.Any*): jqueryLib.JQueryXHR = js.native
  def toJSON(): js.Any = js.native
  def toJSON(options: js.Any): js.Any = js.native
  def unbind(eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def unbind(eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
}

