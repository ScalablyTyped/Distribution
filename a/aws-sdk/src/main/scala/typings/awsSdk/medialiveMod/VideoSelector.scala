package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSelector extends js.Object {
  
  /**
    * Specifies the color space of an input. This setting works in tandem with colorSpaceUsage and a video description's colorSpaceSettingsChoice to determine if any conversion will be performed.
    */
  var ColorSpace: js.UndefOr[VideoSelectorColorSpace] = js.native
  
  /**
    * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace field will be used. fallback means that when the input does include color space data, that data will be used, but when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is sometimes missing color space data, but when it does have color space data, that data is correct. force means to always use the value in colorSpace. Choose force if your input usually has no color space data or might have unreliable color space data.
    */
  var ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage] = js.native
  
  /**
    * The video selector settings.
    */
  var SelectorSettings: js.UndefOr[VideoSelectorSettings] = js.native
}
object VideoSelector {
  
  @scala.inline
  def apply(): VideoSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelector]
  }
  
  @scala.inline
  implicit class VideoSelectorOps[Self <: VideoSelector] (val x: Self) extends AnyVal {
    
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
    def setColorSpace(value: VideoSelectorColorSpace): Self = this.set("ColorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpace: Self = this.set("ColorSpace", js.undefined)
    
    @scala.inline
    def setColorSpaceUsage(value: VideoSelectorColorSpaceUsage): Self = this.set("ColorSpaceUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpaceUsage: Self = this.set("ColorSpaceUsage", js.undefined)
    
    @scala.inline
    def setSelectorSettings(value: VideoSelectorSettings): Self = this.set("SelectorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectorSettings: Self = this.set("SelectorSettings", js.undefined)
  }
}
