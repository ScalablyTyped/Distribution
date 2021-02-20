package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DolbyVision extends StObject {
  
  /**
    * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your input with new values.
    */
  var L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata] = js.native
  
  /**
    * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
    */
  var L6Mode: js.UndefOr[DolbyVisionLevel6Mode] = js.native
  
  /**
    * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision frame interleaved data.
    */
  var Profile: js.UndefOr[DolbyVisionProfile] = js.native
}
object DolbyVision {
  
  @scala.inline
  def apply(): DolbyVision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DolbyVision]
  }
  
  @scala.inline
  implicit class DolbyVisionMutableBuilder[Self <: DolbyVision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setL6Metadata(value: DolbyVisionLevel6Metadata): Self = StObject.set(x, "L6Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL6MetadataUndefined: Self = StObject.set(x, "L6Metadata", js.undefined)
    
    @scala.inline
    def setL6Mode(value: DolbyVisionLevel6Mode): Self = StObject.set(x, "L6Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL6ModeUndefined: Self = StObject.set(x, "L6Mode", js.undefined)
    
    @scala.inline
    def setProfile(value: DolbyVisionProfile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
  }
}
