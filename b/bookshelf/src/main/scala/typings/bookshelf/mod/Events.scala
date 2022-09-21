package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bookshelf", "Events")
@js.native
abstract class Events[T] () extends StObject {
  
  def off(): Unit = js.native
  def off(event: String): Unit = js.native
  
  def on(): Unit = js.native
  def on(event: String): Unit = js.native
  def on(event: String, callback: Unit, context: Any): Unit = js.native
  def on(event: String, callback: EventFunction[T]): Unit = js.native
  def on(event: String, callback: EventFunction[T], context: Any): Unit = js.native
  def on(event: Unit, callback: Unit, context: Any): Unit = js.native
  def on(event: Unit, callback: EventFunction[T]): Unit = js.native
  def on(event: Unit, callback: EventFunction[T], context: Any): Unit = js.native
  
  def once(event: String, callback: EventFunction[T]): Unit = js.native
  def once(event: String, callback: EventFunction[T], context: Any): Unit = js.native
  
  def trigger(event: String, args: Any*): Unit = js.native
  def trigger(event: Unit, args: Any*): Unit = js.native
  
  def triggerThen(name: String, args: Any*): typings.bluebird.mod.^[Any] = js.native
}
