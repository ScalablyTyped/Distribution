package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshTrustedAdvisorCheckResponse extends StObject {
  
  /**
    * The current refresh status for a check, including the amount of time until the check is eligible for refresh.
    */
  var status: TrustedAdvisorCheckRefreshStatus = js.native
}
object RefreshTrustedAdvisorCheckResponse {
  
  @scala.inline
  def apply(status: TrustedAdvisorCheckRefreshStatus): RefreshTrustedAdvisorCheckResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckResponse]
  }
  
  @scala.inline
  implicit class RefreshTrustedAdvisorCheckResponseMutableBuilder[Self <: RefreshTrustedAdvisorCheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: TrustedAdvisorCheckRefreshStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
