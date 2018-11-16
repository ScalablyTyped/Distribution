package typings
package d3DashInterpolateLib.d3DashInterpolateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomInterpolator
  extends js.Function {
  /**
       * Recommended duration of zoom transition in milliseconds.
       */
  var duration: scala.Double = js.native
  def apply(t: scala.Double): ZoomView = js.native
}

