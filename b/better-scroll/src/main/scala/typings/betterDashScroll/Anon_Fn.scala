package typings.betterDashScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fn extends js.Object {
  var style: String
  def fn(t: Double): Double
}

object Anon_Fn {
  @scala.inline
  def apply(fn: Double => Double, style: String): Anon_Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style)
  
    __obj.asInstanceOf[Anon_Fn]
  }
}

