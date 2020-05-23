package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ArrayTools")
@js.native
class ArrayTools ()
  extends typings.babylonjs.BABYLON.ArrayTools

/* static members */
@JSGlobal("BABYLON.ArrayTools")
@js.native
object ArrayTools extends js.Object {
  /**
    * Returns an array of the given size filled with element built from the given constructor and the paramters
    * @param size the number of element to construct and put in the array
    * @param itemBuilder a callback responsible for creating new instance of item. Called once per array entry.
    * @returns a new array filled with new objects
    */
  def BuildArray[T](size: Double, itemBuilder: js.Function0[T]): js.Array[T] = js.native
}

