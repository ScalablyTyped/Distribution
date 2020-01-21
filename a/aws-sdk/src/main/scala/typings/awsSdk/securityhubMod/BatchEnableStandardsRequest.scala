package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchEnableStandardsRequest extends js.Object {
  /**
    * The list of standards compliance checks to enable.  In this release, Security Hub supports only the CIS AWS Foundations standard. The ARN for the standard is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0. 
    */
  var StandardsSubscriptionRequests: typings.awsSdk.securityhubMod.StandardsSubscriptionRequests = js.native
}

object BatchEnableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionRequests: StandardsSubscriptionRequests): BatchEnableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionRequests = StandardsSubscriptionRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchEnableStandardsRequest]
  }
}

