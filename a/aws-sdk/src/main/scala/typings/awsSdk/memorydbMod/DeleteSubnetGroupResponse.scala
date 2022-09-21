package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubnetGroupResponse extends StObject {
  
  /**
    * The subnet group object that has been deleted.
    */
  var SubnetGroup: js.UndefOr[typings.awsSdk.memorydbMod.SubnetGroup] = js.undefined
}
object DeleteSubnetGroupResponse {
  
  inline def apply(): DeleteSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSubnetGroupResponse]
  }
  
  extension [Self <: DeleteSubnetGroupResponse](x: Self) {
    
    inline def setSubnetGroup(value: SubnetGroup): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
  }
}
