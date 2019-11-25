package typings.chartDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chartDotJsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.chartDotJs.Anon_Chart
  import typings.std.CanvasGradient
  import typings.std.CanvasPattern

  type BorderWidth = Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in chart.js.chart.js.PositionType ]:? number}
    */ typings.chartDotJs.chartDotJsStrings.BorderWidth with js.Any)
  type ChartColor = String | CanvasGradient | CanvasPattern | js.Array[String]
  // NOTE: declare plugin options as interface instead of inline '{ [plugin: string]: any }'
  // to allow module augmentation in case some plugins want to strictly type their options.
  type ChartPluginsOptions = StringDictionary[js.Any]
  type ChartTooltipPositioner = js.Function2[/* elements */ js.Array[js.Any], /* eventPosition */ Point, Point]
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = CommonAxe
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = TickOptions
  type Scriptable[T] = js.Function1[/* ctx */ Anon_Chart, T]
}
