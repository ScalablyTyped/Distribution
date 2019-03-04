package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the size containing width and height
  */
trait ISize extends js.Object {
  /**
    * Heighht
    */
  var height: scala.Double
  /**
    * Width
    */
  var width: scala.Double
}

object ISize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ISize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ISize]
  }
}

