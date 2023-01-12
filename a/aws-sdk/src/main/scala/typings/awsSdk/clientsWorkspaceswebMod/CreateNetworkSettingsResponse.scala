package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkSettingsResponse extends StObject {
  
  /**
    * The ARN of the network settings.
    */
  var networkSettingsArn: ARN
}
object CreateNetworkSettingsResponse {
  
  inline def apply(networkSettingsArn: ARN): CreateNetworkSettingsResponse = {
    val __obj = js.Dynamic.literal(networkSettingsArn = networkSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkSettingsArn(value: ARN): Self = StObject.set(x, "networkSettingsArn", value.asInstanceOf[js.Any])
  }
}
