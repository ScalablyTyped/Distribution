package typings.bezierEasing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bezier-easing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction = js.native
  type EasingFunction = js.Function1[/* input */ Double, Double]
}

