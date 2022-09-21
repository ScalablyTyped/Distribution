package typings.vegaLite8ozrbXDH.channeldefDTsMod

import typings.vegaLite8ozrbXDH.stackDotDTsMod.StackOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionBaseMixins extends StObject {
  
  /**
    * Type of stacking offset if the field should be stacked.
    * `stack` is only applicable for `x`, `y`, `theta`, and `radius` channels with continuous domains.
    * For example, `stack` of `y` can be used to customize stacking for a vertical bar chart.
    *
    * `stack` can be one of the following values:
    * - `"zero"` or `true`: stacking with baseline offset at zero value of the scale (for creating typical stacked [bar](https://vega.github.io/vega-lite/docs/stack.html#bar) and [area](https://vega.github.io/vega-lite/docs/stack.html#area) chart).
    * - `"normalize"` - stacking with normalized domain (for creating [normalized stacked bar and area charts](https://vega.github.io/vega-lite/docs/stack.html#normalized). <br/>
    * -`"center"` - stacking with center baseline (for [streamgraph](https://vega.github.io/vega-lite/docs/stack.html#streamgraph)).
    * - `null` or `false` - No-stacking. This will produce layered [bar](https://vega.github.io/vega-lite/docs/stack.html#layered-bar-chart) and area chart.
    *
    * __Default value:__ `zero` for plots with all of the following conditions are true:
    * (1) the mark is `bar`, `area`, or `arc`;
    * (2) the stacked measure channel (x or y) has a linear scale;
    * (3) At least one of non-position channels mapped to an unaggregated field that is different from x and y. Otherwise, `null` by default.
    *
    * __See also:__ [`stack`](https://vega.github.io/vega-lite/docs/stack.html) documentation.
    */
  var stack: js.UndefOr[StackOffset | Null | Boolean] = js.undefined
}
object PositionBaseMixins {
  
  inline def apply(): PositionBaseMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionBaseMixins]
  }
  
  extension [Self <: PositionBaseMixins](x: Self) {
    
    inline def setStack(value: StackOffset | Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackNull: Self = StObject.set(x, "stack", null)
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
