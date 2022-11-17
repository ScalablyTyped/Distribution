package typings.chartJs.mod

import typings.chartJs.distChunksHelpersDotcoreMod.S_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogarithmicScale extends S_ {
  
  /** @type {number} */
  var _startValue: Double = js.native
  
  var _valueRange: Double = js.native
  
  var _zero: Boolean = js.native
  
  /** @type {number} */
  var end: Double = js.native
  
  /**
    * @param {number} value
    * @return {string}
    */
  def getLabelForValue(value: Double): String = js.native
  
  def getValueForPixel(pixel: Any): Double = js.native
  
  def handleTickRangeOptions(): scala.Unit = js.native
  
  def parse(raw: Any, index: Any): Double = js.native
  
  /** @type {number} */
  var start: Double = js.native
}
