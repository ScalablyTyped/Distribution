package typings.chartJs.mod

import typings.chartJs.anon.DataIndex
import typings.chartJs.anon.Height
import typings.chartJs.anon.ReadonlyAnimations
import typings.chartJs.anon.X1
import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip extends E[AnyObject, AnyObject] {
  
  @JSName("$context")
  var $context: Any = js.native
  
  var _active: js.Array[Any] = js.native
  
  var _cachedAnimations: ReadonlyAnimations = js.native
  
  /**
    * @private
    */
  /* private */ var _createItems: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _drawColorBox: Any = js.native
  
  var _eventPosition: Any = js.native
  
  /**
    * Helper for determining the active elements for event
    * @param {ChartEvent} e - The event to handle
    * @param {InteractionItem[]} lastActive - Previously active elements
    * @param {boolean} [replay] - This is a replayed event (from update)
    * @param {boolean} [inChartArea] - The event is inside chartArea
    * @returns {InteractionItem[]} - Active elements
    * @private
    */
  /* private */ var _getActiveElements: Any = js.native
  
  var _ignoreReplayEvents: Boolean = js.native
  
  /**
    * Determine if the active elements + event combination changes the
    * tooltip position
    * @param {array} active - Active elements
    * @param {ChartEvent} e - Event that triggered the position change
    * @returns {boolean} True if the position has changed
    */
  def _positionChanged(active: js.Array[Any], e: ChartEvent): Boolean = js.native
  
  /**
    * @private
    */
  /* private */ var _resolveAnimations: Any = js.native
  
  var _size: Height = js.native
  
  var _tooltipItems: js.Array[Any] = js.native
  
  /**
    * Update x/y animation targets when _active elements are animating too
    * @private
    */
  /* private */ var _updateAnimationTarget: Any = js.native
  
  /**
    * Determine if the tooltip will draw anything
    * @returns {boolean} True if the tooltip will render
    */
  def _willRender(): Boolean = js.native
  
  var afterBody: Any = js.native
  
  var beforeBody: Any = js.native
  
  var body: js.Array[Any] = js.native
  
  var caretX: Any = js.native
  
  var caretY: Any = js.native
  
  var chart: Any = js.native
  
  var dataPoints: js.Array[DataIndex] = js.native
  
  def draw(ctx: Any): scala.Unit = js.native
  
  def drawBackground(pt: Any, ctx: Any, tooltipSize: Any, options: Any): scala.Unit = js.native
  
  def drawBody(pt: Any, ctx: Any, options: Any): scala.Unit = js.native
  
  def drawCaret(tooltipPoint: Any, ctx: Any, size: Any, options: Any): scala.Unit = js.native
  
  def drawFooter(pt: Any, ctx: Any, options: Any): scala.Unit = js.native
  
  def drawTitle(pt: Any, ctx: Any, options: Any): scala.Unit = js.native
  
  var footer: Any = js.native
  
  /**
    * Get active elements in the tooltip
    * @returns {Array} Array of elements that are active in the tooltip
    */
  def getActiveElements(): js.Array[Any] = js.native
  
  def getAfterBody(tooltipItems: Any, options: Any): Any = js.native
  
  def getBeforeBody(tooltipItems: Any, options: Any): Any = js.native
  
  def getBody(tooltipItems: Any, options: Any): js.Array[Any] = js.native
  
  def getCaretPosition(tooltipPoint: Any, size: Any, options: Any): X1 = js.native
  
  /**
    * @protected
    */
  /* protected */ def getContext(): Any = js.native
  
  def getFooter(tooltipItems: Any, options: Any): Any = js.native
  
  def getTitle(context: Any, options: Any): Any = js.native
  
  /**
    * Handle an event
    * @param {ChartEvent} e - The event to handle
    * @param {boolean} [replay] - This is a replayed event (from update)
    * @param {boolean} [inChartArea] - The event is inside chartArea
    * @returns {boolean} true if the tooltip changed
    */
  def handleEvent(e: ChartEvent): Boolean = js.native
  def handleEvent(e: ChartEvent, replay: Boolean): Boolean = js.native
  def handleEvent(e: ChartEvent, replay: Boolean, inChartArea: Boolean): Boolean = js.native
  def handleEvent(e: ChartEvent, replay: scala.Unit, inChartArea: Boolean): Boolean = js.native
  
  var height: Double = js.native
  
  def initialize(options: Any): scala.Unit = js.native
  
  var labelColors: js.Array[Any] = js.native
  
  var labelPointStyles: js.Array[Any] = js.native
  
  var labelTextColors: js.Array[Any] = js.native
  
  var opacity: Double = js.native
  
  /**
    * Set active elements in the tooltip
    * @param {array} activeElements Array of active datasetIndex/index pairs.
    * @param {object} eventPosition Synthetic event position used in positioning
    */
  def setActiveElements(activeElements: js.Array[Any], eventPosition: js.Object): scala.Unit = js.native
  
  var title: Any = js.native
  
  def update(changed: Any, replay: Any): scala.Unit = js.native
  
  var width: Double = js.native
  
  var xAlign: Any = js.native
  
  var yAlign: Any = js.native
}
