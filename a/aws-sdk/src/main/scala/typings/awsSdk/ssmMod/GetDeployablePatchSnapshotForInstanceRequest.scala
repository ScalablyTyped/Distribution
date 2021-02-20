package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeployablePatchSnapshotForInstanceRequest extends StObject {
  
  /**
    * The ID of the instance for which the appropriate patch snapshot should be retrieved.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId = js.native
  
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: typings.awsSdk.ssmMod.SnapshotId = js.native
}
object GetDeployablePatchSnapshotForInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, SnapshotId: SnapshotId): GetDeployablePatchSnapshotForInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
  }
  
  @scala.inline
  implicit class GetDeployablePatchSnapshotForInstanceRequestMutableBuilder[Self <: GetDeployablePatchSnapshotForInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
