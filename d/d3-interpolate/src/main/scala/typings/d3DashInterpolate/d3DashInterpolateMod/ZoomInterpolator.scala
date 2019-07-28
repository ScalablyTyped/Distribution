package typings.d3DashInterpolate.d3DashInterpolateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomInterpolator
  extends js.Function {
  /**
    * Recommended duration of zoom transition in milliseconds.
    */
  var duration: Double = js.native
  def apply(t: Double): ZoomView = js.native
}

