package typings
package chaiDashRoughlyLib.chaiDashRoughlyMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For BDD APIs
@js.native
trait Roughly extends Assertion {
  def apply(): Assertion = js.native
  def apply(tolerance: scala.Double): Assertion = js.native
}

