package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines an GC Friendly array where the backfield array do not shrink to prevent over allocations.
     * The data in this array can only be present once
     */
@JSGlobal("BABYLON.SmartArrayNoDuplicate")
@js.native
class SmartArrayNoDuplicate[T] () extends SmartArray[T] {
  var _duplicateId: js.Any = js.native
  /**
           * Concats the active data with a given array.
           * This ensures no dupplicate will be present in the result.
           * @param array defines the data to concatenate with.
           */
  def concatWithNoDuplicate(array: js.Any): scala.Unit = js.native
  /**
           * Pushes a value at the end of the active data.
           * If the data is already present, it won t be added again
           * @param value defines the object to push in the array.
           * @returns true if added false if it was already present
           */
  def pushNoDuplicate(value: T): scala.Boolean = js.native
}

