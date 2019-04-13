package typings
package beforeDashAfterDashHookLib.beforeDashAfterDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookSingular[T] extends js.Object {
  /**
    * Invoke before and after hooks without options
    */
  def apply(
    method: js.Function1[
      /* options */ T, 
      scala.Null | (js.Promise[T | scala.Null | scala.Unit]) | T | scala.Unit
    ]
  ): js.Promise[T] = js.native
  /**
    * Invoke before and after hooks with options
    */
  def apply(
    options: T,
    method: js.Function1[
      /* options */ T, 
      scala.Null | (js.Promise[T | scala.Null | scala.Unit]) | T | scala.Unit
    ]
  ): js.Promise[T] = js.native
  /**
    * Add after hook. Returns `UnnamedHook` instance for chaining.
    */
  def after(
    afterFn: js.Function1[
      /* options */ T, 
      scala.Null | (js.Promise[T | scala.Null | scala.Unit]) | T | scala.Unit
    ]
  ): HookSingular[T] = js.native
  /**
    * Add before hook. Returns `UnnamedHook` instance for chaining.
    */
  def before(
    beforeFn: js.Function1[
      /* options */ T, 
      scala.Null | (js.Promise[T | scala.Null | scala.Unit]) | T | scala.Unit
    ]
  ): HookSingular[T] = js.native
  /**
    * Add error hook. Returns `UnnamedHook` instance for chaining.
    */
  def error(
    errorFn: js.Function1[
      /* options */ T, 
      scala.Null | (js.Promise[T | scala.Null | scala.Unit]) | T | scala.Unit
    ]
  ): HookSingular[T] = js.native
  /**
    * Removes hook. Returns `UnnamedHook` instance for chaining.
    */
  def remove(
    beforeHookMethod: js.Function1[
      /* options */ T, 
      scala.Null | (js.Promise[T | scala.Null | scala.Unit]) | T | scala.Unit
    ]
  ): HookSingular[T] = js.native
  /**
    * Add wrap hook. Returns `UnnamedHook` instance for chaining.
    */
  def wrap(
    wrapFn: js.Function1[
      /* options */ T, 
      scala.Null | (js.Promise[T | scala.Null | scala.Unit]) | T | scala.Unit
    ]
  ): HookSingular[T] = js.native
}

