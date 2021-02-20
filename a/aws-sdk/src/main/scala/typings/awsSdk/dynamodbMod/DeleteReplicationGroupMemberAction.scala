package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReplicationGroupMemberAction extends StObject {
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
}
object DeleteReplicationGroupMemberAction {
  
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationGroupMemberAction]
  }
  
  @scala.inline
  implicit class DeleteReplicationGroupMemberActionMutableBuilder[Self <: DeleteReplicationGroupMemberAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
  }
}
