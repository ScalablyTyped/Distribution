package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipsStaticConfiguration extends js.Object {
  var positioners: StringDictionary[ChartTooltipPositioner]
}

object ChartTooltipsStaticConfiguration {
  @scala.inline
  def apply(positioners: StringDictionary[ChartTooltipPositioner]): ChartTooltipsStaticConfiguration = {
    val __obj = js.Dynamic.literal(positioners = positioners.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChartTooltipsStaticConfiguration]
  }
}

