package typings
package combokeysLib.CombokeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Combokeys extends js.Object {
  var element: stdLib.Element = js.native
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
  def bind(keys: java.lang.String, callback: js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]): scala.Unit = js.native
  def bind(
    keys: java.lang.String,
    callback: js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit],
    action: java.lang.String
  ): scala.Unit = js.native
  def bind(
    keys: js.Array[java.lang.String],
    callback: js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]
  ): scala.Unit = js.native
  def bind(
    keys: js.Array[java.lang.String],
    callback: js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit],
    action: java.lang.String
  ): scala.Unit = js.native
  /**
    * binds multiple combinations to the same callback
    *
    * @param {keys} key combinations
    * @param {callback} callback function
    * @param {handler} optional - one of "keypress", "keydown", or "keyup"
    * @returns void
    */
  def bindMultiple(keys: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def bindMultiple(keys: js.Array[java.lang.String], callback: js.Function0[scala.Unit], action: java.lang.String): scala.Unit = js.native
  /**
    * detach all listners from the bound element
    *
    * @return {void}
    */
  def detach(): scala.Unit = js.native
  /**
    * resets the library back to its initial state. This is useful
    * if you want to clear out the current keyboard shortcuts and bind
    * new ones - for example if you switch to another page
    *
    * @returns void
    */
  def reset(): scala.Unit = js.native
  /**
    * should we stop this event before firing off callbacks
    *
    * @param {e} event
    * @param {element} bound element
    * @return {boolean}
    */
  def stopCallback(e: stdLib.Event, element: stdLib.Element): scala.Boolean = js.native
  /**
    * triggers an event that has already been bound
    *
    * @param {keys} key combination
    * @param {action} optional - one of "keypress", "keydown", or "keyup"
    * @returns void
    */
  def trigger(keys: java.lang.String): scala.Unit = js.native
  def trigger(keys: java.lang.String, action: java.lang.String): scala.Unit = js.native
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
  def unbind(keys: java.lang.String): scala.Unit = js.native
  def unbind(keys: java.lang.String, action: java.lang.String): scala.Unit = js.native
  def unbind(keys: js.Array[java.lang.String]): scala.Unit = js.native
  def unbind(keys: js.Array[java.lang.String], action: java.lang.String): scala.Unit = js.native
}

