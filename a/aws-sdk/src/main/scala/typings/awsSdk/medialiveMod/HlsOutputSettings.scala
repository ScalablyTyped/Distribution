package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsOutputSettings extends StObject {
  
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[HlsH265PackagingType] = js.undefined
  
  /**
    * Settings regarding the underlying stream. These settings are different for audio-only outputs.
    */
  var HlsSettings: typings.awsSdk.medialiveMod.HlsSettings
  
  /**
    * String concatenated to the end of the destination filename. Accepts \"Format Identifiers\":#formatIdentifierParameters.
    */
  var NameModifier: js.UndefOr[stringMin1] = js.undefined
  
  /**
    * String concatenated to end of segment filenames.
    */
  var SegmentModifier: js.UndefOr[string] = js.undefined
}
object HlsOutputSettings {
  
  @scala.inline
  def apply(HlsSettings: HlsSettings): HlsOutputSettings = {
    val __obj = js.Dynamic.literal(HlsSettings = HlsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsOutputSettings]
  }
  
  @scala.inline
  implicit class HlsOutputSettingsMutableBuilder[Self <: HlsOutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH265PackagingType(value: HlsH265PackagingType): Self = StObject.set(x, "H265PackagingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH265PackagingTypeUndefined: Self = StObject.set(x, "H265PackagingType", js.undefined)
    
    @scala.inline
    def setHlsSettings(value: HlsSettings): Self = StObject.set(x, "HlsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameModifier(value: stringMin1): Self = StObject.set(x, "NameModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameModifierUndefined: Self = StObject.set(x, "NameModifier", js.undefined)
    
    @scala.inline
    def setSegmentModifier(value: string): Self = StObject.set(x, "SegmentModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentModifierUndefined: Self = StObject.set(x, "SegmentModifier", js.undefined)
  }
}
