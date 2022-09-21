package typings.d3Dispatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-dispatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch[T /* <: js.Object */](types: String*): Dispatch_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Dispatch_[T]]
  
  @js.native
  trait Dispatch_[T /* <: js.Object */] extends StObject {
    
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
    def apply(`type`: String, that: T, args: js.Array[Any]): Unit = js.native
    @JSName("apply")
    def apply(`type`: String, that: Unit, args: js.Array[Any]): Unit = js.native
    
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
    def call(`type`: String, that: T, args: Any*): Unit = js.native
    def call(`type`: String, that: Unit, args: Any*): Unit = js.native
    
    /**
      * Returns a copy of this dispatch object.
      * Changes to this dispatch do not affect the returned copy and vice versa.
      */
    def copy(): Dispatch_[T] = js.native
    
    /**
      * Adds or removes the callback for the specified typenames.
      * If a callback function is specified, it is registered for the specified (fully-qualified) typenames.
      * If a callback was already registered for the given typenames, the existing callback is removed before the new callback is added.
      * The specified typenames is a string, such as start or end.foo.
      * The type may be optionally followed by a period (.) and a name; the optional name allows multiple callbacks to be registered to receive events of the same type, such as start.foo and start.bar.
      * To specify multiple typenames, separate typenames with spaces, such as start end or start.foo start.bar.
      * To remove all callbacks for a given name foo, say dispatch.on(".foo", null).
      */
    def on(typenames: String): this.type = js.native
    def on(typenames: String, callback: js.ThisFunction1[/* this */ T, /* repeated */ Any, Unit]): this.type = js.native
    /**
      * Returns the callback for the specified typenames, if any.
      * If multiple typenames are specified, the first matching callback is returned.
      */
    @JSName("on")
    def on_Union(typenames: String): js.UndefOr[js.ThisFunction1[/* this */ T, /* repeated */ Any, Unit]] = js.native
  }
}
