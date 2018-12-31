package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "helper")
@js.native
object helperNs extends js.Object {
  def debounce(fn: js.Function1[/* repeated */ js.Any, scala.Unit], delay: scala.Double): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def deepExtend(dest: js.Any, args: js.Any*): js.Any = js.native
  def extend(dest: js.Any, args: js.Any*): js.Any = js.native
  def functor(value: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
  def isFunction(value: js.Any): scala.Boolean = js.native
  def isObject(value: js.Any): scala.Boolean = js.native
  def kebabCase(str: java.lang.String): java.lang.String = js.native
  def rebind(target: js.Any, source: js.Any): js.Any = js.native
  def throttle(fn: js.Function1[/* repeated */ js.Any, scala.Unit], delay: scala.Double): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
}

