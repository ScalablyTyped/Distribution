package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSnapshotMessage extends StObject {
  
  /**
    * The identifier of an existing cluster. The snapshot is created from this cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The identifier of an existing replication group. The snapshot is created from this replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * A name for the snapshot being created.
    */
  var SnapshotName: String = js.native
}
object CreateSnapshotMessage {
  
  @scala.inline
  def apply(SnapshotName: String): CreateSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotMessage]
  }
  
  @scala.inline
  implicit class CreateSnapshotMessageMutableBuilder[Self <: CreateSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
