package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTrustedAdvisorCheckRequest extends StObject {
  
  /**
    * The unique identifier for the Trusted Advisor check to refresh. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
    */
  var checkId: String
}
object RefreshTrustedAdvisorCheckRequest {
  
  @scala.inline
  def apply(checkId: String): RefreshTrustedAdvisorCheckRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckRequest]
  }
  
  @scala.inline
  implicit class RefreshTrustedAdvisorCheckRequestMutableBuilder[Self <: RefreshTrustedAdvisorCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckId(value: String): Self = StObject.set(x, "checkId", value.asInstanceOf[js.Any])
  }
}
