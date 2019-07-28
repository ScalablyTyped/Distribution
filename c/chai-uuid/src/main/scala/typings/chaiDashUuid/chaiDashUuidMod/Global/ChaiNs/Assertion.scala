package typings.chaiDashUuid.chaiDashUuidMod.Global.ChaiNs

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
  def guid(): Unit = js.native
  def guid(guid: js.Any): Unit = js.native
  def uuid(): Unit = js.native
  def uuid(uuid: UuidVersion): Unit = js.native
}

