package typings
package beforeDashAfterDashHookLib.beforeDashAfterDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookCollection extends js.Object {
  /**
    * Invoke before and after hooks
    */
  def apply(name: java.lang.String, hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
  def apply(name: java.lang.String, hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
  def apply(name: js.Array[java.lang.String], hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
  def apply(name: js.Array[java.lang.String], hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
  /**
    * Add `after` hook for given `name`
    */
  def after(name: java.lang.String, afterHook: AfterHook[_, _]): scala.Unit = js.native
  /**
    * Add `before` hook for given `name`
    */
  def before(name: java.lang.String, beforeHook: BeforeHook[_]): scala.Unit = js.native
  /**
    * Add `error` hook for given `name`
    */
  def error(name: java.lang.String, errorHook: ErrorHook[_, _]): scala.Unit = js.native
  /**
    * Remove added hook for given `name`
    */
  def remove(name: java.lang.String, hook: AnyHook[_, _, _]): scala.Unit = js.native
  /**
    * Add `wrap` hook for given `name`
    */
  def wrap(name: java.lang.String, wrapHook: WrapHook[_, _]): scala.Unit = js.native
}

