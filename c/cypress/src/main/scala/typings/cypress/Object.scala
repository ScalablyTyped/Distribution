package typings.cypress

import typings.cypress.Chai_.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  @JSName("should")
  var should_Original: Assertion = js.native
  def should(selector: String): Assertion = js.native
  def should(`type`: String, message: String): Assertion = js.native
}

