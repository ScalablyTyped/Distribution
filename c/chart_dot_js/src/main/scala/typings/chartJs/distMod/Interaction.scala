package typings.chartJs.distMod

import typings.chartJs.distCoreCoreDotcontrollerMod.default
import typings.chartJs.distCoreCoreDotinteractionMod.InteractionItem
import typings.chartJs.distCoreCoreDotinteractionMod.InteractionOptions
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interaction {
  
  object modes {
    
    @JSImport("chart.js/dist", "Interaction.modes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns items in the same dataset. If the options.intersect parameter is true, we only return items if we intersect something
      * If the options.intersect is false, we find the nearest item and return the items in that dataset
      * @function Chart.Interaction.modes.dataset
      * @param {Chart} chart - the chart we are returning items from
      * @param {Event} e - the event we are find things at
      * @param {InteractionOptions} options - options to use
      * @param {boolean} [useFinalPosition] - use final element position (animation target)
      * @return {InteractionItem[]} - items that are found
      */
    inline def dataset(chart: default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    inline def dataset(chart: default, e: Event, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    
    /**
      * Returns items at the same index. If the options.intersect parameter is true, we only return items if we intersect something
      * If the options.intersect mode is false, we find the nearest item and return the items at the same index as that item
      * @function Chart.Interaction.modes.index
      * @since v2.4.0
      * @param {Chart} chart - the chart we are returning items from
      * @param {Event} e - the event we are find things at
      * @param {InteractionOptions} options - options to use
      * @param {boolean} [useFinalPosition] - use final element position (animation target)
      * @return {InteractionItem[]} - items that are found
      */
    inline def index(chart: default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    inline def index(chart: default, e: Event, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    
    /**
      * nearest mode returns the element closest to the point
      * @function Chart.Interaction.modes.intersect
      * @param {Chart} chart - the chart we are returning items from
      * @param {Event} e - the event we are find things at
      * @param {InteractionOptions} options - options to use
      * @param {boolean} [useFinalPosition] - use final element position (animation target)
      * @return {InteractionItem[]} - items that are found
      */
    inline def nearest(chart: default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    inline def nearest(chart: default, e: Event, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    
    /**
      * Point mode returns all elements that hit test based on the event position
      * of the event
      * @function Chart.Interaction.modes.intersect
      * @param {Chart} chart - the chart we are returning items from
      * @param {Event} e - the event we are find things at
      * @param {InteractionOptions} options - options to use
      * @param {boolean} [useFinalPosition] - use final element position (animation target)
      * @return {InteractionItem[]} - items that are found
      */
    inline def point(chart: default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    inline def point(chart: default, e: Event, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    
    /**
      * x mode returns the elements that hit-test at the current x coordinate
      * @function Chart.Interaction.modes.x
      * @param {Chart} chart - the chart we are returning items from
      * @param {Event} e - the event we are find things at
      * @param {InteractionOptions} options - options to use
      * @param {boolean} [useFinalPosition] - use final element position (animation target)
      * @return {InteractionItem[]} - items that are found
      */
    inline def x(chart: default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    inline def x(chart: default, e: Event, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    
    /**
      * y mode returns the elements that hit-test at the current y coordinate
      * @function Chart.Interaction.modes.y
      * @param {Chart} chart - the chart we are returning items from
      * @param {Event} e - the event we are find things at
      * @param {InteractionOptions} options - options to use
      * @param {boolean} [useFinalPosition] - use final element position (animation target)
      * @return {InteractionItem[]} - items that are found
      */
    inline def y(chart: default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("y")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    inline def y(chart: default, e: Event, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("y")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  }
}
