package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalReplicationGroupInfo extends StObject {
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The role of the replication group in a Global Datastore. Can be primary or secondary.
    */
  var GlobalReplicationGroupMemberRole: js.UndefOr[String] = js.undefined
}
object GlobalReplicationGroupInfo {
  
  @scala.inline
  def apply(): GlobalReplicationGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroupInfo]
  }
  
  @scala.inline
  implicit class GlobalReplicationGroupInfoMutableBuilder[Self <: GlobalReplicationGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupIdUndefined: Self = StObject.set(x, "GlobalReplicationGroupId", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupMemberRole(value: String): Self = StObject.set(x, "GlobalReplicationGroupMemberRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupMemberRoleUndefined: Self = StObject.set(x, "GlobalReplicationGroupMemberRole", js.undefined)
  }
}
