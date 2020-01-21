package typings.chaiUuid.mod._Global_.Chai

import typings.chai.Chai_.LanguageChains
import typings.chai.Chai_.NumericComparison
import typings.chai.Chai_.TypeComparison
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

