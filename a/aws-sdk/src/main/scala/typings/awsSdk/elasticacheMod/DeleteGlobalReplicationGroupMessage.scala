package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGlobalReplicationGroupMessage extends StObject {
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  
  /**
    * The primary replication group is retained as a standalone replication group. 
    */
  var RetainPrimaryReplicationGroup: Boolean = js.native
}
object DeleteGlobalReplicationGroupMessage {
  
  @scala.inline
  def apply(GlobalReplicationGroupId: String, RetainPrimaryReplicationGroup: Boolean): DeleteGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], RetainPrimaryReplicationGroup = RetainPrimaryReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteGlobalReplicationGroupMessageMutableBuilder[Self <: DeleteGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainPrimaryReplicationGroup(value: Boolean): Self = StObject.set(x, "RetainPrimaryReplicationGroup", value.asInstanceOf[js.Any])
  }
}
