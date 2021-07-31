package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationInstanceResponse extends StObject {
  
  /**
    * The replication instance that was deleted.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.dmsMod.ReplicationInstance] = js.undefined
}
object DeleteReplicationInstanceResponse {
  
  @scala.inline
  def apply(): DeleteReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit class DeleteReplicationInstanceResponseMutableBuilder[Self <: DeleteReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
