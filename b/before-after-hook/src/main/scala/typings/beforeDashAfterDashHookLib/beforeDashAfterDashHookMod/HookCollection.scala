package typings
package beforeDashAfterDashHookLib.beforeDashAfterDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookCollection extends js.Object {
  /**
    * Invoke before and after hooks.
    */
  def apply(name: java.lang.String, method: js.Function1[/* options */ js.Any, js.Promise[_] | _]): js.Promise[_] = js.native
  /**
    * Invoke before and after hooks.
    */
  def apply(
    name: java.lang.String,
    options: js.Any,
    method: js.Function1[/* options */ js.Any, js.Promise[_] | _]
  ): js.Promise[_] = js.native
  def apply(name: js.Array[java.lang.String], method: js.Function1[/* options */ js.Any, js.Promise[_] | _]): js.Promise[_] = js.native
  def apply(
    name: js.Array[java.lang.String],
    options: js.Any,
    method: js.Function1[/* options */ js.Any, js.Promise[_] | _]
  ): js.Promise[_] = js.native
  /**
    * Add after hook for given name. Returns `hook` instance for chaining.
    */
  def after(name: java.lang.String, method: js.Function1[/* options */ js.Any, js.Promise[_] | _]): HookCollection = js.native
  /**
    * Add before hook for given name. Returns `hook` instance for chaining.
    */
  def before(name: java.lang.String, method: js.Function1[/* options */ js.Any, js.Promise[_] | _]): HookCollection = js.native
  /**
    * Add error hook for given name. Returns `hook` instance for chaining.
    */
  def error(name: java.lang.String, method: js.Function1[/* options */ js.Any, js.Promise[_] | _]): HookCollection = js.native
  /**
    * Removes hook for given name. Returns `hook` instance for chaining.
    */
  def remove(name: java.lang.String, beforeHookMethod: js.Function1[/* options */ js.Any, js.Promise[_] | _]): HookCollection = js.native
  /**
    * Add wrap hook for given name. Returns `hook` instance for chaining.
    */
  def wrap(name: java.lang.String, method: js.Function1[/* options */ js.Any, js.Promise[_] | _]): HookCollection = js.native
}

