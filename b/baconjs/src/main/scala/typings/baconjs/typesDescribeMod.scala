package typings.baconjs

import typings.baconjs.typesDescribeMod.Desc
import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/describe", JSImport.Namespace)
@js.native
object typesDescribeMod extends js.Object {
  @js.native
  class Desc protected () extends js.Object {
    def this(context: js.Any, method: String) = this()
    def this(context: js.Any, method: String, args: js.Array[_]) = this()
    /** @hidden */
    var _isDesc: Boolean = js.native
    var args: js.Array[_] = js.native
    /** @hidden */
    var cachedDeps: js.UndefOr[js.Array[default[_]]] = js.native
    var context: js.Any = js.native
    var method: js.UndefOr[String] = js.native
    def deps(): js.Array[default[_]] = js.native
  }
  
  def default(context: js.Any, method: String, args: js.Any*): Desc = js.native
  def describe(context: js.Any, method: String, args: js.Any*): Desc = js.native
  def findDeps(x: js.Any): js.Array[default[_]] = js.native
}

