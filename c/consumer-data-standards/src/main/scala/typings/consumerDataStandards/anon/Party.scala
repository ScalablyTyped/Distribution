package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.DRSP
import typings.consumerDataStandards.consumerDataStandardsStrings.FRMP
import typings.consumerDataStandards.consumerDataStandardsStrings.LNSP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Party
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The name of the party/orginsation related to this service point
    */
  var party: String
  
  /**
    * The role performed by this participant in relation to the service point. Note the details of enumeration values below: <ul><li>**FRMP** - Financially Responsible Market Participant</li><li>**LNSP** - Local Network Service Provider or Embedded Network Manager for child connection points</li><li>**DRSP** - wholesale Demand Response and/or market ancillary Service Provider and note that where it is not relevant for a NMI it will not be included</li></ul>
    */
  var role: FRMP | LNSP | DRSP
}
object Party {
  
  inline def apply(party: String, role: FRMP | LNSP | DRSP): Party = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Party]
  }
  
  extension [Self <: Party](x: Self) {
    
    inline def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setRole(value: FRMP | LNSP | DRSP): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
