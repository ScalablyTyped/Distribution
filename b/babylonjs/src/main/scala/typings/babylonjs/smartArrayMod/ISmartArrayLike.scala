package typings.babylonjs.smartArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmartArrayLike[T] extends js.Object {
  /**
    * The data of the array.
    */
  var data: js.Array[T]
  /**
    * The active length of the array.
    */
  var length: Double
}

object ISmartArrayLike {
  @scala.inline
  def apply[T](data: js.Array[T], length: Double): ISmartArrayLike[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmartArrayLike[T]]
  }
}

