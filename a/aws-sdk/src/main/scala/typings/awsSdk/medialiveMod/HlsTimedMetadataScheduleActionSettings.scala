package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsTimedMetadataScheduleActionSettings extends StObject {
  
  /**
    * Base64 string formatted according to the ID3 specification: http://id3.org/id3v2.4.0-structure
    */
  var Id3: string = js.native
}
object HlsTimedMetadataScheduleActionSettings {
  
  @scala.inline
  def apply(Id3: string): HlsTimedMetadataScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Id3 = Id3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsTimedMetadataScheduleActionSettings]
  }
  
  @scala.inline
  implicit class HlsTimedMetadataScheduleActionSettingsMutableBuilder[Self <: HlsTimedMetadataScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId3(value: string): Self = StObject.set(x, "Id3", value.asInstanceOf[js.Any])
  }
}
