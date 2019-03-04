package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Size options for a post process
  */
trait PostProcessOptions extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object PostProcessOptions {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): PostProcessOptions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[PostProcessOptions]
  }
}

