package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SmartArray")
@js.native
class SmartArray[T] protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: Double) = this()
  
  /* protected */ /* CompleteClass */
  var _id: Double = js.native
  
  /**
    * Concats the active data with a given array.
    * @param array defines the data to concatenate with.
    */
  /* CompleteClass */
  override def concat(array: js.Any): Unit = js.native
  
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
/* static members */
object SmartArray {
  
  @JSGlobal("BABYLON.SmartArray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.SmartArray._GlobalId")
  @js.native
  def _GlobalId: js.Any = js.native
  inline def _GlobalId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GlobalId")(x.asInstanceOf[js.Any])
}
