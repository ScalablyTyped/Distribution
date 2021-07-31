package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootReplicationInstanceResponse extends StObject {
  
  /**
    * The replication instance that is being rebooted. 
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.dmsMod.ReplicationInstance] = js.undefined
}
object RebootReplicationInstanceResponse {
  
  @scala.inline
  def apply(): RebootReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit class RebootReplicationInstanceResponseMutableBuilder[Self <: RebootReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
