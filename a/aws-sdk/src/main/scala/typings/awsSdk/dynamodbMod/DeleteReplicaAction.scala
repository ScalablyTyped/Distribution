package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReplicaAction extends StObject {
  
  /**
    * The Region of the replica to be removed.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
}
object DeleteReplicaAction {
  
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicaAction]
  }
  
  @scala.inline
  implicit class DeleteReplicaActionMutableBuilder[Self <: DeleteReplicaAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
  }
}
