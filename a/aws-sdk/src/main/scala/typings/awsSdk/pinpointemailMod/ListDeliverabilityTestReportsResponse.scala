package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeliverabilityTestReportsResponse extends js.Object {
  
  /**
    * An object that contains a lists of predictive inbox placement tests that you've performed.
    */
  var DeliverabilityTestReports: typings.awsSdk.pinpointemailMod.DeliverabilityTestReports = js.native
  
  /**
    * A token that indicates that there are additional predictive inbox placement tests to list. To view additional predictive inbox placement tests, issue another request to ListDeliverabilityTestReports, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
}
object ListDeliverabilityTestReportsResponse {
  
  @scala.inline
  def apply(DeliverabilityTestReports: DeliverabilityTestReports): ListDeliverabilityTestReportsResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReports = DeliverabilityTestReports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
  }
  
  @scala.inline
  implicit class ListDeliverabilityTestReportsResponseOps[Self <: ListDeliverabilityTestReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeliverabilityTestReportsVarargs(value: DeliverabilityTestReport*): Self = this.set("DeliverabilityTestReports", js.Array(value :_*))
    
    @scala.inline
    def setDeliverabilityTestReports(value: DeliverabilityTestReports): Self = this.set("DeliverabilityTestReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
