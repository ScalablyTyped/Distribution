package typings.cypress.mod.Chai

import typings.chaiJquery.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Include extends js.Object {
  def html(html: String): Assertion
  def text(text: String): Assertion
  def value(text: String): Assertion
}

object Include {
  @scala.inline
  def apply(html: String => Assertion, text: String => Assertion, value: String => Assertion): Include = {
    val __obj = js.Dynamic.literal(html = js.Any.fromFunction1(html), text = js.Any.fromFunction1(text), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Include]
  }
}

