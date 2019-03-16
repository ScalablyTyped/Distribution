package typings
package chaiDashMomentLib.chaiDashMomentMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends chaiLib.ChaiNs.LanguageChains
     with chaiLib.ChaiNs.NumericComparison
     with chaiLib.ChaiNs.TypeComparison {
  def afterMoment(expected: java.lang.String): scala.Unit = js.native
  def afterMoment(expected: java.lang.String, granularity: java.lang.String): scala.Unit = js.native
  def beforeMoment(expected: java.lang.String): scala.Unit = js.native
  def beforeMoment(expected: java.lang.String, granularity: java.lang.String): scala.Unit = js.native
  def sameMoment(expected: java.lang.String): scala.Unit = js.native
  def sameMoment(expected: java.lang.String, granularity: java.lang.String): scala.Unit = js.native
}

