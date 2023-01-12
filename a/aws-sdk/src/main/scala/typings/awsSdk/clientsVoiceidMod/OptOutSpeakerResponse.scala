package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptOutSpeakerResponse extends StObject {
  
  /**
    * Details about the opted-out speaker.
    */
  var Speaker: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Speaker] = js.undefined
}
object OptOutSpeakerResponse {
  
  inline def apply(): OptOutSpeakerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptOutSpeakerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptOutSpeakerResponse] (val x: Self) extends AnyVal {
    
    inline def setSpeaker(value: Speaker): Self = StObject.set(x, "Speaker", value.asInstanceOf[js.Any])
    
    inline def setSpeakerUndefined: Self = StObject.set(x, "Speaker", js.undefined)
  }
}
