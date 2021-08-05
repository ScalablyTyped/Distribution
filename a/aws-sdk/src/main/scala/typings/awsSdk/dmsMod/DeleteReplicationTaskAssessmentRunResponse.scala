package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The ReplicationTaskAssessmentRun object for the deleted assessment run.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTaskAssessmentRun] = js.undefined
}
object DeleteReplicationTaskAssessmentRunResponse {
  
  inline def apply(): DeleteReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunResponse]
  }
  
  extension [Self <: DeleteReplicationTaskAssessmentRunResponse](x: Self) {
    
    inline def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
