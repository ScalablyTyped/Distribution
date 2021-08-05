package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputGroup extends StObject {
  
  /**
    * Use automated encoding to have MediaConvert choose your encoding settings for you, based on characteristics of your input video.
    */
  var AutomatedEncodingSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AutomatedEncodingSettings] = js.undefined
  
  /**
    * Use Custom Group Name (CustomName) to specify a name for the output group. This value is displayed on the console and can make your job settings JSON more human-readable. It does not affect your outputs. Use up to twelve characters that are either letters, numbers, spaces, or underscores.
    */
  var CustomName: js.UndefOr[string] = js.undefined
  
  /**
    * Name of the output group
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Output Group settings, including type
    */
  var OutputGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.OutputGroupSettings] = js.undefined
  
  /**
    * This object holds groups of encoding settings, one group of settings per output.
    */
  var Outputs: js.UndefOr[listOfOutput] = js.undefined
}
object OutputGroup {
  
  inline def apply(): OutputGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroup]
  }
  
  extension [Self <: OutputGroup](x: Self) {
    
    inline def setAutomatedEncodingSettings(value: AutomatedEncodingSettings): Self = StObject.set(x, "AutomatedEncodingSettings", value.asInstanceOf[js.Any])
    
    inline def setAutomatedEncodingSettingsUndefined: Self = StObject.set(x, "AutomatedEncodingSettings", js.undefined)
    
    inline def setCustomName(value: string): Self = StObject.set(x, "CustomName", value.asInstanceOf[js.Any])
    
    inline def setCustomNameUndefined: Self = StObject.set(x, "CustomName", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputGroupSettings(value: OutputGroupSettings): Self = StObject.set(x, "OutputGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setOutputGroupSettingsUndefined: Self = StObject.set(x, "OutputGroupSettings", js.undefined)
    
    inline def setOutputs(value: listOfOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
  }
}
