package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an GC Friendly array where the backfield array do not shrink to prevent over allocations.
  */
@JSGlobal("BABYLON.SmartArray")
@js.native
class SmartArray[T] protected () extends ISmartArrayLike[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: scala.Double) = this()
  var _id: scala.Double = js.native
  /**
    * The data of the array.
    */
  /* CompleteClass */
  override var data: js.Array[T] = js.native
  /**
    * The active length of the array.
    */
  /* CompleteClass */
  override var length: scala.Double = js.native
  /**
    * Concats the active data with a given array.
    * @param array defines the data to concatenate with.
    */
  def concat(array: js.Any): scala.Unit = js.native
  /**
    * Returns whether an element is part of the active data.
    * @param value defines the value to look for
    * @returns true if found in the active data otherwise false
    */
  def contains(value: T): scala.Boolean = js.native
  /**
    * Releases all the data from the array as well as the array.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Iterates over the active data and apply the lambda to them.
    * @param func defines the action to apply on each value.
    */
  def forEach(func: js.Function1[/* content */ T, scala.Unit]): scala.Unit = js.native
  /**
    * Returns the position of a value in the active data.
    * @param value defines the value to find the index for
    * @returns the index if found in the active data otherwise -1
    */
  def indexOf(value: T): scala.Double = js.native
  /**
    * Pushes a value at the end of the active data.
    * @param value defines the object to push in the array.
    */
  def push(value: T): scala.Unit = js.native
  /**
    * Resets the active data to an empty array.
    */
  def reset(): scala.Unit = js.native
  /**
    * Sorts the full sets of data.
    * @param compareFn defines the comparison function to apply.
    */
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): scala.Unit = js.native
}

/**
  * Defines an GC Friendly array where the backfield array do not shrink to prevent over allocations.
  */
@JSGlobal("BABYLON.SmartArray")
@js.native
object SmartArray extends js.Object {
  var _GlobalId: js.Any = js.native
}

