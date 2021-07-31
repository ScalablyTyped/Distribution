package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePresetRequest extends StObject {
  
  /**
    * The new category for the preset, if you are changing it.
    */
  var Category: js.UndefOr[string] = js.undefined
  
  /**
    * The new description for the preset, if you are changing it.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the preset you are modifying.
    */
  var Name: string
  
  /**
    * Settings for preset
    */
  var Settings: js.UndefOr[PresetSettings] = js.undefined
}
object UpdatePresetRequest {
  
  @scala.inline
  def apply(Name: string): UpdatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePresetRequest]
  }
  
  @scala.inline
  implicit class UpdatePresetRequestMutableBuilder[Self <: UpdatePresetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: string): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: PresetSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
