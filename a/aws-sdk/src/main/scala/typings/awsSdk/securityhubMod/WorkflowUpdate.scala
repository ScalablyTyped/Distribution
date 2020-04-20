package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowUpdate extends js.Object {
  /**
    * The status of the investigation into the finding. The allowed values are the following.    NEW - The initial state of a finding, before it is reviewed.    NOTIFIED - Indicates that you notified the resource owner about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.    SUPPRESSED - The finding will not be reviewed again and will not be acted upon.  
    */
  var Status: js.UndefOr[WorkflowStatus] = js.native
}

object WorkflowUpdate {
  @scala.inline
  def apply(Status: WorkflowStatus = null): WorkflowUpdate = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowUpdate]
  }
}

