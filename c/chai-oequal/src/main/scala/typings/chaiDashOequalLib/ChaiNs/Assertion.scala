package typings
package chaiDashOequalLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For BDD APIs
@js.native
trait Assertion
  extends chaiLib.ChaiNs.LanguageChains
     with chaiLib.ChaiNs.NumericComparison
     with chaiLib.ChaiNs.TypeComparison {
  def oeq(result: js.Any): chaiLib.ChaiNs.Equal = js.native
  def oeq(result: js.Any, method: java.lang.String): chaiLib.ChaiNs.Equal = js.native
  def oeql(result: js.Any): chaiLib.ChaiNs.Equal = js.native
  def oeql(result: js.Any, method: java.lang.String): chaiLib.ChaiNs.Equal = js.native
  def oequal(result: js.Any): chaiLib.ChaiNs.Equal = js.native
  def oequal(result: js.Any, method: java.lang.String): chaiLib.ChaiNs.Equal = js.native
}

