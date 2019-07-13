package typings
package beforeDashAfterDashHookLib.beforeDashAfterDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookSingular[O, R, E] extends js.Object {
  /**
    * Invoke before and after hooks
    */
  def apply(hookMethod: HookMethod[O, R]): js.Promise[R] = js.native
  def apply(hookMethod: HookMethod[O, R], options: O): js.Promise[R] = js.native
  /**
    * Add `after` hook
    */
  def after(afterHook: AfterHook[O, R]): scala.Unit = js.native
  /**
    * Add `before` hook
    */
  def before(beforeHook: BeforeHook[O]): scala.Unit = js.native
  /**
    * Add `error` hook
    */
  def error(errorHook: ErrorHook[O, E]): scala.Unit = js.native
  /**
    * Remove added hook
    */
  def remove(hook: AnyHook[O, R, E]): scala.Unit = js.native
  /**
    * Add `wrap` hook
    */
  def wrap(wrapHook: WrapHook[O, R]): scala.Unit = js.native
}

