package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsSmoothOutputSettings extends js.Object {
  
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[MsSmoothH265PackagingType] = js.native
  
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[string] = js.native
}
object MsSmoothOutputSettings {
  
  @scala.inline
  def apply(): MsSmoothOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothOutputSettings]
  }
  
  @scala.inline
  implicit class MsSmoothOutputSettingsOps[Self <: MsSmoothOutputSettings] (val x: Self) extends AnyVal {
    
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
    def setH265PackagingType(value: MsSmoothH265PackagingType): Self = this.set("H265PackagingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH265PackagingType: Self = this.set("H265PackagingType", js.undefined)
    
    @scala.inline
    def setNameModifier(value: string): Self = this.set("NameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameModifier: Self = this.set("NameModifier", js.undefined)
  }
}
