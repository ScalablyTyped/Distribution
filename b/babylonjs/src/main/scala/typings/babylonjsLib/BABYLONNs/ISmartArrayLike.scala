package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an array and its length.
  * It can be helpfull to group result from both Arrays and smart arrays in one structure.
  */
trait ISmartArrayLike[T] extends js.Object {
  /**
    * The data of the array.
    */
  var data: js.Array[T]
  /**
    * The active length of the array.
    */
  var length: scala.Double
}

object ISmartArrayLike {
  @scala.inline
  def apply[T](data: js.Array[T], length: scala.Double): ISmartArrayLike[T] = {
    val __obj = js.Dynamic.literal(data = data, length = length)
  
    __obj.asInstanceOf[ISmartArrayLike[T]]
  }
}

