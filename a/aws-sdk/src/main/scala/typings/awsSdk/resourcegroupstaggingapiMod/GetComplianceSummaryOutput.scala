package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A table that shows counts of noncompliant resources.
    */
  var SummaryList: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.SummaryList] = js.native
}

object GetComplianceSummaryOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, SummaryList: SummaryList = null): GetComplianceSummaryOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    if (SummaryList != null) __obj.updateDynamic("SummaryList")(SummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceSummaryOutput]
  }
}

