package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region Callbacks
// tslint:disable-next-line:ban-types
@js.native
trait Callbacks[T /* <: js.Function */] extends js.Object {
  /**
    * Add a callback or a collection of callbacks to a callback list.
    *
    * @param callback A function, or array of functions, that are to be added to the callback list.
    * @param callbacks A function, or array of functions, that are to be added to the callback list.
    * @see \`{@link https://api.jquery.com/callbacks.add/ }\`
    * @since 1.7
    */
  def add(callback: TypeOrArray[T], callbacks: TypeOrArray[T]*): this.type = js.native
  /**
    * Disable a callback list from doing anything more.
    *
    * @see \`{@link https://api.jquery.com/callbacks.disable/ }\`
    * @since 1.7
    */
  def disable(): this.type = js.native
  /**
    * Determine if the callbacks list has been disabled.
    *
    * @see \`{@link https://api.jquery.com/callbacks.disabled/ }\`
    * @since 1.7
    */
  def disabled(): scala.Boolean = js.native
  /**
    * Remove all of the callbacks from a list.
    *
    * @see \`{@link https://api.jquery.com/callbacks.empty/ }\`
    * @since 1.7
    */
  def empty(): this.type = js.native
  /**
    * Call all of the callbacks with the given arguments.
    *
    * @param args The argument or list of arguments to pass back to the callback list.
    * @see \`{@link https://api.jquery.com/callbacks.fire/ }\`
    * @since 1.7
    */
  def fire(args: js.Any*): this.type = js.native
  /**
    * Call all callbacks in a list with the given context and arguments.
    *
    * @param context A reference to the context in which the callbacks in the list should be fired.
    * @param args An argument, or array of arguments, to pass to the callbacks in the list.
    * @see \`{@link https://api.jquery.com/callbacks.fireWith/ }\`
    * @since 1.7
    */
  def fireWith(context: js.Object): this.type = js.native
  def fireWith(context: js.Object, args: stdLib.ArrayLike[_]): this.type = js.native
  /**
    * Determine if the callbacks have already been called at least once.
    *
    * @see \`{@link https://api.jquery.com/callbacks.fired/ }\`
    * @since 1.7
    */
  def fired(): scala.Boolean = js.native
  /**
    * Determine whether or not the list has any callbacks attached. If a callback is provided as an
    * argument, determine whether it is in a list.
    *
    * @param callback The callback to search for.
    * @see \`{@link https://api.jquery.com/callbacks.has/ }\`
    * @since 1.7
    */
  def has(): scala.Boolean = js.native
  def has(callback: T): scala.Boolean = js.native
  /**
    * Lock a callback list in its current state.
    *
    * @see \`{@link https://api.jquery.com/callbacks.lock/ }\`
    * @since 1.7
    */
  def lock(): this.type = js.native
  /**
    * Determine if the callbacks list has been locked.
    *
    * @see \`{@link https://api.jquery.com/callbacks.locked/ }\`
    * @since 1.7
    */
  def locked(): scala.Boolean = js.native
  /**
    * Remove a callback or a collection of callbacks from a callback list.
    *
    * @param callbacks A function, or array of functions, that are to be removed from the callback list.
    * @see \`{@link https://api.jquery.com/callbacks.remove/ }\`
    * @since 1.7
    */
  def remove(callbacks: T*): this.type = js.native
}

