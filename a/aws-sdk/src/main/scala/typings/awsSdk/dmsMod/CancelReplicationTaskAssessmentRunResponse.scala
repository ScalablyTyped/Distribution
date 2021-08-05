package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The ReplicationTaskAssessmentRun object for the canceled assessment run.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTaskAssessmentRun] = js.undefined
}
object CancelReplicationTaskAssessmentRunResponse {
  
  inline def apply(): CancelReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelReplicationTaskAssessmentRunResponse]
  }
  
  extension [Self <: CancelReplicationTaskAssessmentRunResponse](x: Self) {
    
    inline def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
