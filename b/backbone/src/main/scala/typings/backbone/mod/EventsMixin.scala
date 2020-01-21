package typings.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper to avoid code repetition in type declarations.
  * Backbone.Events cannot be extended, hence a separate abstract
  * class with a different name. Both classes and interfaces can
  * extend from this helper class to reuse the signatures.
  *
  * For class type declarations that already extend another base
  * class, and for actual class definitions, please see the
  * Events_* interfaces above.
  */
@JSImport("backbone", "EventsMixin")
@js.native
abstract class EventsMixin () extends js.Object {
  def bind(eventMap: EventMap): this.type = js.native
  def bind(eventMap: EventMap, context: js.Any): this.type = js.native
  def bind(eventName: String, callback: EventHandler): this.type = js.native
  def bind(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
  def listenTo(`object`: js.Any, eventMap: EventMap): this.type = js.native
  def listenTo(`object`: js.Any, events: String, callback: EventHandler): this.type = js.native
  def listenToOnce(`object`: js.Any, eventMap: EventMap): this.type = js.native
  def listenToOnce(`object`: js.Any, events: String, callback: EventHandler): this.type = js.native
  def off(): this.type = js.native
  def off(eventName: String): this.type = js.native
  def off(eventName: String, callback: EventHandler): this.type = js.native
  def off(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
  def on(eventMap: EventMap): this.type = js.native
  def on(eventMap: EventMap, context: js.Any): this.type = js.native
  def on(eventName: String, callback: EventHandler): this.type = js.native
  def on(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
  def once(eventMap: EventMap): this.type = js.native
  def once(eventMap: EventMap, context: js.Any): this.type = js.native
  def once(events: String, callback: EventHandler): this.type = js.native
  def once(events: String, callback: EventHandler, context: js.Any): this.type = js.native
  def stopListening(): this.type = js.native
  def stopListening(`object`: js.Any): this.type = js.native
  def stopListening(`object`: js.Any, events: String): this.type = js.native
  def stopListening(`object`: js.Any, events: String, callback: EventHandler): this.type = js.native
  def trigger(eventName: String, args: js.Any*): this.type = js.native
  def unbind(): this.type = js.native
  def unbind(eventName: String): this.type = js.native
  def unbind(eventName: String, callback: EventHandler): this.type = js.native
  def unbind(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
}

