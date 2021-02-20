package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationInstanceTaskLog extends StObject {
  
  /**
    * The size, in bytes, of the replication task log.
    */
  var ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the replication task.
    */
  var ReplicationTaskName: js.UndefOr[String] = js.native
}
object ReplicationInstanceTaskLog {
  
  @scala.inline
  def apply(): ReplicationInstanceTaskLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationInstanceTaskLog]
  }
  
  @scala.inline
  implicit class ReplicationInstanceTaskLogMutableBuilder[Self <: ReplicationInstanceTaskLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationInstanceTaskLogSize(value: Long): Self = StObject.set(x, "ReplicationInstanceTaskLogSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceTaskLogSizeUndefined: Self = StObject.set(x, "ReplicationInstanceTaskLogSize", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
    
    @scala.inline
    def setReplicationTaskName(value: String): Self = StObject.set(x, "ReplicationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskNameUndefined: Self = StObject.set(x, "ReplicationTaskName", js.undefined)
  }
}
