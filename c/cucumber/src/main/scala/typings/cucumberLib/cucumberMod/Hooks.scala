package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  def After(code: HookCode): scala.Unit = js.native
  def After(options: HookOptions, code: HookCode): scala.Unit = js.native
  def After(options: java.lang.String, code: HookCode): scala.Unit = js.native
  def AfterAll(code: GlobalHookCode): scala.Unit = js.native
  def AfterAll(options: HookOptions, code: GlobalHookCode): scala.Unit = js.native
  def AfterAll(options: java.lang.String, code: GlobalHookCode): scala.Unit = js.native
  def Before(code: HookCode): scala.Unit = js.native
  def Before(options: HookOptions, code: HookCode): scala.Unit = js.native
  def Before(options: java.lang.String, code: HookCode): scala.Unit = js.native
  def BeforeAll(code: GlobalHookCode): scala.Unit = js.native
  def BeforeAll(options: HookOptions, code: GlobalHookCode): scala.Unit = js.native
  def BeforeAll(options: java.lang.String, code: GlobalHookCode): scala.Unit = js.native
  def defineParameterType(transform: Transform): scala.Unit = js.native
  def setDefaultTimeout(time: scala.Double): scala.Unit = js.native
  def setWorldConstructor(world: js.Object): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  def setWorldConstructor(world: js.ThisFunction1[/* this */ World, /* init */ cucumberLib.Anon_Parameters, scala.Unit]): scala.Unit = js.native
}

