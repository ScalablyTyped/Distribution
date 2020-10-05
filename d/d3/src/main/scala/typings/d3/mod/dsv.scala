package typings.d3.mod

import typings.d3Dsv.mod.DSVParsedArray
import typings.d3Dsv.mod.DSVRowArray
import typings.d3Dsv.mod.DSVRowString
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "dsv")
@js.native
object dsv extends js.Object {
  def apply[Columns /* <: String */](delimiter: String, url: String): js.Promise[DSVRowArray[Columns]] = js.native
  def apply[Columns /* <: String */](delimiter: String, url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  def apply[ParsedRow /* <: js.Object */, Columns /* <: String */](
    delimiter: String,
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
    delimiter: String,
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
}

