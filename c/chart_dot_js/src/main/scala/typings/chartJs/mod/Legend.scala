package typings.chartJs.mod

import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Legend extends E[AnyObject, AnyObject] {
  
  var _added: Boolean = js.native
  
  /**
    * @private
    */
  /* private */ var _computeTitleHeight: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _draw: Any = js.native
  
  def _fitCols(titleHeight: Any, labelFont: Any, boxWidth: Any, _itemHeight: Any): Any = js.native
  
  /**
    * @private
    */
  /* private */ var _fitRows: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _getLegendItemAt: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _hoveredItem: Any = js.native
  
  var _margins: Any = js.native
  
  def adjustHitBoxes(): scala.Unit = js.native
  
  var bottom: Any = js.native
  
  def buildLabels(): scala.Unit = js.native
  
  var chart: Any = js.native
  
  var columnSizes: js.Array[Any] = js.native
  
  var ctx: Any = js.native
  
  var doughnutMode: Boolean = js.native
  
  def draw(): scala.Unit = js.native
  
  /**
    * @protected
    */
  /* protected */ def drawTitle(): scala.Unit = js.native
  
  def fit(): scala.Unit = js.native
  
  var fullSize: Any = js.native
  
  /**
    * Handle an event
    * @param {ChartEvent} e - The event to handle
    */
  def handleEvent(e: ChartEvent1): scala.Unit = js.native
  
  var height: Any = js.native
  
  def isHorizontal(): Boolean = js.native
  
  var left: Any = js.native
  
  var legendHitBoxes: js.Array[Any] = js.native
  
  var legendItems: Any = js.native
  
  var lineWidths: js.Array[Double] = js.native
  
  var maxHeight: Any = js.native
  
  var maxWidth: Any = js.native
  
  var position: Any = js.native
  
  var right: Any = js.native
  
  def setDimensions(): scala.Unit = js.native
  
  var top: Any = js.native
  
  def update(maxWidth: Any, maxHeight: Any, margins: Any): scala.Unit = js.native
  
  var weight: Any = js.native
  
  var width: Any = js.native
}
