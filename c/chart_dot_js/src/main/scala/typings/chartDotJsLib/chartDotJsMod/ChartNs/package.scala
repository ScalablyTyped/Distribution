package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChartNs {
  type ChartColor = java.lang.String | stdLib.CanvasGradient | stdLib.CanvasPattern | js.Array[java.lang.String]
  type ChartTooltipPositioner = js.Function2[/* elements */ js.Array[js.Any], /* eventPosition */ Point, Point]
  type ChartType = chartDotJsLib.chartDotJsLibStrings.line | chartDotJsLib.chartDotJsLibStrings.bar | chartDotJsLib.chartDotJsLibStrings.horizontalBar | chartDotJsLib.chartDotJsLibStrings.radar | chartDotJsLib.chartDotJsLibStrings.doughnut | chartDotJsLib.chartDotJsLibStrings.polarArea | chartDotJsLib.chartDotJsLibStrings.bubble | chartDotJsLib.chartDotJsLibStrings.pie | chartDotJsLib.chartDotJsLibStrings.scatter
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = CommonAxe
  type InteractionMode = chartDotJsLib.chartDotJsLibStrings.point | chartDotJsLib.chartDotJsLibStrings.nearest | chartDotJsLib.chartDotJsLibStrings.single | chartDotJsLib.chartDotJsLibStrings.label | chartDotJsLib.chartDotJsLibStrings.index | chartDotJsLib.chartDotJsLibStrings.`x-axis` | chartDotJsLib.chartDotJsLibStrings.dataset | chartDotJsLib.chartDotJsLibStrings.x | chartDotJsLib.chartDotJsLibStrings.y
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = TickOptions
  type PointStyle = chartDotJsLib.chartDotJsLibStrings.circle | chartDotJsLib.chartDotJsLibStrings.cross | chartDotJsLib.chartDotJsLibStrings.crossRot | chartDotJsLib.chartDotJsLibStrings.dash | chartDotJsLib.chartDotJsLibStrings.line | chartDotJsLib.chartDotJsLibStrings.rect | chartDotJsLib.chartDotJsLibStrings.rectRounded | chartDotJsLib.chartDotJsLibStrings.rectRot | chartDotJsLib.chartDotJsLibStrings.star | chartDotJsLib.chartDotJsLibStrings.triangle
  type PositionType = chartDotJsLib.chartDotJsLibStrings.left | chartDotJsLib.chartDotJsLibStrings.right | chartDotJsLib.chartDotJsLibStrings.top | chartDotJsLib.chartDotJsLibStrings.bottom
  type ScaleType = chartDotJsLib.chartDotJsLibStrings.category | chartDotJsLib.chartDotJsLibStrings.linear | chartDotJsLib.chartDotJsLibStrings.logarithmic | chartDotJsLib.chartDotJsLibStrings.time | chartDotJsLib.chartDotJsLibStrings.radialLinear
  type TimeUnit = chartDotJsLib.chartDotJsLibStrings.millisecond | chartDotJsLib.chartDotJsLibStrings.second | chartDotJsLib.chartDotJsLibStrings.minute | chartDotJsLib.chartDotJsLibStrings.hour | chartDotJsLib.chartDotJsLibStrings.day | chartDotJsLib.chartDotJsLibStrings.week | chartDotJsLib.chartDotJsLibStrings.month | chartDotJsLib.chartDotJsLibStrings.quarter | chartDotJsLib.chartDotJsLibStrings.year
}
