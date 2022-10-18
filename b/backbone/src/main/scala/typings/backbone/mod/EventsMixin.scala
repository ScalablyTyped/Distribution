package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/* note: abstract class */ @JSImport("backbone", "EventsMixin")
@js.native
open class EventsMixin () extends StObject {
  
  def bind(eventMap: EventMap): this.type = js.native
  def bind(eventMap: EventMap, context: Any): this.type = js.native
  def bind(eventName: String, callback: EventHandler): this.type = js.native
  def bind(eventName: String, callback: EventHandler, context: Any): this.type = js.native
  
  def listenTo(`object`: Any, eventMap: EventMap): this.type = js.native
  def listenTo(`object`: Any, events: String, callback: EventHandler): this.type = js.native
  
  def listenToOnce(`object`: Any, eventMap: EventMap): this.type = js.native
  def listenToOnce(`object`: Any, events: String, callback: EventHandler): this.type = js.native
  
  def off(): this.type = js.native
  def off(eventName: String): this.type = js.native
  def off(eventName: String, callback: Null, context: Any): this.type = js.native
  def off(eventName: String, callback: Unit, context: Any): this.type = js.native
  def off(eventName: String, callback: EventHandler): this.type = js.native
  def off(eventName: String, callback: EventHandler, context: Any): this.type = js.native
  def off(eventName: Null, callback: Null, context: Any): this.type = js.native
  def off(eventName: Null, callback: Unit, context: Any): this.type = js.native
  def off(eventName: Null, callback: EventHandler): this.type = js.native
  def off(eventName: Null, callback: EventHandler, context: Any): this.type = js.native
  def off(eventName: Unit, callback: Null, context: Any): this.type = js.native
  def off(eventName: Unit, callback: Unit, context: Any): this.type = js.native
  def off(eventName: Unit, callback: EventHandler): this.type = js.native
  def off(eventName: Unit, callback: EventHandler, context: Any): this.type = js.native
  
  def on(eventMap: EventMap): this.type = js.native
  def on(eventMap: EventMap, context: Any): this.type = js.native
  def on(eventName: String, callback: EventHandler): this.type = js.native
  def on(eventName: String, callback: EventHandler, context: Any): this.type = js.native
  
  def once(eventMap: EventMap): this.type = js.native
  def once(eventMap: EventMap, context: Any): this.type = js.native
  def once(events: String, callback: EventHandler): this.type = js.native
  def once(events: String, callback: EventHandler, context: Any): this.type = js.native
  
  def stopListening(): this.type = js.native
  def stopListening(`object`: Any): this.type = js.native
  def stopListening(`object`: Any, events: String): this.type = js.native
  def stopListening(`object`: Any, events: String, callback: EventHandler): this.type = js.native
  def stopListening(`object`: Any, events: Unit, callback: EventHandler): this.type = js.native
  def stopListening(`object`: Unit, events: String): this.type = js.native
  def stopListening(`object`: Unit, events: String, callback: EventHandler): this.type = js.native
  def stopListening(`object`: Unit, events: Unit, callback: EventHandler): this.type = js.native
  
  def trigger(eventName: String, args: Any*): this.type = js.native
  
  def unbind(): this.type = js.native
  def unbind(eventName: String): this.type = js.native
  def unbind(eventName: String, callback: Unit, context: Any): this.type = js.native
  def unbind(eventName: String, callback: EventHandler): this.type = js.native
  def unbind(eventName: String, callback: EventHandler, context: Any): this.type = js.native
  def unbind(eventName: Unit, callback: Unit, context: Any): this.type = js.native
  def unbind(eventName: Unit, callback: EventHandler): this.type = js.native
  def unbind(eventName: Unit, callback: EventHandler, context: Any): this.type = js.native
}
