package typings.cropperjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NaturalHeight extends js.Object {
  /**
    * the natural height of the canvas (read only)
    */
  var naturalHeight: Double
  /**
    * the natural width of the canvas (read only)
    */
  var naturalWidth: Double
}

object Anon_NaturalHeight {
  @scala.inline
  def apply(naturalHeight: Double, naturalWidth: Double): Anon_NaturalHeight = {
    val __obj = js.Dynamic.literal(naturalHeight = naturalHeight, naturalWidth = naturalWidth)
  
    __obj.asInstanceOf[Anon_NaturalHeight]
  }
}

