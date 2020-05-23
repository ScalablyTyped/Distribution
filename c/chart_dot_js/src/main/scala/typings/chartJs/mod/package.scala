package typings.chartJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BorderWidth = scala.Double | typings.chartJs.anon.keyinPositionTypenumber
  type ChartColor = java.lang.String | typings.std.CanvasGradient | typings.std.CanvasPattern | js.Array[java.lang.String]
  // NOTE: declare plugin options as interface instead of inline '{ [plugin: string]: any }'
  // to allow module augmentation in case some plugins want to strictly type their options.
  type ChartPluginsOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ChartTooltipPositioner = js.Function2[
    /* elements */ js.Array[js.Any], 
    /* eventPosition */ typings.chartJs.mod.Point, 
    typings.chartJs.mod.Point
  ]
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = typings.chartJs.mod.CommonAxe
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = typings.chartJs.mod.TickOptions
  type Scriptable[T] = js.Function1[/* ctx */ typings.chartJs.anon.Chart, T]
}
