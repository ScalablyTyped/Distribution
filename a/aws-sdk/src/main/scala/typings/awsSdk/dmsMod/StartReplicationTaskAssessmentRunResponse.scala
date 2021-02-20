package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The premigration assessment run that was started.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTaskAssessmentRun] = js.native
}
object StartReplicationTaskAssessmentRunResponse {
  
  @scala.inline
  def apply(): StartReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplicationTaskAssessmentRunResponse]
  }
  
  @scala.inline
  implicit class StartReplicationTaskAssessmentRunResponseMutableBuilder[Self <: StartReplicationTaskAssessmentRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
