package typings.chartJs.mod

import typings.chartJs.distChunksHelpersDotcoreMod.S_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearScaleBase extends S_ {
  
  /** @type {number} */
  var _endValue: Double = js.native
  
  /** @type {number} */
  var _startValue: Double = js.native
  
  var _valueRange: Double = js.native
  
  /**
    * @protected
    */
  /* protected */ def computeTickLimit(): Double = js.native
  
  /** @type {number} */
  var end: Double = js.native
  
  def getTickLimit(): Double = js.native
  
  def handleTickRangeOptions(): scala.Unit = js.native
  
  def parse(raw: Any, index: Any): Double = js.native
  
  /** @type {number} */
  var start: Double = js.native
}
