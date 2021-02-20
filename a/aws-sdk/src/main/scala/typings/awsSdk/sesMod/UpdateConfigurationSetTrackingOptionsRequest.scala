package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConfigurationSetTrackingOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set for which you want to update the custom tracking domain.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  
  var TrackingOptions: typings.awsSdk.sesMod.TrackingOptions = js.native
}
object UpdateConfigurationSetTrackingOptionsRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): UpdateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], TrackingOptions = TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetTrackingOptionsRequest]
  }
  
  @scala.inline
  implicit class UpdateConfigurationSetTrackingOptionsRequestMutableBuilder[Self <: UpdateConfigurationSetTrackingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
  }
}
