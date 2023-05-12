package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.FullSize
import typings.chartJs.distTypesLayoutMod.LayoutItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layouts {
  
  @JSImport("chart.js/dist/types/index", "layouts")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Register a box to a chart.
    * A box is simply a reference to an object that requires layout. eg. Scales, Legend, Title.
    * @param {Chart} chart - the chart to use
    * @param {LayoutItem} item - the item to add to be laid out
    */
  inline def addBox(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], item: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBox")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets (or updates) options on the given `item`.
    * @param {Chart} chart - the chart in which the item lives (or will be added to)
    * @param {LayoutItem} item - the item to configure with the given options
    * @param options - the new item options.
    */
  inline def configure(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], item: LayoutItem, options: FullSize): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Remove a layoutItem from a chart
    * @param {Chart} chart - the chart to remove the box from
    * @param {LayoutItem} layoutItem - the item to remove from the layout
    */
  inline def removeBox(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], layoutItem: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBox")(chart.asInstanceOf[js.Any], layoutItem.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fits boxes of the given chart into the given size by having each box measure itself
    * then running a fitting algorithm
    * @param {Chart} chart - the chart
    * @param {number} width - the width to fit into
    * @param {number} height - the height to fit into
    */
  inline def update(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(chart.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
