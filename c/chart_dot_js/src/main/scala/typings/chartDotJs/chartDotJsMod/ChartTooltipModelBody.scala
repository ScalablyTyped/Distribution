package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipModelBody extends js.Object {
  var after: js.Array[String]
  var before: js.Array[String]
  var lines: js.Array[String]
}

object ChartTooltipModelBody {
  @scala.inline
  def apply(after: js.Array[String], before: js.Array[String], lines: js.Array[String]): ChartTooltipModelBody = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChartTooltipModelBody]
  }
}

