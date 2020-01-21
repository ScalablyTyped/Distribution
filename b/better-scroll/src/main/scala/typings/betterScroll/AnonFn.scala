package typings.betterScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var style: String
  def fn(t: Double): Double
}

object AnonFn {
  @scala.inline
  def apply(fn: Double => Double, style: String): AnonFn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFn]
  }
}

