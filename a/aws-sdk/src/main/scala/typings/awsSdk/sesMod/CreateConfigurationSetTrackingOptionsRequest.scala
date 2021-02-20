package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigurationSetTrackingOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that the tracking options should be associated with.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  
  var TrackingOptions: typings.awsSdk.sesMod.TrackingOptions = js.native
}
object CreateConfigurationSetTrackingOptionsRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): CreateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], TrackingOptions = TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetTrackingOptionsRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationSetTrackingOptionsRequestMutableBuilder[Self <: CreateConfigurationSetTrackingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
  }
}
