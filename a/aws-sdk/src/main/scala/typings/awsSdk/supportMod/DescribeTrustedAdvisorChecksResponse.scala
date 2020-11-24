package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorChecksResponse extends js.Object {
  
  /**
    * Information about all available Trusted Advisor checks.
    */
  var checks: TrustedAdvisorCheckList = js.native
}
object DescribeTrustedAdvisorChecksResponse {
  
  @scala.inline
  def apply(checks: TrustedAdvisorCheckList): DescribeTrustedAdvisorChecksResponse = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksResponse]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorChecksResponseOps[Self <: DescribeTrustedAdvisorChecksResponse] (val x: Self) extends AnyVal {
    
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
    def setChecksVarargs(value: TrustedAdvisorCheckDescription*): Self = this.set("checks", js.Array(value :_*))
    
    @scala.inline
    def setChecks(value: TrustedAdvisorCheckList): Self = this.set("checks", value.asInstanceOf[js.Any])
  }
}
