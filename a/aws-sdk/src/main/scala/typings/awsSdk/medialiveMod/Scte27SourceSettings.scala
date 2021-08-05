package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte27SourceSettings extends StObject {
  
  /**
    * The pid field is used in conjunction with the caption selector languageCode field as follows:
    - Specify PID and Language: Extracts captions from that PID; the language is "informational".
    - Specify PID and omit Language: Extracts the specified PID.
    - Omit PID and specify Language: Extracts the specified language, whichever PID that happens to be.
    - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all languages will be passed through.
    */
  var Pid: js.UndefOr[integerMin1] = js.undefined
}
object Scte27SourceSettings {
  
  inline def apply(): Scte27SourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte27SourceSettings]
  }
  
  extension [Self <: Scte27SourceSettings](x: Self) {
    
    inline def setPid(value: integerMin1): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
  }
}
