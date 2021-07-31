package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountDedicatedIpWarmupAttributesRequest extends StObject {
  
  /**
    * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon SES account in the current AWS Region. Set to true to enable the automatic warm-up feature, or set to false to disable it.
    */
  var AutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
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
