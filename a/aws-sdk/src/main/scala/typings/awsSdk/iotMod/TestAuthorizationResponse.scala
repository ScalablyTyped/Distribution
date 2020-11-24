package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestAuthorizationResponse extends js.Object {
  
  /**
    * The authentication results.
    */
  var authResults: js.UndefOr[AuthResults] = js.native
}
object TestAuthorizationResponse {
  
  @scala.inline
  def apply(): TestAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestAuthorizationResponse]
  }
  
  @scala.inline
  implicit class TestAuthorizationResponseOps[Self <: TestAuthorizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthResultsVarargs(value: AuthResult*): Self = this.set("authResults", js.Array(value :_*))
    
    @scala.inline
    def setAuthResults(value: AuthResults): Self = this.set("authResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthResults: Self = this.set("authResults", js.undefined)
  }
}
