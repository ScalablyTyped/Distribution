package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardHlsSettings extends js.Object {
  
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.native
  
  var M3u8Settings: typings.awsSdk.medialiveMod.M3u8Settings = js.native
}
object StandardHlsSettings {
  
  @scala.inline
  def apply(M3u8Settings: M3u8Settings): StandardHlsSettings = {
    val __obj = js.Dynamic.literal(M3u8Settings = M3u8Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardHlsSettings]
  }
  
  @scala.inline
  implicit class StandardHlsSettingsOps[Self <: StandardHlsSettings] (val x: Self) extends AnyVal {
    
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
    def setM3u8Settings(value: M3u8Settings): Self = this.set("M3u8Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioRenditionSets(value: string): Self = this.set("AudioRenditionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioRenditionSets: Self = this.set("AudioRenditionSets", js.undefined)
  }
}
