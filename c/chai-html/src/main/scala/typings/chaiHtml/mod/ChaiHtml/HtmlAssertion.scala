package typings.chaiHtml.mod.ChaiHtml

import typings.chaiHtml.mod.global.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlAssertion extends Assertion {
  var ignoringComments: Assertion
}

object HtmlAssertion {
  @scala.inline
  def apply(html: HtmlAssertion, ignoringComments: Assertion): HtmlAssertion = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], ignoringComments = ignoringComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlAssertion]
  }
}

