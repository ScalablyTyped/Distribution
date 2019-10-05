package typings.d3.d3Mod

import typings.d3DashDsv.d3DashDsvMod.DSVParsedArray
import typings.d3DashDsv.d3DashDsvMod.DSVRowArray
import typings.d3DashDsv.d3DashDsvMod.DSVRowString
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "csv")
@js.native
object csv extends js.Object {
  def apply[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = js.native
  def apply[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  def apply[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def apply[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
}

