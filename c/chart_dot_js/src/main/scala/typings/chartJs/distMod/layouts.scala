package typings.chartJs.distMod

import typings.chartJs.distCoreCoreDotcontrollerMod.default
import typings.chartJs.distCoreCoreDotlayoutsMod.LayoutItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layouts {
  
  @JSImport("chart.js/dist", "layouts")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Register a box to a chart.
    * A box is simply a reference to an object that requires layout. eg. Scales, Legend, Title.
    * @param {Chart} chart - the chart to use
    * @param {LayoutItem} item - the item to add to be laid out
    */
  inline def addBox(chart: default, item: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBox")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets (or updates) options on the given `item`.
    * @param {Chart} chart - the chart in which the item lives (or will be added to)
    * @param {LayoutItem} item - the item to configure with the given options
    * @param {object} options - the new item options.
    */
  inline def configure(chart: default, item: LayoutItem, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Remove a layoutItem from a chart
    * @param {Chart} chart - the chart to remove the box from
    * @param {LayoutItem} layoutItem - the item to remove from the layout
    */
  inline def removeBox(chart: default, layoutItem: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBox")(chart.asInstanceOf[js.Any], layoutItem.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fits boxes of the given chart into the given size by having each box measure itself
    * then running a fitting algorithm
    * @param {Chart} chart - the chart
    * @param {number} width - the width to fit into
    * @param {number} height - the height to fit into
    * @param {number} minPadding - minimum padding required for each side of chart area
    */
  inline def update(chart: default, width: Double, height: Double, minPadding: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(chart.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], minPadding.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
