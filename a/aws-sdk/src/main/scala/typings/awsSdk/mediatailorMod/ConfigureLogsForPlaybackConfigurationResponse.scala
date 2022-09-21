package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureLogsForPlaybackConfigurationResponse extends StObject {
  
  /**
    * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
    */
  var PercentEnabled: js.UndefOr[integer] = js.undefined
  
  /**
    * The name of the playback configuration.
    */
  var PlaybackConfigurationName: js.UndefOr[string] = js.undefined
}
object ConfigureLogsForPlaybackConfigurationResponse {
  
  inline def apply(): ConfigureLogsForPlaybackConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureLogsForPlaybackConfigurationResponse]
  }
  
  extension [Self <: ConfigureLogsForPlaybackConfigurationResponse](x: Self) {
    
    inline def setPercentEnabled(value: integer): Self = StObject.set(x, "PercentEnabled", value.asInstanceOf[js.Any])
    
    inline def setPercentEnabledUndefined: Self = StObject.set(x, "PercentEnabled", js.undefined)
    
    inline def setPlaybackConfigurationName(value: string): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationNameUndefined: Self = StObject.set(x, "PlaybackConfigurationName", js.undefined)
  }
}
