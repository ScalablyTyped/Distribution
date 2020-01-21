package typings.beforeAfterHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookCollection extends js.Object {
  /**
    * Invoke before and after hooks
    */
  def apply(name: String, hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
  def apply(name: String, hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
  def apply(name: js.Array[String], hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
  def apply(name: js.Array[String], hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
  /**
    * Add `after` hook for given `name`
    */
  def after(name: String, afterHook: AfterHook[_, _]): Unit = js.native
  /**
    * Add `before` hook for given `name`
    */
  def before(name: String, beforeHook: BeforeHook[_]): Unit = js.native
  /**
    * Add `error` hook for given `name`
    */
  def error(name: String, errorHook: ErrorHook[_, _]): Unit = js.native
  /**
    * Remove added hook for given `name`
    */
  def remove(name: String, hook: AnyHook[_, _, _]): Unit = js.native
  /**
    * Add `wrap` hook for given `name`
    */
  def wrap(name: String, wrapHook: WrapHook[_, _]): Unit = js.native
}

