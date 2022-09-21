package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreFromSnapshotRequest extends StObject {
  
  /**
    * The name of the namespace to restore the snapshot to.
    */
  var namespaceName: NamespaceName
  
  /**
    * The Amazon Web Services account that owns the snapshot.
    */
  var ownerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot to restore from.
    */
  var snapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the snapshot to restore from.
    */
  var snapshotName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the workgroup used to restore the snapshot.
    */
  var workgroupName: WorkgroupName
}
object RestoreFromSnapshotRequest {
  
  inline def apply(namespaceName: NamespaceName, workgroupName: WorkgroupName): RestoreFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromSnapshotRequest]
  }
  
  extension [Self <: RestoreFromSnapshotRequest](x: Self) {
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccount(value: String): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArnUndefined: Self = StObject.set(x, "snapshotArn", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
