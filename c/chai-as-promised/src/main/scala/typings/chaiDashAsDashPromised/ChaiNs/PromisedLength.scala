package typings.chaiDashAsDashPromised.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedLength
  extends PromisedLanguageChains
     with PromisedNumericComparison {
  def apply(length: Double): PromisedAssertion = js.native
  def apply(length: Double, message: String): PromisedAssertion = js.native
}

