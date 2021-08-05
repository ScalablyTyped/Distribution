package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsTimedMetadataScheduleActionSettings extends StObject {
  
  /**
    * Base64 string formatted according to the ID3 specification: http://id3.org/id3v2.4.0-structure
    */
  var Id3: string
}
object HlsTimedMetadataScheduleActionSettings {
  
  inline def apply(Id3: string): HlsTimedMetadataScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Id3 = Id3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsTimedMetadataScheduleActionSettings]
  }
  
  extension [Self <: HlsTimedMetadataScheduleActionSettings](x: Self) {
    
    inline def setId3(value: string): Self = StObject.set(x, "Id3", value.asInstanceOf[js.Any])
  }
}
