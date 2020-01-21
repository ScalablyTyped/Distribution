package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFindingsResponse extends js.Object {
  /**
    * Finding details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
  /**
    * Information about the finding.
    */
  var findings: FindingList = js.native
}

object DescribeFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems, findings: FindingList): DescribeFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], findings = findings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeFindingsResponse]
  }
}

