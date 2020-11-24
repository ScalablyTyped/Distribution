package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshTrustedAdvisorCheckRequest extends js.Object {
  
  /**
    * The unique identifier for the Trusted Advisor check to refresh. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
    */
  var checkId: String = js.native
}
object RefreshTrustedAdvisorCheckRequest {
  
  @scala.inline
  def apply(checkId: String): RefreshTrustedAdvisorCheckRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckRequest]
  }
  
  @scala.inline
  implicit class RefreshTrustedAdvisorCheckRequestOps[Self <: RefreshTrustedAdvisorCheckRequest] (val x: Self) extends AnyVal {
    
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
    def setCheckId(value: String): Self = this.set("checkId", value.asInstanceOf[js.Any])
  }
}
