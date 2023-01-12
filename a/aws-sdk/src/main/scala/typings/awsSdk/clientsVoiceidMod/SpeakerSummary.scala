package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeakerSummary extends StObject {
  
  /**
    * A timestamp showing the speaker's creation time. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The client-provided identifier for the speaker.
    */
  var CustomerSpeakerId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.CustomerSpeakerId] = js.undefined
  
  /**
    * The identifier of the domain that contains the speaker.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * The service-generated identifier for the speaker. 
    */
  var GeneratedSpeakerId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.GeneratedSpeakerId] = js.undefined
  
  /**
    * The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful authentication. This timestamp is accurate to one hour.
    */
  var LastAccessedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the speaker.
    */
  var Status: js.UndefOr[SpeakerStatus] = js.undefined
  
  /**
    * A timestamp showing the speaker's last update.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object SpeakerSummary {
  
  inline def apply(): SpeakerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeakerSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCustomerSpeakerId(value: CustomerSpeakerId): Self = StObject.set(x, "CustomerSpeakerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerSpeakerIdUndefined: Self = StObject.set(x, "CustomerSpeakerId", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setGeneratedSpeakerId(value: GeneratedSpeakerId): Self = StObject.set(x, "GeneratedSpeakerId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedSpeakerIdUndefined: Self = StObject.set(x, "GeneratedSpeakerId", js.undefined)
    
    inline def setLastAccessedAt(value: js.Date): Self = StObject.set(x, "LastAccessedAt", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedAtUndefined: Self = StObject.set(x, "LastAccessedAt", js.undefined)
    
    inline def setStatus(value: SpeakerStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
