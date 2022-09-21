package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.organisation
import typings.consumerDataStandards.consumerDataStandardsStrings.person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organisation
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The type of customer object that is present
    */
  var customerUType: organisation | person
  
  var organisation: js.UndefOr[AgentFirstName] = js.undefined
  
  var person: js.UndefOr[EmailAddresses] = js.undefined
}
object Organisation {
  
  inline def apply(customerUType: organisation | person): Organisation = {
    val __obj = js.Dynamic.literal(customerUType = customerUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organisation]
  }
  
  extension [Self <: Organisation](x: Self) {
    
    inline def setCustomerUType(value: organisation | person): Self = StObject.set(x, "customerUType", value.asInstanceOf[js.Any])
    
    inline def setOrganisation(value: AgentFirstName): Self = StObject.set(x, "organisation", value.asInstanceOf[js.Any])
    
    inline def setOrganisationUndefined: Self = StObject.set(x, "organisation", js.undefined)
    
    inline def setPerson(value: EmailAddresses): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
