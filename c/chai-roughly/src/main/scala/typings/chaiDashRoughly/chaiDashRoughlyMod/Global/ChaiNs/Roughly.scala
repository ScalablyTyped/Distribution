package typings.chaiDashRoughly.chaiDashRoughlyMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For BDD APIs
@js.native
trait Roughly extends Assertion {
  def apply(): Assertion = js.native
  def apply(tolerance: Double): Assertion = js.native
}

