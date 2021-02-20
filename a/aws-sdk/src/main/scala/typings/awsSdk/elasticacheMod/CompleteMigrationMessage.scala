package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteMigrationMessage extends StObject {
  
  /**
    * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to abort the migration and not recommended when application wants to continue migration to ElastiCache.
    */
  var Force: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the replication group to which data is being migrated.
    */
  var ReplicationGroupId: String = js.native
}
object CompleteMigrationMessage {
  
  @scala.inline
  def apply(ReplicationGroupId: String): CompleteMigrationMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMigrationMessage]
  }
  
  @scala.inline
  implicit class CompleteMigrationMessageMutableBuilder[Self <: CompleteMigrationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
