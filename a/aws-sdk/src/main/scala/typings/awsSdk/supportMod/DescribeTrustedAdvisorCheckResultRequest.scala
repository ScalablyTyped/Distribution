package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
  
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String = js.native
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[String] = js.native
}
object DescribeTrustedAdvisorCheckResultRequest {
  
  @scala.inline
  def apply(checkId: String): DescribeTrustedAdvisorCheckResultRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultRequest]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckResultRequestOps[Self <: DescribeTrustedAdvisorCheckResultRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
