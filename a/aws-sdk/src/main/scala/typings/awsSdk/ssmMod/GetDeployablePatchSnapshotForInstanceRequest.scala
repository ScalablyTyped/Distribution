package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeployablePatchSnapshotForInstanceRequest extends StObject {
  
  /**
    * The ID of the instance for which the appropriate patch snapshot should be retrieved.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId
  
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: typings.awsSdk.ssmMod.SnapshotId
}
object GetDeployablePatchSnapshotForInstanceRequest {
  
  inline def apply(InstanceId: InstanceId, SnapshotId: SnapshotId): GetDeployablePatchSnapshotForInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
  }
  
  extension [Self <: GetDeployablePatchSnapshotForInstanceRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
