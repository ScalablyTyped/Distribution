package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SmartArrayNoDuplicate")
@js.native
class SmartArrayNoDuplicate[T] ()
  extends StObject
     with typings.babylonjs.BABYLON.SmartArrayNoDuplicate[T] {
  
  /* private */ /* CompleteClass */
  var _duplicateId: js.Any = js.native
  
  /* protected */ /* CompleteClass */
  var _id: Double = js.native
  
  /**
    * Concats the active data with a given array.
    * @param array defines the data to concatenate with.
    */
  /* CompleteClass */
  override def concat(array: js.Any): Unit = js.native
  
  /**
    * Concats the active data with a given array.
    * This ensures no dupplicate will be present in the result.
    * @param array defines the data to concatenate with.
    */
  /* CompleteClass */
  override def concatWithNoDuplicate(array: js.Any): Unit = js.native
  
  /**
    * Returns whether an element is part of the active data.
    * @param value defines the value to look for
    * @returns true if found in the active data otherwise false
    */
  /* CompleteClass */
  override def contains(value: T): Boolean = js.native
  
  /**
    * The data of the array.
    */
  /* CompleteClass */
  var data: js.Array[T] = js.native
  
  /**
    * Releases all the data from the array as well as the array.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Iterates over the active data and apply the lambda to them.
    * @param func defines the action to apply on each value.
    */
  /* CompleteClass */
  override def forEach(func: js.Function1[T, Unit]): Unit = js.native
  
  /**
    * Returns the position of a value in the active data.
    * @param value defines the value to find the index for
    * @returns the index if found in the active data otherwise -1
    */
  /* CompleteClass */
  override def indexOf(value: T): Double = js.native
  
  /**
    * The active length of the array.
    */
  /* CompleteClass */
  var length: Double = js.native
  
  /**
    * Pushes a value at the end of the active data.
    * @param value defines the object to push in the array.
    */
  /* CompleteClass */
  override def push(value: T): Unit = js.native
  
  /**
    * Pushes a value at the end of the active data.
    * If the data is already present, it won t be added again
    * @param value defines the object to push in the array.
    * @returns true if added false if it was already present
    */
  /* CompleteClass */
  override def pushNoDuplicate(value: T): Boolean = js.native
  
  /**
    * Resets the active data to an empty array.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * Sorts the full sets of data.
    * @param compareFn defines the comparison function to apply.
    */
  /* CompleteClass */
  override def sort(compareFn: js.Function2[T, T, Double]): Unit = js.native
}
