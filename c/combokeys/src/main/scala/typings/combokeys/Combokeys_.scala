package typings.combokeys

import org.scalablytyped.runtime.Instantiable1
import typings.std.Element
import typings.std.Event_
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Combokeys")
@js.native
object Combokeys_ extends js.Object {
  @js.native
  trait Combokeys extends js.Object {
    var element: Element = js.native
    /**
      * binds an event to Combokeys
      *
      * can be a single key, a combination of keys separated with +,
      * an array of keys, or a sequence of keys separated by spaces
      *
      * be sure to list the modifier keys first to make sure that the
      * correct key ends up getting bound (the last key in the pattern)
      *
      * @param {keys} key combination or combinations
      * @param {callback} callback function
      * @param {handler} optional - one of "keypress", "keydown", or "keyup"
      * @returns void
      */
    def bind(keys: String, callback: js.Function1[/* event */ KeyboardEvent, Unit]): Unit = js.native
    def bind(keys: String, callback: js.Function1[/* event */ KeyboardEvent, Unit], action: String): Unit = js.native
    def bind(keys: js.Array[String], callback: js.Function1[/* event */ KeyboardEvent, Unit]): Unit = js.native
    def bind(keys: js.Array[String], callback: js.Function1[/* event */ KeyboardEvent, Unit], action: String): Unit = js.native
    /**
      * binds multiple combinations to the same callback
      *
      * @param {keys} key combinations
      * @param {callback} callback function
      * @param {handler} optional - one of "keypress", "keydown", or "keyup"
      * @returns void
      */
    def bindMultiple(keys: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    def bindMultiple(keys: js.Array[String], callback: js.Function0[Unit], action: String): Unit = js.native
    /**
      * detach all listners from the bound element
      *
      * @return {void}
      */
    def detach(): Unit = js.native
    /**
      * resets the library back to its initial state. This is useful
      * if you want to clear out the current keyboard shortcuts and bind
      * new ones - for example if you switch to another page
      *
      * @returns void
      */
    def reset(): Unit = js.native
    /**
      * should we stop this event before firing off callbacks
      *
      * @param {e} event
      * @param {element} bound element
      * @return {boolean}
      */
    def stopCallback(e: Event_, element: Element): Boolean = js.native
    /**
      * triggers an event that has already been bound
      *
      * @param {keys} key combination
      * @param {action} optional - one of "keypress", "keydown", or "keyup"
      * @returns void
      */
    def trigger(keys: String): Unit = js.native
    def trigger(keys: String, action: String): Unit = js.native
    /**
      * unbinds an event to Combokeys
      *
      * the unbinding sets the callback function of the specified key combo
      * to an empty function and deletes the corresponding key in the
      * directMap dict.
      *
      * the keycombo+action has to be exactly the same as
      * it was defined in the bind method
      *
      * @param {keys} key combination or combinations
      * @param {action} optional - one of "keypress", "keydown", or "keyup"
      * @returns void
      */
    def unbind(keys: String): Unit = js.native
    def unbind(keys: String, action: String): Unit = js.native
    def unbind(keys: js.Array[String]): Unit = js.native
    def unbind(keys: js.Array[String], action: String): Unit = js.native
  }
  
  @js.native
  trait CombokeysStatic extends Instantiable1[/* element */ Element, Combokeys] {
    /**
      * all instances of Combokeys
      */
    var instances: js.Array[Combokeys] = js.native
    /**
      * reset all instances
      */
    def reset(): Unit = js.native
  }
  
}

