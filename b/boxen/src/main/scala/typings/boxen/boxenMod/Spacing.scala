package typings.boxen.boxenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Spacing used for `padding` and `margin`.
	*/
trait Spacing extends js.Object {
  val bottom: Double
  val left: Double
  val right: Double
  val top: Double
}

object Spacing {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Spacing = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Spacing]
  }
}

