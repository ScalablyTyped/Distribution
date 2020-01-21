package typings.d3Dispatch

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-dispatch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Dispatch_[T /* <: EventTarget */] extends js.Object {
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
    def apply(`type`: String): Unit = js.native
    @JSName("apply")
    def apply(`type`: String, that: T): Unit = js.native
    @JSName("apply")
    def apply(`type`: String, that: T, args: js.Array[_]): Unit = js.native
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
    def call(`type`: String): Unit = js.native
    def call(`type`: String, that: T, args: js.Any*): Unit = js.native
    /**
      * Returns a copy of this dispatch object.
      * Changes to this dispatch do not affect the returned copy and vice versa.
      */
    def copy(): Dispatch_[T] = js.native
    /**
      * Removes the callback for the specified typenames.
      * To remove all callbacks for a given name `foo`, say `dispatch.on(".foo", null).`
      *
      * @param types An event typename.
      */
    def on(typenames: String): this.type = js.native
    /**
      * Adds the callback for the specified typenames.
      * The callback is registered for the specified (fully-qualified) typenames.
      * If a callback was already registered for the given typenames,
      * the existing callback is removed before the new callback is added.
      *
      * @param types An event typename.
      * @param callback A callback.
      */
    def on(typenames: String, callback: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Returns the callback for the specified typenames, if any.
      * If multiple typenames are specified, the first matching callback is returned.
      *
      * @param types An event typename.
      * @param callback A callback.
      */
    @JSName("on")
    def on_Union(typenames: String): js.UndefOr[js.ThisFunction1[/* this */ T, /* repeated */ js.Any, Unit]] = js.native
  }
  
  def dispatch[T /* <: EventTarget */](types: String*): Dispatch_[T] = js.native
}

