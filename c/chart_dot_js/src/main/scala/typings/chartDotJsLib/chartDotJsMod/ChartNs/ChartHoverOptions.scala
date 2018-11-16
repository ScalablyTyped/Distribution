package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartHoverOptions extends js.Object {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var intersect: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[InteractionMode] = js.undefined
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ chartDotJsLib.chartDotJsMod.Chart, 
      /* event */ stdLib.MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.undefined
}

