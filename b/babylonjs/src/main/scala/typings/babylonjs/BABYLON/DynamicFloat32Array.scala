package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicFloat32Array extends StObject {
  
  /**
    * Grows the array by the growth factor when necessary.
    */
  /* private */ var _growArray: Any = js.native
  
  /* private */ var _itemLength: Any = js.native
  
  /* private */ var _view: Any = js.native
  
  /**
    * Gets value at index, NaN if no such index exists.
    * @param index the index to get the value at.
    * @returns the value at the index provided.
    */
  def at(index: Double): Double = js.native
  
  /**
    * The number of items currently in the array.
    */
  def itemLength: Double = js.native
  
  /**
    * Pushes items to the end of the array.
    * @param item The item to push into the array.
    */
  def push(item: Double): Unit = js.native
  
  /**
    * Gets a view of the original array from start to end (exclusive of end).
    * @param start starting index.
    * @param end ending index.
    * @returns a subarray of the original array.
    */
  def subarray(start: Double, end: Double): js.typedarray.Float32Array = js.native
}
