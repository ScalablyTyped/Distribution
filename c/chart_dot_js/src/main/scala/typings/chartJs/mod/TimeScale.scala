package typings.chartJs.mod

import typings.chartJs.anon.All
import typings.chartJs.anon.IsoWeekday
import typings.chartJs.distChunksHelpersDotcoreMod.S_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeScale extends S_ {
  
  var _adapter: DateAdapter = js.native
  
  /** @type {{data: number[], labels: number[], all: number[]}} */
  var _cache: All = js.native
  
  /**
    * Generates a maximum of `capacity` timestamps between min and max, rounded to the
    * `minor` unit using the given scale time `options`.
    * Important: this method can return ticks outside the min and max range, it's the
    * responsibility of the calling code to clamp values if needed.
    * @private
    */
  /* private */ var _generate: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _getLabelBounds: Any = js.native
  
  /**
    * @param {number} exampleTime
    * @return {number}
    * @private
    */
  /* private */ var _getLabelCapacity: Any = js.native
  
  /**
    * @param {string} label
    * @return {{w:number, h:number}}
    * @private
    */
  /* private */ var _getLabelSize: Any = js.native
  
  /** @type {Unit=} */
  var _majorUnit: js.UndefOr[Unit] = js.native
  
  var _normalized: Boolean = js.native
  
  var _parseOpts: IsoWeekday = js.native
  
  /**
    * Function to format an individual tick mark
    * @param {number} time
    * @param {number} index
    * @param {object[]} ticks
    * @param {string|undefined} [format]
    * @return {string}
    * @private
    */
  /* private */ var _tickFormatFunction: Any = js.native
  
  /** @type {Unit} */
  var _unit: Unit = js.native
  
  /**
    * @protected
    */
  /* protected */ def getDataTimestamps(): Any = js.native
  
  /**
    * @param {number} value - Milliseconds since epoch (1 January 1970 00:00:00 UTC)
    * @return {number}
    */
  def getDecimalForValue(value: Double): Double = js.native
  
  /**
    * @param {number} value
    * @return {string}
    */
  def getLabelForValue(value: Double): String = js.native
  
  /**
    * @protected
    */
  /* protected */ def getLabelTimestamps(): js.Array[Double] = js.native
  
  /**
    * @param {number} value - Milliseconds since epoch (1 January 1970 00:00:00 UTC)
    * @return {number}
    */
  def getPixelForValue(value: Double): Double = js.native
  
  def init(scaleOpts: Any, opts: js.Object): scala.Unit = js.native
  
  /**
    * Returns the start and end offsets from edges in the form of {start, end}
    * where each value is a relative width to the scale and ranges between 0 and 1.
    * They add extra margins on the both sides by scaling down the original scale.
    * Offsets are added when the `offset` option is true.
    * @param {number[]} timestamps
    * @protected
    */
  /* protected */ def initOffsets(): scala.Unit = js.native
  /* protected */ def initOffsets(timestamps: js.Array[Double]): scala.Unit = js.native
  
  /**
    * @param {number[]} values
    * @protected
    */
  /* protected */ def normalize(values: js.Array[Double]): js.Array[Double] = js.native
}
