package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionModeMap extends StObject {
  
  /**
    * Returns items in the same dataset. If the options.intersect parameter is true, we only return items if we intersect something
    * If the options.intersect is false, we find the nearest item and return the items in that dataset
    */
  def dataset(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions
  ): js.Array[InteractionItem]
  def dataset(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions,
    useFinalPosition: Boolean
  ): js.Array[InteractionItem]
  /**
    * Returns items in the same dataset. If the options.intersect parameter is true, we only return items if we intersect something
    * If the options.intersect is false, we find the nearest item and return the items in that dataset
    */
  @JSName("dataset")
  var dataset_Original: InteractionModeFunction
  
  /**
    * Returns items at the same index. If the options.intersect parameter is true, we only return items if we intersect something
    * If the options.intersect mode is false, we find the nearest item and return the items at the same index as that item
    */
  def index(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions
  ): js.Array[InteractionItem]
  def index(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions,
    useFinalPosition: Boolean
  ): js.Array[InteractionItem]
  /**
    * Returns items at the same index. If the options.intersect parameter is true, we only return items if we intersect something
    * If the options.intersect mode is false, we find the nearest item and return the items at the same index as that item
    */
  @JSName("index")
  var index_Original: InteractionModeFunction
  
  /**
    * nearest mode returns the element closest to the point
    */
  def nearest(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions
  ): js.Array[InteractionItem]
  def nearest(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions,
    useFinalPosition: Boolean
  ): js.Array[InteractionItem]
  /**
    * nearest mode returns the element closest to the point
    */
  @JSName("nearest")
  var nearest_Original: InteractionModeFunction
  
  /**
    * Point mode returns all elements that hit test based on the event position
    * of the event
    */
  def point(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions
  ): js.Array[InteractionItem]
  def point(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions,
    useFinalPosition: Boolean
  ): js.Array[InteractionItem]
  /**
    * Point mode returns all elements that hit test based on the event position
    * of the event
    */
  @JSName("point")
  var point_Original: InteractionModeFunction
  
  /**
    * x mode returns the elements that hit-test at the current x coordinate
    */
  def x(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions
  ): js.Array[InteractionItem]
  def x(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions,
    useFinalPosition: Boolean
  ): js.Array[InteractionItem]
  /**
    * x mode returns the elements that hit-test at the current x coordinate
    */
  @JSName("x")
  var x_Original: InteractionModeFunction
  
  /**
    * y mode returns the elements that hit-test at the current y coordinate
    */
  def y(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions
  ): js.Array[InteractionItem]
  def y(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    e: ChartEvent,
    options: InteractionOptions,
    useFinalPosition: Boolean
  ): js.Array[InteractionItem]
  /**
    * y mode returns the elements that hit-test at the current y coordinate
    */
  @JSName("y")
  var y_Original: InteractionModeFunction
}
object InteractionModeMap {
  
  inline def apply(
    dataset: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem],
    index: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem],
    nearest: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem],
    point: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem],
    x: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem],
    y: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem]
  ): InteractionModeMap = {
    val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction4(dataset), index = js.Any.fromFunction4(index), nearest = js.Any.fromFunction4(nearest), point = js.Any.fromFunction4(point), x = js.Any.fromFunction4(x), y = js.Any.fromFunction4(y))
    __obj.asInstanceOf[InteractionModeMap]
  }
  
  extension [Self <: InteractionModeMap](x: Self) {
    
    inline def setDataset(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem]
    ): Self = StObject.set(x, "dataset", js.Any.fromFunction4(value))
    
    inline def setIndex(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem]
    ): Self = StObject.set(x, "index", js.Any.fromFunction4(value))
    
    inline def setNearest(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem]
    ): Self = StObject.set(x, "nearest", js.Any.fromFunction4(value))
    
    inline def setPoint(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem]
    ): Self = StObject.set(x, "point", js.Any.fromFunction4(value))
    
    inline def setX(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem]
    ): Self = StObject.set(x, "x", js.Any.fromFunction4(value))
    
    inline def setY(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* e */ ChartEvent, /* options */ InteractionOptions, /* useFinalPosition */ js.UndefOr[Boolean]) => js.Array[InteractionItem]
    ): Self = StObject.set(x, "y", js.Any.fromFunction4(value))
  }
}
