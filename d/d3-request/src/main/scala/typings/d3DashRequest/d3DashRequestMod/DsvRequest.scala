package typings.d3DashRequest.d3DashRequestMod

import typings.d3DashDsv.d3DashDsvMod.DSVRowString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DsvRequest extends Request {
  def row[ParsedRow /* <: js.Object */](
    value: js.Function3[
      /* rawRow */ DSVRowString[String], 
      /* index */ Double, 
      /* columns */ js.Array[String], 
      ParsedRow
    ]
  ): DsvRequest = js.native
}

