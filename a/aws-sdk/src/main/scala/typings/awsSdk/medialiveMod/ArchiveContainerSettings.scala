package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveContainerSettings extends js.Object {
  
  var M2tsSettings: js.UndefOr[typings.awsSdk.medialiveMod.M2tsSettings] = js.native
  
  var RawSettings: js.UndefOr[typings.awsSdk.medialiveMod.RawSettings] = js.native
}
object ArchiveContainerSettings {
  
  @scala.inline
  def apply(): ArchiveContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveContainerSettings]
  }
  
  @scala.inline
  implicit class ArchiveContainerSettingsOps[Self <: ArchiveContainerSettings] (val x: Self) extends AnyVal {
    
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
    def setM2tsSettings(value: M2tsSettings): Self = this.set("M2tsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteM2tsSettings: Self = this.set("M2tsSettings", js.undefined)
    
    @scala.inline
    def setRawSettings(value: RawSettings): Self = this.set("RawSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawSettings: Self = this.set("RawSettings", js.undefined)
  }
}
