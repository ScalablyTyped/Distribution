package typings.chartJs

import typings.chartJs.distCoreCoreDotcontrollerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotlayoutsMod {
  
  object default {
    
    @JSImport("chart.js/dist/core/core.layouts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Register a box to a chart.
      * A box is simply a reference to an object that requires layout. eg. Scales, Legend, Title.
      * @param {Chart} chart - the chart to use
      * @param {LayoutItem} item - the item to add to be laid out
      */
    inline def addBox(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, item: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBox")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets (or updates) options on the given `item`.
      * @param {Chart} chart - the chart in which the item lives (or will be added to)
      * @param {LayoutItem} item - the item to configure with the given options
      * @param {object} options - the new item options.
      */
    inline def configure(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, item: LayoutItem, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Remove a layoutItem from a chart
      * @param {Chart} chart - the chart to remove the box from
      * @param {LayoutItem} layoutItem - the item to remove from the layout
      */
    inline def removeBox(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, layoutItem: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBox")(chart.asInstanceOf[js.Any], layoutItem.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Fits boxes of the given chart into the given size by having each box measure itself
      * then running a fitting algorithm
      * @param {Chart} chart - the chart
      * @param {number} width - the width to fit into
      * @param {number} height - the height to fit into
      * @param {number} minPadding - minimum padding required for each side of chart area
      */
    inline def update(
      chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
      width: Double,
      height: Double,
      minPadding: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(chart.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], minPadding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type Chart = default
  
  trait LayoutItem extends StObject {
    
    /**
      * - Bottom edge of the item. Set by layout system and cannot be used in update
      */
    var bottom: Double
    
    /**
      * - Draws the element
      */
    var draw: js.Function
    
    /**
      * - if true, and the item is horizontal, then push vertical boxes down
      */
    var fullSize: Boolean
    
    /**
      * -  Returns an object with padding on the edges
      */
    var getPadding: js.UndefOr[js.Function] = js.undefined
    
    /**
      * - Height of item. Must be valid after update()
      */
    var height: Double
    
    /**
      * - returns true if the layout item is horizontal (ie. top or bottom)
      */
    var isHorizontal: js.Function
    
    /**
      * - Left edge of the item. Set by layout system and cannot be used in update
      */
    var left: Double
    
    /**
      * - The position of the item in the chart layout. Possible values are
      * 'left', 'top', 'right', 'bottom', and 'chartArea'
      */
    var position: String
    
    /**
      * - Right edge of the item. Set by layout system and cannot be used in update
      */
    var right: Double
    
    /**
      * - Top edge of the item. Set by layout system and cannot be used in update
      */
    var top: Double
    
    /**
      * - Takes two parameters: width and height. Returns size of item
      */
    var update: js.Function
    
    /**
      * - The weight used to sort the item. Higher weights are further away from the chart area
      */
    var weight: Double
    
    /**
      * - Width of item. Must be valid after update()
      */
    var width: Double
  }
  object LayoutItem {
    
    inline def apply(
      bottom: Double,
      draw: js.Function,
      fullSize: Boolean,
      height: Double,
      isHorizontal: js.Function,
      left: Double,
      position: String,
      right: Double,
      top: Double,
      update: js.Function,
      weight: Double,
      width: Double
    ): LayoutItem = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], fullSize = fullSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isHorizontal = isHorizontal.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutItem] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setDraw(value: js.Function): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      inline def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
      
      inline def setGetPadding(value: js.Function): Self = StObject.set(x, "getPadding", value.asInstanceOf[js.Any])
      
      inline def setGetPaddingUndefined: Self = StObject.set(x, "getPadding", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsHorizontal(value: js.Function): Self = StObject.set(x, "isHorizontal", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: js.Function): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
