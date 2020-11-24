package typings.babylonjs.smartArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/smartArray", "SmartArrayNoDuplicate")
@js.native
class SmartArrayNoDuplicate[T] () extends SmartArray[T] {
  
  var _duplicateId: js.Any = js.native
  
  /**
    * Concats the active data with a given array.
    * This ensures no dupplicate will be present in the result.
    * @param array defines the data to concatenate with.
    */
  def concatWithNoDuplicate(array: js.Any): Unit = js.native
  
  /**
    * Pushes a value at the end of the active data.
    * If the data is already present, it won t be added again
    * @param value defines the object to push in the array.
    * @returns true if added false if it was already present
    */
  def pushNoDuplicate(value: T): Boolean = js.native
}
