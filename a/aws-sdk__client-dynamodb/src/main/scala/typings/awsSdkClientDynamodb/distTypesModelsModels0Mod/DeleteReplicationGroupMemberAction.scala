package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationGroupMemberAction extends StObject {
  
  /**
    * <p>The Region where the replica exists.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
}
object DeleteReplicationGroupMemberAction {
  
  inline def apply(): DeleteReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationGroupMemberAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicationGroupMemberAction] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
