package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionRevision extends js.Object {
  /**
    * The date and time when the most recent version of the action was created, in timestamp format.
    */
  var created: Timestamp = js.native
  /**
    * The unique identifier of the change that set the state to this revision (for example, a deployment ID or timestamp).
    */
  var revisionChangeId: RevisionChangeIdentifier = js.native
  /**
    * The system-generated unique ID that identifies the revision number of the action.
    */
  var revisionId: Revision = js.native
}

object ActionRevision {
  @scala.inline
  def apply(created: Timestamp, revisionChangeId: RevisionChangeIdentifier, revisionId: Revision): ActionRevision = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], revisionChangeId = revisionChangeId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionRevision]
  }
}

