package typings
package d3DashDispatchLib.d3DashDispatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatch[T /* <: stdLib.EventTarget */] extends js.Object {
  /**
    * Like `function.apply`, invokes each registered callback for the specified type,
    * passing the callback the specified arguments, with `that` as the `this` context.
    *
    * @param type A specified event type.
    * @param that The `this` context for the callback.
    * @param args Additional arguments to be passed to the callback.
    * @throws "unknown type" on unknown event type.
    */
  @JSName("apply")
  def apply(`type`: java.lang.String): scala.Unit = js.native
  @JSName("apply")
  def apply(`type`: java.lang.String, that: T): scala.Unit = js.native
  @JSName("apply")
  def apply(`type`: java.lang.String, that: T, args: js.Array[_]): scala.Unit = js.native
  /**
    * Like `function.call`, invokes each registered callback for the specified type,
    * passing the callback the specified arguments, with `that` as the `this` context.
    * See dispatch.apply for more information.
    *
    * @param type A specified event type.
    * @param that The `this` context for the callback.
    * @param args Additional arguments to be passed to the callback.
    * @throws "unknown type" on unknown event type.
    */
  def call(`type`: java.lang.String): scala.Unit = js.native
  def call(`type`: java.lang.String, that: T, args: js.Any*): scala.Unit = js.native
  /**
    * Returns a copy of this dispatch object.
    * Changes to this dispatch do not affect the returned copy and vice versa.
    */
  def copy(): Dispatch[T] = js.native
  /**
    * Returns the callback for the specified typenames, if any.
    * If multiple typenames are specified, the first matching callback is returned.
    *
    * @param types An event typename.
    * @param callback A callback.
    */
  def on(typenames: java.lang.String): js.UndefOr[js.ThisFunction1[/* this */ T, /* repeated */ js.Any, scala.Unit]] = js.native
  /**
    * Adds the callback for the specified typenames.
    * The callback is registered for the specified (fully-qualified) typenames.
    * If a callback was already registered for the given typenames,
    * the existing callback is removed before the new callback is added.
    *
    * @param types An event typename.
    * @param callback A callback.
    */
  def on(
    typenames: java.lang.String,
    callback: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Removes the callback for the specified typenames.
    * To remove all callbacks for a given name `foo`, say `dispatch.on(".foo", null).`
    *
    * @param types An event typename.
    */
  @JSName("on")
  def `on_<this>`(typenames: java.lang.String): this.type = js.native
}

