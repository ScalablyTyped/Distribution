package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpeakerResponse extends StObject {
  
  /**
    * Information about the specified speaker.
    */
  var Speaker: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Speaker] = js.undefined
}
object DescribeSpeakerResponse {
  
  inline def apply(): DescribeSpeakerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpeakerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSpeakerResponse] (val x: Self) extends AnyVal {
    
    inline def setSpeaker(value: Speaker): Self = StObject.set(x, "Speaker", value.asInstanceOf[js.Any])
    
    inline def setSpeakerUndefined: Self = StObject.set(x, "Speaker", js.undefined)
  }
}
