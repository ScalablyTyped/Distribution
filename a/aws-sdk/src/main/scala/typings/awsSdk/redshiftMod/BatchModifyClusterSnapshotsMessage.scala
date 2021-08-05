package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchModifyClusterSnapshotsMessage extends StObject {
  
  /**
    * A boolean value indicating whether to override an exception if the retention period has passed. 
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is retained indefinitely. The number must be either -1 or an integer between 1 and 3,653. If you decrease the manual snapshot retention period from its current value, existing manual snapshots that fall outside of the new retention period will return an error. If you want to suppress the errors and delete the snapshots, use the force option. 
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A list of snapshot identifiers you want to modify.
    */
  var SnapshotIdentifierList: typings.awsSdk.redshiftMod.SnapshotIdentifierList
}
object BatchModifyClusterSnapshotsMessage {
  
  inline def apply(SnapshotIdentifierList: SnapshotIdentifierList): BatchModifyClusterSnapshotsMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifierList = SnapshotIdentifierList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchModifyClusterSnapshotsMessage]
  }
  
  extension [Self <: BatchModifyClusterSnapshotsMessage](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    inline def setSnapshotIdentifierList(value: SnapshotIdentifierList): Self = StObject.set(x, "SnapshotIdentifierList", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdentifierListVarargs(value: String*): Self = StObject.set(x, "SnapshotIdentifierList", js.Array(value :_*))
  }
}
