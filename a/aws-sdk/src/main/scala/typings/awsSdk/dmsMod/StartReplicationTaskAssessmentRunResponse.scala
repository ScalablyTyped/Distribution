package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The premigration assessment run that was started.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTaskAssessmentRun] = js.undefined
}
object StartReplicationTaskAssessmentRunResponse {
  
  inline def apply(): StartReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplicationTaskAssessmentRunResponse]
  }
  
  extension [Self <: StartReplicationTaskAssessmentRunResponse](x: Self) {
    
    inline def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
