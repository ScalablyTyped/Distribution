package typings.chartJs

import typings.chartJs.distCoreCoreDotcontrollerMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotinteractionMod {
  
  object default {
    
    object modes {
      
      @JSImport("chart.js/dist/core/core.interaction", "default.modes")
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
      inline def dataset(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def dataset(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
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
      inline def index(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def index(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * nearest mode returns the element closest to the point
        * @function Chart.Interaction.modes.intersect
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def nearest(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def nearest(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
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
      inline def point(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def point(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * x mode returns the elements that hit-test at the current x coordinate
        * @function Chart.Interaction.modes.x
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def x(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def x(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * y mode returns the elements that hit-test at the current y coordinate
        * @function Chart.Interaction.modes.y
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def y(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("y")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def y(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("y")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    }
  }
  
  type Chart = default
  
  type ChartEvent = typings.chartJs.distTypesIndexMod.ChartEvent
  
  trait InteractionItem extends StObject {
    
    var datasetIndex: Double
    
    var element: typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject]
    
    var index: Double
  }
  object InteractionItem {
    
    inline def apply(
      datasetIndex: Double,
      element: typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject],
      index: Double
    ): InteractionItem = {
      val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionItem] (val x: Self) extends AnyVal {
      
      inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
      
      inline def setElement(value: typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionOptions extends StObject {
    
    var axis: js.UndefOr[String] = js.undefined
    
    var includeInvisible: js.UndefOr[Boolean] = js.undefined
    
    var intersect: js.UndefOr[Boolean] = js.undefined
  }
  object InteractionOptions {
    
    inline def apply(): InteractionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionOptions] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setIncludeInvisible(value: Boolean): Self = StObject.set(x, "includeInvisible", value.asInstanceOf[js.Any])
      
      inline def setIncludeInvisibleUndefined: Self = StObject.set(x, "includeInvisible", js.undefined)
      
      inline def setIntersect(value: Boolean): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
      
      inline def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
    }
  }
  
  type Point = typings.chartJs.distTypesGeometricMod.Point
}
