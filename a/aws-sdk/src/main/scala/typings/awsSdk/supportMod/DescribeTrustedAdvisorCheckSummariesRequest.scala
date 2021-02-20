package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorCheckSummariesRequest extends StObject {
  
  /**
    * The IDs of the Trusted Advisor checks.
    */
  var checkIds: StringList = js.native
}
object DescribeTrustedAdvisorCheckSummariesRequest {
  
  @scala.inline
  def apply(checkIds: StringList): DescribeTrustedAdvisorCheckSummariesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckSummariesRequestMutableBuilder[Self <: DescribeTrustedAdvisorCheckSummariesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckIds(value: StringList): Self = StObject.set(x, "checkIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIdsVarargs(value: String*): Self = StObject.set(x, "checkIds", js.Array(value :_*))
  }
}
