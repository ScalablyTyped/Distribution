package typings.chartJs.mod

import typings.chartJs.distChunksHelpersDotcoreMod.D_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarController extends D_ {
  
  /**
    * @private
    */
  /* private */ var _calculateBarIndexPixels: Any = js.native
  
  /**
    * Note: pixel values are not clamped to the scale area.
    * @private
    */
  /* private */ var _calculateBarValuePixels: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _getRuler: Any = js.native
  
  /**
    * Returns the effective number of stacks based on groups and bar visibility.
    * @private
    */
  /* private */ var _getStackCount: Any = js.native
  
  /**
    * Returns the stack index for the given dataset based on groups and bar visibility.
    * @param {number} [datasetIndex] - The dataset index
    * @param {string} [name] - The stack name to find
    * @param {number} [dataIndex]
    * @returns {number} The stack index
    * @private
    */
  /* private */ var _getStackIndex: Any = js.native
  
  /**
    * Returns the stacks based on groups and bar visibility.
    * @param {number} [last] - The dataset index
    * @param {number} [dataIndex] - The data index of the ruler
    * @returns {string[]} The list of stack IDs
    * @private
    */
  /* private */ var _getStacks: Any = js.native
  
  /**
    * Overriding array data parsing since we support mixed primitive/array
    * data for float bars
    * @protected
    */
  /* protected */ def parseArrayData(meta: Any, data: Any, start: Any, count: Any): js.Array[Any] = js.native
  
  /**
    * Overriding object data parsing since we support mixed primitive/array
    * value-scale data for float bars
    * @protected
    */
  /* protected */ def parseObjectData(meta: Any, data: Any, start: Any, count: Any): js.Array[Any] = js.native
  
  /**
    * Overriding primitive data parsing since we support mixed primitive/array
    * data for float bars
    * @protected
    */
  /* protected */ def parsePrimitiveData(meta: Any, data: Any, start: Any, count: Any): js.Array[Any] = js.native
  
  def update(mode: Any): scala.Unit = js.native
}
