package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveOutputSettings extends js.Object {
  
  /**
    * Settings specific to the container type of the file.
    */
  var ContainerSettings: ArchiveContainerSettings = js.native
  
  /**
    * Output file extension. If excluded, this will be auto-selected from the container type.
    */
  var Extension: js.UndefOr[string] = js.native
  
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[string] = js.native
}
object ArchiveOutputSettings {
  
  @scala.inline
  def apply(ContainerSettings: ArchiveContainerSettings): ArchiveOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveOutputSettings]
  }
  
  @scala.inline
  implicit class ArchiveOutputSettingsOps[Self <: ArchiveOutputSettings] (val x: Self) extends AnyVal {
    
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
    def setContainerSettings(value: ArchiveContainerSettings): Self = this.set("ContainerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: string): Self = this.set("Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("Extension", js.undefined)
    
    @scala.inline
    def setNameModifier(value: string): Self = this.set("NameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameModifier: Self = this.set("NameModifier", js.undefined)
  }
}
