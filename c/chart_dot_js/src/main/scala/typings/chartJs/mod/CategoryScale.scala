package typings.chartJs.mod

import typings.chartJs.distChunksHelpersDotcoreMod.S_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryScale extends S_ {
  
  var _addedLabels: js.Array[Any] = js.native
  
  /** @type {number} */
  var _startValue: Double = js.native
  
  var _valueRange: Double = js.native
  
  def getPixelForTick(index: Any): Double = js.native
  
  def getValueForPixel(pixel: Any): Double = js.native
  
  def parse(raw: Any, index: Any): Double = js.native
}
