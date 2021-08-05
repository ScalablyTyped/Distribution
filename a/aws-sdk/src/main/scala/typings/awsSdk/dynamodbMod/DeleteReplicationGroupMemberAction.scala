package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationGroupMemberAction extends StObject {
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName
}
object DeleteReplicationGroupMemberAction {
  
  inline def apply(RegionName: RegionName): DeleteReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationGroupMemberAction]
  }
  
  extension [Self <: DeleteReplicationGroupMemberAction](x: Self) {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
  }
}
