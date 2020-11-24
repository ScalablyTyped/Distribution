package typings.beforeAfterHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def after(afterHook: AfterHook[O, R]): Unit = js.native
  
  /**
    * Add `before` hook
    */
  def before(beforeHook: BeforeHook[O]): Unit = js.native
  
  /**
    * Add `error` hook
    */
  def error(errorHook: ErrorHook[O, E]): Unit = js.native
  
  /**
    * Remove added hook
    */
  def remove(hook: AnyHook[O, R, E]): Unit = js.native
  
  /**
    * Add `wrap` hook
    */
  def wrap(wrapHook: WrapHook[O, R]): Unit = js.native
}
