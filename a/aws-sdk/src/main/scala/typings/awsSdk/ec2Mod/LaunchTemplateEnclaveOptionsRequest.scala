package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateEnclaveOptionsRequest extends StObject {
  
  /**
    * To enable the instance for AWS Nitro Enclaves, set this parameter to true.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object LaunchTemplateEnclaveOptionsRequest {
  
  inline def apply(): LaunchTemplateEnclaveOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateEnclaveOptionsRequest]
  }
  
  extension [Self <: LaunchTemplateEnclaveOptionsRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
