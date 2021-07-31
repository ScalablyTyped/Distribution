package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainStatisticsReportRequest extends StObject {
  
  /**
    * The domain that you want to obtain deliverability metrics for.
    */
  var Domain: Identity
  
  /**
    * The last day (in Unix time) that you want to obtain domain deliverability metrics for. The EndDate that you specify has to be less than or equal to 30 days after the StartDate.
    */
  var EndDate: Timestamp
  
  /**
    * The first day (in Unix time) that you want to obtain domain deliverability metrics for.
    */
  var StartDate: Timestamp
}
object GetDomainStatisticsReportRequest {
  
  @scala.inline
  def apply(Domain: Identity, EndDate: Timestamp, StartDate: Timestamp): GetDomainStatisticsReportRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], EndDate = EndDate.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainStatisticsReportRequest]
  }
  
  @scala.inline
  implicit class GetDomainStatisticsReportRequestMutableBuilder[Self <: GetDomainStatisticsReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: Identity): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: Timestamp): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Timestamp): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
  }
}
