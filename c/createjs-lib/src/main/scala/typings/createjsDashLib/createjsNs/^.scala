package typings.createjsDashLib.createjsNs

import typings.createjsDashLib.Anon_EventObj
import typings.createjsDashLib.Anon_EventObjHandleEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs")
@js.native
object ^ extends js.Object {
  def extend(subclass: js.Function0[_], superclass: js.Function0[_]): js.Function0[_] = js.native
  def indexOf(array: js.Array[_], searchElement: js.Object): Double = js.native
  def promote(subclass: js.Function0[_], prefix: String): js.Function0[_] = js.native
  def proxy(method: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
  def proxy(method: Anon_EventObjHandleEvent, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
  def proxy(method: Anon_EventObj, scope: js.Object, arg: js.Any*): js.Function1[/* eventObj */ js.Object, _] = js.native
}

