package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputGroupSettings extends StObject {
  
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  var CmafGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.CmafGroupSettings] = js.undefined
  
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  var DashIsoGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DashIsoGroupSettings] = js.undefined
  
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  var FileGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.FileGroupSettings] = js.undefined
  
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  var HlsGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.HlsGroupSettings] = js.undefined
  
  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  var MsSmoothGroupSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.MsSmoothGroupSettings] = js.undefined
  
  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  var Type: js.UndefOr[OutputGroupType] = js.undefined
}
object OutputGroupSettings {
  
  @scala.inline
  def apply(): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupSettings]
  }
  
  @scala.inline
  implicit class OutputGroupSettingsMutableBuilder[Self <: OutputGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmafGroupSettings(value: CmafGroupSettings): Self = StObject.set(x, "CmafGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmafGroupSettingsUndefined: Self = StObject.set(x, "CmafGroupSettings", js.undefined)
    
    @scala.inline
    def setDashIsoGroupSettings(value: DashIsoGroupSettings): Self = StObject.set(x, "DashIsoGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashIsoGroupSettingsUndefined: Self = StObject.set(x, "DashIsoGroupSettings", js.undefined)
    
    @scala.inline
    def setFileGroupSettings(value: FileGroupSettings): Self = StObject.set(x, "FileGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileGroupSettingsUndefined: Self = StObject.set(x, "FileGroupSettings", js.undefined)
    
    @scala.inline
    def setHlsGroupSettings(value: HlsGroupSettings): Self = StObject.set(x, "HlsGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsGroupSettingsUndefined: Self = StObject.set(x, "HlsGroupSettings", js.undefined)
    
    @scala.inline
    def setMsSmoothGroupSettings(value: MsSmoothGroupSettings): Self = StObject.set(x, "MsSmoothGroupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsSmoothGroupSettingsUndefined: Self = StObject.set(x, "MsSmoothGroupSettings", js.undefined)
    
    @scala.inline
    def setType(value: OutputGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
