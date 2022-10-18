package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSpeakerRequest extends StObject {
  
  /**
    * The identifier of the domain containing the speaker.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the speaker you want to delete.
    */
  var SpeakerId: typings.awsSdk.clientsVoiceidMod.SpeakerId
}
object DeleteSpeakerRequest {
  
  inline def apply(DomainId: DomainId, SpeakerId: SpeakerId): DeleteSpeakerRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], SpeakerId = SpeakerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSpeakerRequest]
  }
  
  extension [Self <: DeleteSpeakerRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setSpeakerId(value: SpeakerId): Self = StObject.set(x, "SpeakerId", value.asInstanceOf[js.Any])
  }
}
