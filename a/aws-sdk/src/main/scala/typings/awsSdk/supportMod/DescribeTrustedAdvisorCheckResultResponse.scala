package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorCheckResultResponse extends js.Object {
  
  /**
    * The detailed results of the Trusted Advisor check.
    */
  var result: js.UndefOr[TrustedAdvisorCheckResult] = js.native
}
object DescribeTrustedAdvisorCheckResultResponse {
  
  @scala.inline
  def apply(): DescribeTrustedAdvisorCheckResultResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultResponse]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckResultResponseOps[Self <: DescribeTrustedAdvisorCheckResultResponse] (val x: Self) extends AnyVal {
    
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
    def setResult(value: TrustedAdvisorCheckResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}
