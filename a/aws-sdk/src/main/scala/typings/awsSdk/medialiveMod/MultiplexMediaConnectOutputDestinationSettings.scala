package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexMediaConnectOutputDestinationSettings extends StObject {
  
  /**
    * The MediaConnect entitlement ARN available as a Flow source.
    */
  var EntitlementArn: js.UndefOr[stringMin1] = js.native
}
object MultiplexMediaConnectOutputDestinationSettings {
  
  @scala.inline
  def apply(): MultiplexMediaConnectOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexMediaConnectOutputDestinationSettings]
  }
  
  @scala.inline
  implicit class MultiplexMediaConnectOutputDestinationSettingsMutableBuilder[Self <: MultiplexMediaConnectOutputDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlementArn(value: stringMin1): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
  }
}
