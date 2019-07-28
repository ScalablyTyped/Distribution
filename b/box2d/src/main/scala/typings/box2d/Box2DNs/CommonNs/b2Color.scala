package typings.box2d.Box2DNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.b2Color")
@js.native
class b2Color protected () extends js.Object {
  /**
  		* Constructor
  		* @param rr Red value
  		* @param gg Green value
  		* @param bb Blue value
  		**/
  def this(rr: Double, gg: Double, bb: Double) = this()
  /**
  		* Blue
  		**/
  var b: Double = js.native
  /**
  		* RGB color as hex.
  		* @type uint
  		**/
  var color: Double = js.native
  /**
  		* Green
  		**/
  var g: Double = js.native
  /**
  		* Red
  		**/
  var r: Double = js.native
  /**
  		* Sets the Color to new RGB values.
  		* @param rr Red value
  		* @param gg Green value
  		* @param bb Blue value
  		**/
  def Set(rr: Double, gg: Double, bb: Double): Unit = js.native
}

