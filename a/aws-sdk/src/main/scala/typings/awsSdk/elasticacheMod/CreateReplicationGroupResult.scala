package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationGroupResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.ReplicationGroup] = js.native
}
object CreateReplicationGroupResult {
  
  @scala.inline
  def apply(): CreateReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationGroupResult]
  }
  
  @scala.inline
  implicit class CreateReplicationGroupResultMutableBuilder[Self <: CreateReplicationGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
