package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresetRequest extends StObject {
  
  /**
    * Optional. A category for the preset you are creating.
    */
  var Category: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. A description of the preset you are creating.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the preset you are creating.
    */
  var Name: string
  
  /**
    * Settings for preset
    */
  var Settings: PresetSettings
  
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreatePresetRequest {
  
  @scala.inline
  def apply(Name: string, Settings: PresetSettings): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetRequest]
  }
  
  @scala.inline
  implicit class CreatePresetRequestMutableBuilder[Self <: CreatePresetRequest] (val x: Self) extends AnyVal {
    
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
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
