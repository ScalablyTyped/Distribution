package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScalesScaleDottimeseriesMod {
  
  @JSImport("chart.js/dist/scales/scale.timeseries", JSImport.Default)
  @js.native
  open class default () extends TimeSeriesScale
  
  @js.native
  trait TimeSeriesScale
    extends typings.chartJs.distScalesScaleDottimeMod.default {
    
    /**
      * Returns all timestamps
      * @return {number[]}
      * @private
      */
    /* private */ var _getTimestampsForTable: Any = js.native
    
    /** @type {number} */
    var _minPos: Double = js.native
    
    /** @type {object[]} */
    var _table: js.Array[js.Object] = js.native
    
    /** @type {number} */
    var _tableRange: Double = js.native
    
    /**
      * Returns an array of {time, pos} objects used to interpolate a specific `time` or position
      * (`pos`) on the scale, by searching entries before and after the requested value. `pos` is
      * a decimal between 0 and 1: 0 being the start of the scale (left or top) and 1 the other
      * extremity (left + width or top + height). Note that it would be more optimized to directly
      * store pre-computed pixels, but the scale dimensions are not guaranteed at the time we need
      * to create the lookup table. The table ALWAYS contains at least two items: min and max.
      * @param {number[]} timestamps
      * @return {object[]}
      * @protected
      */
    /* protected */ def buildLookupTable(timestamps: js.Array[Double]): js.Array[js.Object] = js.native
  }
}
