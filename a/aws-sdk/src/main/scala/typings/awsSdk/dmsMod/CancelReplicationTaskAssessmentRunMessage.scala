package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReplicationTaskAssessmentRunMessage extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the premigration assessment run to be canceled.
    */
  var ReplicationTaskAssessmentRunArn: String
}
object CancelReplicationTaskAssessmentRunMessage {
  
  inline def apply(ReplicationTaskAssessmentRunArn: String): CancelReplicationTaskAssessmentRunMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskAssessmentRunArn = ReplicationTaskAssessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReplicationTaskAssessmentRunMessage]
  }
  
  extension [Self <: CancelReplicationTaskAssessmentRunMessage](x: Self) {
    
    inline def setReplicationTaskAssessmentRunArn(value: String): Self = StObject.set(x, "ReplicationTaskAssessmentRunArn", value.asInstanceOf[js.Any])
  }
}
