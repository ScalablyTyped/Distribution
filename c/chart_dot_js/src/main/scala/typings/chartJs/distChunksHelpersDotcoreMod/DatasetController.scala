package typings.chartJs.distChunksHelpersDotcoreMod

import typings.chartJs.anon.IncludeOptions
import typings.chartJs.anon.Label
import typings.chartJs.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetController extends StObject {
  
  @JSName("$context")
  var $context: Any = js.native
  
  var _cachedMeta: Any = js.native
  
  var _ctx: Any = js.native
  
  var _data: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _dataCheck: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _destroy: Any = js.native
  
  var _drawCount: Any = js.native
  
  var _drawStart: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _getOtherScale: Any = js.native
  
  /**
    * @todo v4, rename to getSharedOptions and remove excess functions
    */
  def _getSharedOptions(start: Any, mode: Any): IncludeOptions = js.native
  
  /**
    * @private
    */
  /* private */ var _insertElements: Any = js.native
  
  var _objectData: Any = js.native
  
  def _onDataPop(): Unit = js.native
  
  def _onDataPush(args: Any*): Unit = js.native
  
  def _onDataShift(): Unit = js.native
  
  def _onDataSplice(start: Any, count: Any, args: Any*): Unit = js.native
  
  def _onDataUnshift(args: Any*): Unit = js.native
  
  /** @type {boolean | object} */
  var _parsing: Boolean | js.Object = js.native
  
  /**
    * @private
    */
  /* private */ var _removeDatasetHoverStyle: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _removeElements: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _resolveAnimations: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _resolveElementOptions: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _resyncElements: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _setDatasetHoverStyle: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _setStyle: Any = js.native
  
  var _sharedOptions: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _sync: Any = js.native
  
  var _syncList: js.Array[Any] = js.native
  
  var _type: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _update: Any = js.native
  
  def addElements(): Unit = js.native
  
  /**
    * @protected
    */
  /* protected */ def applyStack(scale: Any, parsed: Any, mode: Any): Any = js.native
  
  def buildOrUpdateElements(resetNewElements: Any): Unit = js.native
  
  var chart: Chart2 = js.native
  
  /**
    * Merges user-supplied and default dataset-level options
    * @private
    */
  /* private */ var configure: Any = js.native
  
  var dataElementType: Any = js.native
  
  var datasetElementType: Any = js.native
  
  def draw(): Unit = js.native
  
  var enableOptionSharing: Boolean = js.native
  
  def getAllParsedValues(scale: Any): js.Array[Double] = js.native
  
  /**
    * @protected
    */
  /* protected */ def getContext(index: Any, active: Any, mode: Any): Any = js.native
  
  /**
    * @protected
    */
  /* protected */ def getDataElement(index: Any): Any = js.native
  
  def getDataset(): Any = js.native
  
  /**
    * @protected
    */
  /* protected */ def getLabelAndValue(index: Any): Label = js.native
  
  /**
    * @return {number|boolean}
    * @protected
    */
  /* protected */ def getMaxOverflow(): Double | Boolean = js.native
  
  def getMeta(): Any = js.native
  
  /**
    * @protected
    */
  /* protected */ def getMinMax(scale: Any, canStack: Any): Max = js.native
  
  /**
    * @protected
    */
  /* protected */ def getParsed(index: Any): Any = js.native
  
  /**
    * @param {string} scaleID
    * @return {Scale}
    */
  def getScaleForId(scaleID: String): Scale = js.native
  
  /**
    * Utility for getting the options object shared between elements
    * @protected
    */
  /* protected */ def getSharedOptions(options: Any): Any = js.native
  
  /**
    * Returns a set of predefined style properties that should be used to represent the dataset
    * or the data if the index is specified
    * @param {number} index - data index
    * @param {boolean} [active] - true if hover
    * @return {object} style object
    */
  def getStyle(index: Double): js.Object = js.native
  def getStyle(index: Double, active: Boolean): js.Object = js.native
  
  /**
    * Utility for determining if `options` should be included in the updated properties
    * @protected
    */
  /* protected */ def includeOptions(mode: Any, sharedOptions: Any): Boolean = js.native
  
  var index: Double = js.native
  
  def initialize(): Unit = js.native
  
  def linkScales(): Unit = js.native
  
  var options: Any = js.native
  
  /**
    * @param {number} start
    * @param {number} count
    */
  def parse(start: Double, count: Double): Unit = js.native
  
  /**
    * Parse array of arrays
    * @param {object} meta - dataset meta
    * @param {array} data - data array. Example [[1,2],[3,4]]
    * @param {number} start - start index
    * @param {number} count - number of items to parse
    * @returns {object} parsed item - item containing index and a parsed value
    * for each scale id.
    * Example: {x: 0, y: 1}
    * @protected
    */
  /* protected */ def parseArrayData(meta: js.Object, data: js.Array[Any], start: Double, count: Double): js.Object = js.native
  
  /**
    * Parse array of objects
    * @param {object} meta - dataset meta
    * @param {array} data - data array. Example [{x:1, y:5}, {x:2, y:10}]
    * @param {number} start - start index
    * @param {number} count - number of items to parse
    * @returns {object} parsed item - item containing index and a parsed value
    * for each scale id. _custom is optional
    * Example: {xScale0: 0, yScale0: 1, _custom: {r: 10, foo: 'bar'}}
    * @protected
    */
  /* protected */ def parseObjectData(meta: js.Object, data: js.Array[Any], start: Double, count: Double): js.Object = js.native
  
  /**
    * Parse array of primitive values
    * @param {object} meta - dataset meta
    * @param {array} data - data array. Example [1,3,4]
    * @param {number} start - start index
    * @param {number} count - number of items to parse
    * @returns {object} parsed item - item containing index and a parsed value
    * for each scale id.
    * Example: {xScale0: 0, yScale0: 1}
    * @protected
    */
  /* protected */ def parsePrimitiveData(meta: js.Object, data: js.Array[Any], start: Double, count: Double): js.Object = js.native
  
  def removeHoverStyle(element: Any, datasetIndex: Any, index: Any): Unit = js.native
  
  def reset(): Unit = js.native
  
  /**
    * @param {number} index
    * @param {string} [mode]
    * @protected
    */
  /* protected */ def resolveDataElementOptions(index: Double): Any = js.native
  /* protected */ def resolveDataElementOptions(index: Double, mode: String): Any = js.native
  
  /**
    * @param {string} [mode]
    * @protected
    */
  /* protected */ def resolveDatasetElementOptions(): Any = js.native
  /* protected */ def resolveDatasetElementOptions(mode: String): Any = js.native
  
  def setHoverStyle(element: Any, datasetIndex: Any, index: Any): Unit = js.native
  
  var supportsDecimation: Boolean = js.native
  
  /**
    * @param {string} mode
    */
  def update(mode: String): Unit = js.native
  
  /**
    * Utility for updating an element with new properties, using animations when appropriate.
    * @protected
    */
  /* protected */ def updateElement(element: Any, index: Any, properties: Any, mode: Any): Unit = js.native
  
  def updateElements(element: Any, start: Any, count: Any, mode: Any): Unit = js.native
  
  def updateIndex(datasetIndex: Any): Unit = js.native
  
  /**
    * @protected
    */
  /* protected */ def updateRangeFromParsed(range: Any, scale: Any, parsed: Any, stack: Any): Unit = js.native
  
  /**
    * Utility to animate the shared options, that are potentially affecting multiple elements.
    * @protected
    */
  /* protected */ def updateSharedOptions(sharedOptions: Any, mode: Any, newOptions: Any): Unit = js.native
}
