package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetPortSettingsOutput extends StObject {
  
  /**
    * The port settings for the requested fleet ID.
    */
  var InboundPermissions: js.UndefOr[IpPermissionsList] = js.native
}
object DescribeFleetPortSettingsOutput {
  
  @scala.inline
  def apply(): DescribeFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
  }
  
  @scala.inline
  implicit class DescribeFleetPortSettingsOutputMutableBuilder[Self <: DescribeFleetPortSettingsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInboundPermissions(value: IpPermissionsList): Self = StObject.set(x, "InboundPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundPermissionsUndefined: Self = StObject.set(x, "InboundPermissions", js.undefined)
    
    @scala.inline
    def setInboundPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "InboundPermissions", js.Array(value :_*))
  }
}
