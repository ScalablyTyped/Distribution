package typings.chaiDashOequal.ChaiNs

import typings.chai.ChaiNs.Equal
import typings.chai.ChaiNs.LanguageChains
import typings.chai.ChaiNs.NumericComparison
import typings.chai.ChaiNs.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For BDD APIs
@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  def oeq(result: js.Any): Equal = js.native
  def oeq(result: js.Any, method: String): Equal = js.native
  def oeql(result: js.Any): Equal = js.native
  def oeql(result: js.Any, method: String): Equal = js.native
  def oequal(result: js.Any): Equal = js.native
  def oequal(result: js.Any, method: String): Equal = js.native
}

