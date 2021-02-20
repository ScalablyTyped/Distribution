package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartReplicationTaskAssessmentMessage extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String = js.native
}
object StartReplicationTaskAssessmentMessage {
  
  @scala.inline
  def apply(ReplicationTaskArn: String): StartReplicationTaskAssessmentMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskAssessmentMessage]
  }
  
  @scala.inline
  implicit class StartReplicationTaskAssessmentMessageMutableBuilder[Self <: StartReplicationTaskAssessmentMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
  }
}
