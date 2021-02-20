package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The ReplicationTaskAssessmentRun object for the deleted assessment run.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTaskAssessmentRun] = js.native
}
object DeleteReplicationTaskAssessmentRunResponse {
  
  @scala.inline
  def apply(): DeleteReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunResponse]
  }
  
  @scala.inline
  implicit class DeleteReplicationTaskAssessmentRunResponseMutableBuilder[Self <: DeleteReplicationTaskAssessmentRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
