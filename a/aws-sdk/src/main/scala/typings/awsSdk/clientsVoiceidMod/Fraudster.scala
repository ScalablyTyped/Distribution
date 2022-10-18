package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fraudster extends StObject {
  
  /**
    * The timestamp when Voice ID identified the fraudster.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the domain containing the fraudster.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.DomainId] = js.undefined
  
  /**
    * The service-generated identifier for the fraudster.
    */
  var GeneratedFraudsterId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.GeneratedFraudsterId] = js.undefined
}
object Fraudster {
  
  inline def apply(): Fraudster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fraudster]
  }
  
  extension [Self <: Fraudster](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setGeneratedFraudsterId(value: GeneratedFraudsterId): Self = StObject.set(x, "GeneratedFraudsterId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFraudsterIdUndefined: Self = StObject.set(x, "GeneratedFraudsterId", js.undefined)
  }
}
