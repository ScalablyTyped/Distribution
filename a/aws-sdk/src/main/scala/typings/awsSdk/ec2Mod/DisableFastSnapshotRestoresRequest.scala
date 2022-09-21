package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastSnapshotRestoresRequest extends StObject {
  
  /**
    * One or more Availability Zones. For example, us-east-2a.
    */
  var AvailabilityZones: AvailabilityZoneStringList
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of one or more snapshots. For example, snap-1234567890abcdef0.
    */
  var SourceSnapshotIds: SnapshotIdStringList
}
object DisableFastSnapshotRestoresRequest {
  
  inline def apply(AvailabilityZones: AvailabilityZoneStringList, SourceSnapshotIds: SnapshotIdStringList): DisableFastSnapshotRestoresRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], SourceSnapshotIds = SourceSnapshotIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFastSnapshotRestoresRequest]
  }
  
  extension [Self <: DisableFastSnapshotRestoresRequest](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneStringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSourceSnapshotIds(value: SnapshotIdStringList): Self = StObject.set(x, "SourceSnapshotIds", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotIdsVarargs(value: SnapshotId*): Self = StObject.set(x, "SourceSnapshotIds", js.Array(value*))
  }
}
