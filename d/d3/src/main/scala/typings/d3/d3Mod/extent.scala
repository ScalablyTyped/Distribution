package typings.d3.d3Mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "extent")
@js.native
object extent extends js.Object {
  def apply(array: Iterable[String]): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  def apply[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
}

