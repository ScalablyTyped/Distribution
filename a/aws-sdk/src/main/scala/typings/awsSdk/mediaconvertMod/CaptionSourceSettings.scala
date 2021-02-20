package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSourceSettings extends StObject {
  
  /**
    * Settings for ancillary captions source.
    */
  var AncillarySourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AncillarySourceSettings] = js.native
  
  /**
    * DVB Sub Source Settings
    */
  var DvbSubSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DvbSubSourceSettings] = js.native
  
  /**
    * Settings for embedded captions Source
    */
  var EmbeddedSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.EmbeddedSourceSettings] = js.native
  
  /**
    * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  var FileSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.FileSourceSettings] = js.native
  
  /**
    * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
    */
  var SourceType: js.UndefOr[CaptionSourceType] = js.native
  
  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  var TeletextSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TeletextSourceSettings] = js.native
  
  /**
    * Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.
    */
  var TrackSourceSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.TrackSourceSettings] = js.native
}
object CaptionSourceSettings {
  
  @scala.inline
  def apply(): CaptionSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSourceSettings]
  }
  
  @scala.inline
  implicit class CaptionSourceSettingsMutableBuilder[Self <: CaptionSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncillarySourceSettings(value: AncillarySourceSettings): Self = StObject.set(x, "AncillarySourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncillarySourceSettingsUndefined: Self = StObject.set(x, "AncillarySourceSettings", js.undefined)
    
    @scala.inline
    def setDvbSubSourceSettings(value: DvbSubSourceSettings): Self = StObject.set(x, "DvbSubSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvbSubSourceSettingsUndefined: Self = StObject.set(x, "DvbSubSourceSettings", js.undefined)
    
    @scala.inline
    def setEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = StObject.set(x, "EmbeddedSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedSourceSettingsUndefined: Self = StObject.set(x, "EmbeddedSourceSettings", js.undefined)
    
    @scala.inline
    def setFileSourceSettings(value: FileSourceSettings): Self = StObject.set(x, "FileSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSourceSettingsUndefined: Self = StObject.set(x, "FileSourceSettings", js.undefined)
    
    @scala.inline
    def setSourceType(value: CaptionSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setTeletextSourceSettings(value: TeletextSourceSettings): Self = StObject.set(x, "TeletextSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeletextSourceSettingsUndefined: Self = StObject.set(x, "TeletextSourceSettings", js.undefined)
    
    @scala.inline
    def setTrackSourceSettings(value: TrackSourceSettings): Self = StObject.set(x, "TrackSourceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackSourceSettingsUndefined: Self = StObject.set(x, "TrackSourceSettings", js.undefined)
  }
}
