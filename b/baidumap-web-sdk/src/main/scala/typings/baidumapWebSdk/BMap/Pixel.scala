package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pixel extends js.Object {
  var x: Double
  var y: Double
  def equals(other: Pixel): Boolean
}

object Pixel {
  @scala.inline
  def apply(equals: Pixel => Boolean, x: Double, y: Double): Pixel = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pixel]
  }
}

