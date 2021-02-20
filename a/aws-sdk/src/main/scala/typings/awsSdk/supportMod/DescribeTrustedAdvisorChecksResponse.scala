package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorChecksResponse extends StObject {
  
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
  implicit class DescribeTrustedAdvisorChecksResponseMutableBuilder[Self <: DescribeTrustedAdvisorChecksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecks(value: TrustedAdvisorCheckList): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksVarargs(value: TrustedAdvisorCheckDescription*): Self = StObject.set(x, "checks", js.Array(value :_*))
  }
}
