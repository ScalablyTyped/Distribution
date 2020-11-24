package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationGroupMessage extends js.Object {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of replication groups. Each item in the list contains detailed information about one replication group.
    */
  var ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.native
}
object ReplicationGroupMessage {
  
  @scala.inline
  def apply(): ReplicationGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class ReplicationGroupMessageOps[Self <: ReplicationGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setReplicationGroupsVarargs(value: ReplicationGroup*): Self = this.set("ReplicationGroups", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroups(value: ReplicationGroupList): Self = this.set("ReplicationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroups: Self = this.set("ReplicationGroups", js.undefined)
  }
}
