package typings.chaiDashRoughly.chaiDashRoughlyMod.Global.ChaiNs

import typings.chai.ChaiNs.LanguageChains
import typings.chai.ChaiNs.NumericComparison
import typings.chai.ChaiNs.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  @JSName("roughly")
  var roughly_Original: Roughly = js.native
  def roughly(): Assertion = js.native
  def roughly(tolerance: Double): Assertion = js.native
  def roughly(`type`: String): typings.chai.ChaiNs.Assertion = js.native
  def roughly(`type`: String, message: String): typings.chai.ChaiNs.Assertion = js.native
}

