package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAccountDedicatedIpWarmupAttributesRequest extends StObject {
  
  /**
    * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon Pinpoint account in the current AWS Region. Set to true to enable the automatic warm-up feature, or set to false to disable it.
    */
  var AutoWarmupEnabled: js.UndefOr[Enabled] = js.native
}
object PutAccountDedicatedIpWarmupAttributesRequest {
  
  @scala.inline
  def apply(): PutAccountDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountDedicatedIpWarmupAttributesRequest]
  }
  
  @scala.inline
  implicit class PutAccountDedicatedIpWarmupAttributesRequestMutableBuilder[Self <: PutAccountDedicatedIpWarmupAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoWarmupEnabled(value: Enabled): Self = StObject.set(x, "AutoWarmupEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWarmupEnabledUndefined: Self = StObject.set(x, "AutoWarmupEnabled", js.undefined)
  }
}
