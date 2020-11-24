package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomatedEncodingSettings extends js.Object {
  
  /**
    * Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on characteristics of your input video. This feature optimizes video quality while minimizing the overall size of your ABR package.
    */
  var AbrSettings: js.UndefOr[AutomatedAbrSettings] = js.native
}
object AutomatedEncodingSettings {
  
  @scala.inline
  def apply(): AutomatedEncodingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedEncodingSettings]
  }
  
  @scala.inline
  implicit class AutomatedEncodingSettingsOps[Self <: AutomatedEncodingSettings] (val x: Self) extends AnyVal {
    
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
    def setAbrSettings(value: AutomatedAbrSettings): Self = this.set("AbrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbrSettings: Self = this.set("AbrSettings", js.undefined)
  }
}
