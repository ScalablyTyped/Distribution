package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCodecSettings extends js.Object {
  
  var FrameCaptureSettings: js.UndefOr[typings.awsSdk.medialiveMod.FrameCaptureSettings] = js.native
  
  var H264Settings: js.UndefOr[typings.awsSdk.medialiveMod.H264Settings] = js.native
  
  var H265Settings: js.UndefOr[typings.awsSdk.medialiveMod.H265Settings] = js.native
  
  var Mpeg2Settings: js.UndefOr[typings.awsSdk.medialiveMod.Mpeg2Settings] = js.native
}
object VideoCodecSettings {
  
  @scala.inline
  def apply(): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCodecSettings]
  }
  
  @scala.inline
  implicit class VideoCodecSettingsOps[Self <: VideoCodecSettings] (val x: Self) extends AnyVal {
    
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
    def setFrameCaptureSettings(value: FrameCaptureSettings): Self = this.set("FrameCaptureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameCaptureSettings: Self = this.set("FrameCaptureSettings", js.undefined)
    
    @scala.inline
    def setH264Settings(value: H264Settings): Self = this.set("H264Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH264Settings: Self = this.set("H264Settings", js.undefined)
    
    @scala.inline
    def setH265Settings(value: H265Settings): Self = this.set("H265Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH265Settings: Self = this.set("H265Settings", js.undefined)
    
    @scala.inline
    def setMpeg2Settings(value: Mpeg2Settings): Self = this.set("Mpeg2Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMpeg2Settings: Self = this.set("Mpeg2Settings", js.undefined)
  }
}
