package typings.chaiDashMoment.chaiDashMomentMod.Global.ChaiNs

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
  def afterMoment(expected: String): Unit = js.native
  def afterMoment(expected: String, granularity: String): Unit = js.native
  def beforeMoment(expected: String): Unit = js.native
  def beforeMoment(expected: String, granularity: String): Unit = js.native
  def sameMoment(expected: String): Unit = js.native
  def sameMoment(expected: String, granularity: String): Unit = js.native
}

