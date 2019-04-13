package typings
package chartDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chartDotJsMod {
  type ChartColor = java.lang.String | stdLib.CanvasGradient | stdLib.CanvasPattern | js.Array[java.lang.String]
  // NOTE: declare plugin options as interface instead of inline '{ [plugin: string]: any }'
  // to allow module augmentation in case some plugins want to strictly type their options.
  type ChartPluginsOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ChartTooltipPositioner = js.Function2[/* elements */ js.Array[js.Any], /* eventPosition */ Point, Point]
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = CommonAxe
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = TickOptions
}
