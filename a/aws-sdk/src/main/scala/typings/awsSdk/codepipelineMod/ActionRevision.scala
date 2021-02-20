package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionRevision extends StObject {
  
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
  
  @scala.inline
  implicit class ActionRevisionMutableBuilder[Self <: ActionRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionChangeId(value: RevisionChangeIdentifier): Self = StObject.set(x, "revisionChangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Revision): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
