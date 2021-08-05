package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetPortSettingsOutput extends StObject {
  
  /**
    * The port settings for the requested fleet ID.
    */
  var InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
}
object DescribeFleetPortSettingsOutput {
  
  inline def apply(): DescribeFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
  }
  
  extension [Self <: DescribeFleetPortSettingsOutput](x: Self) {
    
    inline def setInboundPermissions(value: IpPermissionsList): Self = StObject.set(x, "InboundPermissions", value.asInstanceOf[js.Any])
    
    inline def setInboundPermissionsUndefined: Self = StObject.set(x, "InboundPermissions", js.undefined)
    
    inline def setInboundPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "InboundPermissions", js.Array(value :_*))
  }
}
