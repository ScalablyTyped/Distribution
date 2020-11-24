package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DolbyVision extends js.Object {
  
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
  implicit class DolbyVisionOps[Self <: DolbyVision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setL6Metadata(value: DolbyVisionLevel6Metadata): Self = this.set("L6Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL6Metadata: Self = this.set("L6Metadata", js.undefined)
    
    @scala.inline
    def setL6Mode(value: DolbyVisionLevel6Mode): Self = this.set("L6Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL6Mode: Self = this.set("L6Mode", js.undefined)
    
    @scala.inline
    def setProfile(value: DolbyVisionProfile): Self = this.set("Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("Profile", js.undefined)
  }
}
