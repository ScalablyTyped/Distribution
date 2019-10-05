package typings.bezierDashEasing

import typings.bezierDashEasing.bezierDashEasingMod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bezier-easing", JSImport.Namespace)
@js.native
object bezierDashEasingMod extends js.Object {
  def apply(mX1: Double, mY1: Double, mX2: Double, mY2: Double): Easing = js.native
  type Easing = js.Function1[/* x */ Double, Double]
}

