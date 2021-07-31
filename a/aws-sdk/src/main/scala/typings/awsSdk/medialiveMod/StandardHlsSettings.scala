package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardHlsSettings extends StObject {
  
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.undefined
  
  var M3u8Settings: typings.awsSdk.medialiveMod.M3u8Settings
}
object StandardHlsSettings {
  
  @scala.inline
  def apply(M3u8Settings: M3u8Settings): StandardHlsSettings = {
    val __obj = js.Dynamic.literal(M3u8Settings = M3u8Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardHlsSettings]
  }
  
  @scala.inline
  implicit class StandardHlsSettingsMutableBuilder[Self <: StandardHlsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioRenditionSets(value: string): Self = StObject.set(x, "AudioRenditionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioRenditionSetsUndefined: Self = StObject.set(x, "AudioRenditionSets", js.undefined)
    
    @scala.inline
    def setM3u8Settings(value: M3u8Settings): Self = StObject.set(x, "M3u8Settings", value.asInstanceOf[js.Any])
  }
}
