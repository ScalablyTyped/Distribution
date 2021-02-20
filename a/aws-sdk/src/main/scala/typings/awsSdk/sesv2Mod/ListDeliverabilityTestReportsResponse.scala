package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeliverabilityTestReportsResponse extends StObject {
  
  /**
    * An object that contains a lists of predictive inbox placement tests that you've performed.
    */
  var DeliverabilityTestReports: typings.awsSdk.sesv2Mod.DeliverabilityTestReports = js.native
  
  /**
    * A token that indicates that there are additional predictive inbox placement tests to list. To view additional predictive inbox placement tests, issue another request to ListDeliverabilityTestReports, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}
object ListDeliverabilityTestReportsResponse {
  
  @scala.inline
  def apply(DeliverabilityTestReports: DeliverabilityTestReports): ListDeliverabilityTestReportsResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReports = DeliverabilityTestReports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
  }
  
  @scala.inline
  implicit class ListDeliverabilityTestReportsResponseMutableBuilder[Self <: ListDeliverabilityTestReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliverabilityTestReports(value: DeliverabilityTestReports): Self = StObject.set(x, "DeliverabilityTestReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverabilityTestReportsVarargs(value: DeliverabilityTestReport*): Self = StObject.set(x, "DeliverabilityTestReports", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
