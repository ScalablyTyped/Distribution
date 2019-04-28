package typings
package boxenLib.boxenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Spacing used for `padding` and `margin`.
	*/
trait Spacing extends js.Object {
  val bottom: scala.Double
  val left: scala.Double
  val right: scala.Double
  val top: scala.Double
}

object Spacing {
  @scala.inline
  def apply(bottom: scala.Double, left: scala.Double, right: scala.Double, top: scala.Double): Spacing = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Spacing]
  }
}

