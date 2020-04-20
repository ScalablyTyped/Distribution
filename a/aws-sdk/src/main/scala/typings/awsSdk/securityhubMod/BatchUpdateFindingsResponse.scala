package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateFindingsResponse extends js.Object {
  /**
    * The list of findings that were updated successfully.
    */
  var ProcessedFindings: AwsSecurityFindingIdentifierList = js.native
  /**
    * The list of findings that were not updated.
    */
  var UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList = js.native
}

object BatchUpdateFindingsResponse {
  @scala.inline
  def apply(
    ProcessedFindings: AwsSecurityFindingIdentifierList,
    UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList
  ): BatchUpdateFindingsResponse = {
    val __obj = js.Dynamic.literal(ProcessedFindings = ProcessedFindings.asInstanceOf[js.Any], UnprocessedFindings = UnprocessedFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsResponse]
  }
}

