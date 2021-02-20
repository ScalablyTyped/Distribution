package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationInstanceResponse extends StObject {
  
  /**
    * The replication instance that was created.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.dmsMod.ReplicationInstance] = js.native
}
object CreateReplicationInstanceResponse {
  
  @scala.inline
  def apply(): CreateReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit class CreateReplicationInstanceResponseMutableBuilder[Self <: CreateReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
