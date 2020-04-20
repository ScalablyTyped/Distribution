package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

