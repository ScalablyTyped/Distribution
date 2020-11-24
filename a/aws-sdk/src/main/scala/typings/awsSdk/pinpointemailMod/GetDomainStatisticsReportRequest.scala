package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainStatisticsReportRequest extends js.Object {
  
  /**
    * The domain that you want to obtain deliverability metrics for.
    */
  var Domain: Identity = js.native
  
  /**
    * The last day (in Unix time) that you want to obtain domain deliverability metrics for. The EndDate that you specify has to be less than or equal to 30 days after the StartDate.
    */
  var EndDate: Timestamp = js.native
  
  /**
    * The first day (in Unix time) that you want to obtain domain deliverability metrics for.
    */
  var StartDate: Timestamp = js.native
}
object GetDomainStatisticsReportRequest {
  
  @scala.inline
  def apply(Domain: Identity, EndDate: Timestamp, StartDate: Timestamp): GetDomainStatisticsReportRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], EndDate = EndDate.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainStatisticsReportRequest]
  }
  
  @scala.inline
  implicit class GetDomainStatisticsReportRequestOps[Self <: GetDomainStatisticsReportRequest] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: Identity): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: Timestamp): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Timestamp): Self = this.set("StartDate", value.asInstanceOf[js.Any])
  }
}
