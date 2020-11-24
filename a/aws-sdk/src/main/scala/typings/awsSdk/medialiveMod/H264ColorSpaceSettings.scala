package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H264ColorSpaceSettings extends js.Object {
  
  var ColorSpacePassthroughSettings: js.UndefOr[typings.awsSdk.medialiveMod.ColorSpacePassthroughSettings] = js.native
  
  var Rec601Settings: js.UndefOr[typings.awsSdk.medialiveMod.Rec601Settings] = js.native
  
  var Rec709Settings: js.UndefOr[typings.awsSdk.medialiveMod.Rec709Settings] = js.native
}
object H264ColorSpaceSettings {
  
  @scala.inline
  def apply(): H264ColorSpaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264ColorSpaceSettings]
  }
  
  @scala.inline
  implicit class H264ColorSpaceSettingsOps[Self <: H264ColorSpaceSettings] (val x: Self) extends AnyVal {
    
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
    def setColorSpacePassthroughSettings(value: ColorSpacePassthroughSettings): Self = this.set("ColorSpacePassthroughSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpacePassthroughSettings: Self = this.set("ColorSpacePassthroughSettings", js.undefined)
    
    @scala.inline
    def setRec601Settings(value: Rec601Settings): Self = this.set("Rec601Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRec601Settings: Self = this.set("Rec601Settings", js.undefined)
    
    @scala.inline
    def setRec709Settings(value: Rec709Settings): Self = this.set("Rec709Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRec709Settings: Self = this.set("Rec709Settings", js.undefined)
  }
}
