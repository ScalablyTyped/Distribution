package typings
package deepmergeLib.deepmergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deepmerge", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](x: stdLib.Partial[T], y: stdLib.Partial[T]): T = js.native
  def apply[T](x: stdLib.Partial[T], y: stdLib.Partial[T], options: Options): T = js.native
  def all(objects: js.Array[js.Object]): js.Object = js.native
  def all(objects: js.Array[js.Object], options: Options): js.Object = js.native
  @JSName("all")
  def all_TT[T](objects: js.Array[stdLib.Partial[T]]): T = js.native
  @JSName("all")
  def all_TT[T](objects: js.Array[stdLib.Partial[T]], options: Options): T = js.native
}

