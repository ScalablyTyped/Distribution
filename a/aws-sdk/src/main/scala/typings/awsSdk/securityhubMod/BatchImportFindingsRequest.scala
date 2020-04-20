package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchImportFindingsRequest extends js.Object {
  /**
    * A list of findings to import. To successfully import a finding, it must follow the AWS Security Finding Format. Maximum of 100 findings per request.
    */
  var Findings: AwsSecurityFindingList = js.native
}

object BatchImportFindingsRequest {
  @scala.inline
  def apply(Findings: AwsSecurityFindingList): BatchImportFindingsRequest = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsRequest]
  }
}

