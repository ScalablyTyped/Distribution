package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionRevision extends StObject {
  
  /**
    * The date and time when the most recent version of the action was created, in timestamp format.
    */
  var created: Timestamp
  
  /**
    * The unique identifier of the change that set the state to this revision (for example, a deployment ID or timestamp).
    */
  var revisionChangeId: RevisionChangeIdentifier
  
  /**
    * The system-generated unique ID that identifies the revision number of the action.
    */
  var revisionId: Revision
}
object ActionRevision {
  
  inline def apply(created: Timestamp, revisionChangeId: RevisionChangeIdentifier, revisionId: Revision): ActionRevision = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], revisionChangeId = revisionChangeId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionRevision]
  }
  
  extension [Self <: ActionRevision](x: Self) {
    
    inline def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setRevisionChangeId(value: RevisionChangeIdentifier): Self = StObject.set(x, "revisionChangeId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: Revision): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
