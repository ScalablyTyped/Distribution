package typings.chaiHtml.mod._Global_.Chai

import typings.chaiHtml.mod.ChaiHtml.HtmlAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  var html: HtmlAssertion
}

object Assertion {
  @scala.inline
  def apply(html: HtmlAssertion): Assertion = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertion]
  }
}

