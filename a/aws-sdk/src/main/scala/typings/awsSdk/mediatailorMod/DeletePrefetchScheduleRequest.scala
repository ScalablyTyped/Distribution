package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePrefetchScheduleRequest extends StObject {
  
  /**
    * The identifier for the playback configuration.
    */
  var Name: string
  
  /**
    * The name of the playback configuration.
    */
  var PlaybackConfigurationName: string
}
object DeletePrefetchScheduleRequest {
  
  inline def apply(Name: string, PlaybackConfigurationName: string): DeletePrefetchScheduleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PlaybackConfigurationName = PlaybackConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePrefetchScheduleRequest]
  }
  
  extension [Self <: DeletePrefetchScheduleRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationName(value: string): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
  }
}
