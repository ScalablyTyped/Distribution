package typings.d3.d3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "tsvParseRows")
@js.native
object tsvParseRows extends js.Object {
  def apply(tsvString: String): js.Array[js.Array[String]] = js.native
  def apply[ParsedRow /* <: js.Object */](
    tsvString: String,
    row: js.Function2[/* rawRow */ js.Array[String], /* index */ Double, js.UndefOr[ParsedRow | Null]]
  ): js.Array[ParsedRow] = js.native
}

