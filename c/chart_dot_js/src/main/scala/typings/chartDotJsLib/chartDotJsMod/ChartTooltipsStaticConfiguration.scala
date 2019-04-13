package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipsStaticConfiguration extends js.Object {
  var positioners: org.scalablytyped.runtime.StringDictionary[ChartTooltipPositioner]
}

object ChartTooltipsStaticConfiguration {
  @scala.inline
  def apply(positioners: org.scalablytyped.runtime.StringDictionary[ChartTooltipPositioner]): ChartTooltipsStaticConfiguration = {
    val __obj = js.Dynamic.literal(positioners = positioners)
  
    __obj.asInstanceOf[ChartTooltipsStaticConfiguration]
  }
}

