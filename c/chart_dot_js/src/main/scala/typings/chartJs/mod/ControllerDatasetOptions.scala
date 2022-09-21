package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.geometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerDatasetOptions
  extends StObject
     with ParsingOptions {
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  /**
    * Configures the visibility state of the dataset. Set it to true, to hide the dataset from the chart.
    * @default false
    */
  var hidden: Boolean
  
  /**
    * The base axis of the chart. 'x' for vertical charts and 'y' for horizontal charts.
    * @default 'x'
    */
  var indexAxis: x | y
  
  /**
    * The label for the dataset which appears in the legend and tooltips.
    */
  var label: String
  
  /**
    * The drawing order of dataset. Also affects order for stacking, tooltip and legend.
    */
  var order: Double
  
  /**
    * The ID of the group to which this dataset belongs to (when stacked, each group will be a separate stack).
    */
  var stack: String
}
object ControllerDatasetOptions {
  
  inline def apply(
    clip: Double | ChartArea | `false`,
    hidden: Boolean,
    indexAxis: x | y,
    label: String,
    normalized: Boolean,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    stack: String
  ): ControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerDatasetOptions]
  }
  
  extension [Self <: ControllerDatasetOptions](x: Self) {
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
