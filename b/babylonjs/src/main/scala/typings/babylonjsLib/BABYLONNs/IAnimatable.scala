package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface containing an array of animations
  */
trait IAnimatable extends js.Object {
  /**
    * Array of animations
    */
  var animations: js.Array[Animation]
}

object IAnimatable {
  @scala.inline
  def apply(animations: js.Array[Animation]): IAnimatable = {
    val __obj = js.Dynamic.literal(animations = animations)
  
    __obj.asInstanceOf[IAnimatable]
  }
}

