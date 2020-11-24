package typings.chaiHtml.mod.ChaiHtml

import typings.chaiHtml.mod.global.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlAssertion extends Assertion {
  
  var ignoringComments: Assertion = js.native
}
object HtmlAssertion {
  
  @scala.inline
  def apply(html: HtmlAssertion, ignoringComments: Assertion): HtmlAssertion = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], ignoringComments = ignoringComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlAssertion]
  }
  
  @scala.inline
  implicit class HtmlAssertionOps[Self <: HtmlAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIgnoringComments(value: Assertion): Self = this.set("ignoringComments", value.asInstanceOf[js.Any])
  }
}
