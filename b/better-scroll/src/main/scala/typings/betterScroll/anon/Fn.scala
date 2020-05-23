package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fn extends js.Object {
  var style: String
  def fn(t: Double): Double
}

object Fn {
  @scala.inline
  def apply(fn: Double => Double, style: String): Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn]
  }
}

