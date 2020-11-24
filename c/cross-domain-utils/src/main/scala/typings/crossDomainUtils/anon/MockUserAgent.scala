package typings.crossDomainUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockUserAgent extends js.Object {
  
  var mockUserAgent: js.UndefOr[String] = js.native
  
  var userAgent: String = js.native
}
object MockUserAgent {
  
  @scala.inline
  def apply(userAgent: String): MockUserAgent = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockUserAgent]
  }
  
  @scala.inline
  implicit class MockUserAgentOps[Self <: MockUserAgent] (val x: Self) extends AnyVal {
    
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
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockUserAgent(value: String): Self = this.set("mockUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMockUserAgent: Self = this.set("mockUserAgent", js.undefined)
  }
}
