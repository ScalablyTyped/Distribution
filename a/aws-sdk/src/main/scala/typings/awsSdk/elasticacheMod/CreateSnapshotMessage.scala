package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSnapshotMessage extends js.Object {
  
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
  implicit class CreateSnapshotMessageOps[Self <: CreateSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSnapshotName(value: String): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterId: Self = this.set("CacheClusterId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
  }
}
