package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCacheClusterMessage extends js.Object {
  
  /**
    * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
    */
  var CacheClusterId: String = js.native
  
  /**
    * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
    */
  var FinalSnapshotIdentifier: js.UndefOr[String] = js.native
}
object DeleteCacheClusterMessage {
  
  @scala.inline
  def apply(CacheClusterId: String): DeleteCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheClusterMessage]
  }
  
  @scala.inline
  implicit class DeleteCacheClusterMessageOps[Self <: DeleteCacheClusterMessage] (val x: Self) extends AnyVal {
    
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
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalSnapshotIdentifier(value: String): Self = this.set("FinalSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalSnapshotIdentifier: Self = this.set("FinalSnapshotIdentifier", js.undefined)
  }
}
