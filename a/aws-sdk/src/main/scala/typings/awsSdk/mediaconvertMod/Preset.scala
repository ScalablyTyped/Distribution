package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preset extends StObject {
  
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * An optional category you create to organize your presets.
    */
  var Category: js.UndefOr[string] = js.undefined
  
  /**
    * The timestamp in epoch seconds for preset creation.
    */
  var CreatedAt: js.UndefOr[timestampUnix] = js.undefined
  
  /**
    * An optional description you create for each preset.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The timestamp in epoch seconds when the preset was last updated.
    */
  var LastUpdated: js.UndefOr[timestampUnix] = js.undefined
  
  /**
    * A name you create for each preset. Each name must be unique within your account.
    */
  var Name: string
  
  /**
    * Settings for preset
    */
  var Settings: PresetSettings
  
  /**
    * A preset can be of two types: system or custom. System or built-in preset can't be modified or deleted by the user.
    */
  var Type: js.UndefOr[typings.awsSdk.mediaconvertMod.Type] = js.undefined
}
object Preset {
  
  @scala.inline
  def apply(Name: string, Settings: PresetSettings): Preset = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preset]
  }
  
  @scala.inline
  implicit class PresetMutableBuilder[Self <: Preset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCategory(value: string): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampUnix): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: timestampUnix): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: PresetSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
