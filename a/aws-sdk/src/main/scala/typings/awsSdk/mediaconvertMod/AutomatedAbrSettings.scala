package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomatedAbrSettings extends js.Object {
  
  /**
    * Optional. The maximum target bit rate used in your automated ABR stack. Use this value to set an upper limit on the bandwidth consumed by the highest-quality rendition. This is the rendition that is delivered to viewers with the fastest internet connections. If you don't specify a value, MediaConvert uses 8,000,000 (8 mb/s) by default.
    */
  var MaxAbrBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
  
  /**
    * Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The number of renditions is determined automatically, based on analysis of each job, but will never exceed this limit. When you set this to Auto in the console, which is equivalent to excluding it from your JSON job specification, MediaConvert defaults to a limit of 15.
    */
  var MaxRenditions: js.UndefOr[integerMin3Max15] = js.native
  
  /**
    * Optional. The minimum target bitrate used in your automated ABR stack. Use this value to set a lower limit on the bitrate of video delivered to viewers with slow internet connections. If you don't specify a value, MediaConvert uses 600,000 (600 kb/s) by default.
    */
  var MinAbrBitrate: js.UndefOr[integerMin100000Max100000000] = js.native
}
object AutomatedAbrSettings {
  
  @scala.inline
  def apply(): AutomatedAbrSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedAbrSettings]
  }
  
  @scala.inline
  implicit class AutomatedAbrSettingsOps[Self <: AutomatedAbrSettings] (val x: Self) extends AnyVal {
    
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
    def setMaxAbrBitrate(value: integerMin100000Max100000000): Self = this.set("MaxAbrBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAbrBitrate: Self = this.set("MaxAbrBitrate", js.undefined)
    
    @scala.inline
    def setMaxRenditions(value: integerMin3Max15): Self = this.set("MaxRenditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRenditions: Self = this.set("MaxRenditions", js.undefined)
    
    @scala.inline
    def setMinAbrBitrate(value: integerMin100000Max100000000): Self = this.set("MinAbrBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAbrBitrate: Self = this.set("MinAbrBitrate", js.undefined)
  }
}
