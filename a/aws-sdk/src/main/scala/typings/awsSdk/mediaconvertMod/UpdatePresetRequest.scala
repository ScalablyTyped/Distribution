package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePresetRequest extends js.Object {
  
  /**
    * The new category for the preset, if you are changing it.
    */
  var Category: js.UndefOr[string] = js.native
  
  /**
    * The new description for the preset, if you are changing it.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The name of the preset you are modifying.
    */
  var Name: string = js.native
  
  /**
    * Settings for preset
    */
  var Settings: js.UndefOr[PresetSettings] = js.native
}
object UpdatePresetRequest {
  
  @scala.inline
  def apply(Name: string): UpdatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePresetRequest]
  }
  
  @scala.inline
  implicit class UpdatePresetRequestOps[Self <: UpdatePresetRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: string): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setSettings(value: PresetSettings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
  }
}
