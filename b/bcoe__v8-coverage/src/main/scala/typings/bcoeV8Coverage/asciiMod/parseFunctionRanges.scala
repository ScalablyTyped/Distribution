package typings.bcoeV8Coverage.asciiMod

import typings.bcoeV8Coverage.typesMod.RangeCov
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@bcoe/v8-coverage/dist/lib/ascii", "parseFunctionRanges")
@js.native
object parseFunctionRanges extends js.Object {
  def apply(text: String, offsetMap: Map[Double, Double]): js.Array[RangeCov] = js.native
}

