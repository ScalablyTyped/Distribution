package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChartNs {
  type ChartColor = java.lang.String | stdLib.CanvasGradient | stdLib.CanvasPattern | js.Array[java.lang.String]
  type ChartTooltipPositioner = js.Function2[/* elements */ js.Array[js.Any], /* eventPosition */ Point, Point]
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = CommonAxe
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = TickOptions
}
