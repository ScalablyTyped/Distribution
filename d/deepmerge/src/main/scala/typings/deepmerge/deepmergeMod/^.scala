package typings.deepmerge.deepmergeMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deepmerge", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](x: Partial[T], y: Partial[T]): T = js.native
  def apply[T](x: Partial[T], y: Partial[T], options: Options): T = js.native
  def all(objects: js.Array[js.Object]): js.Object = js.native
  def all(objects: js.Array[js.Object], options: Options): js.Object = js.native
  @JSName("all")
  def all_T_T[T](objects: js.Array[Partial[T]]): T = js.native
  @JSName("all")
  def all_T_T[T](objects: js.Array[Partial[T]], options: Options): T = js.native
}

