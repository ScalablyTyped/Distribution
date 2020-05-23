package typings.box2d.Box2D.Common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Color extends js.Object {
  /**
    * Blue
    **/
  var b: Double
  /**
    * RGB color as hex.
    * @type uint
    **/
  var color: Double
  /**
    * Green
    **/
  var g: Double
  /**
    * Red
    **/
  var r: Double
  /**
    * Sets the Color to new RGB values.
    * @param rr Red value
    * @param gg Green value
    * @param bb Blue value
    **/
  def Set(rr: Double, gg: Double, bb: Double): Unit
}

object b2Color {
  @scala.inline
  def apply(Set: (Double, Double, Double) => Unit, b: Double, color: Double, g: Double, r: Double): b2Color = {
    val __obj = js.Dynamic.literal(Set = js.Any.fromFunction3(Set), b = b.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Color]
  }
}

