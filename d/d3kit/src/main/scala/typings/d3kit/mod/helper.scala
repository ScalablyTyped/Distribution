package typings.d3kit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3kit", "helper")
@js.native
object helper extends js.Object {
  
  def debounce(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  def deepExtend(dest: js.Any, args: js.Any*): js.Any = js.native
  
  def extend(dest: js.Any, args: js.Any*): js.Any = js.native
  
  def functor(value: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
  
  def isFunction(value: js.Any): Boolean = js.native
  
  def isObject(value: js.Any): Boolean = js.native
  
  def kebabCase(str: String): String = js.native
  
  def rebind(target: js.Any, source: js.Any): js.Any = js.native
  
  def throttle(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function1[/* repeated */ js.Any, Unit] = js.native
}
