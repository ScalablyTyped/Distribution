package typings.chaiUuid.mod.global.Chai

import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
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

