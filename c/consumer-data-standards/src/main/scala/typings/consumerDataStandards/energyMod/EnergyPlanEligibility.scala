package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.CONTINGENT_PLAN
import typings.consumerDataStandards.consumerDataStandardsStrings.EXISTING_BASIC_METER
import typings.consumerDataStandards.consumerDataStandardsStrings.EXISTING_BATTERY
import typings.consumerDataStandards.consumerDataStandardsStrings.EXISTING_CUST
import typings.consumerDataStandards.consumerDataStandardsStrings.EXISTING_POOL
import typings.consumerDataStandards.consumerDataStandardsStrings.EXISTING_SMART_METER
import typings.consumerDataStandards.consumerDataStandardsStrings.EXISTING_SOLAR
import typings.consumerDataStandards.consumerDataStandardsStrings.GROUP_BUY_MEMBER
import typings.consumerDataStandards.consumerDataStandardsStrings.LOYALTY_MEMBER
import typings.consumerDataStandards.consumerDataStandardsStrings.MINIMUM_USAGE
import typings.consumerDataStandards.consumerDataStandardsStrings.NEW_CUSTOMER
import typings.consumerDataStandards.consumerDataStandardsStrings.NO_SOLAR_FIT
import typings.consumerDataStandards.consumerDataStandardsStrings.ONLINE_ONLY
import typings.consumerDataStandards.consumerDataStandardsStrings.ORG_MEMBER
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.REQ_EQUIP_SUPPLIER
import typings.consumerDataStandards.consumerDataStandardsStrings.SENIOR_CARD
import typings.consumerDataStandards.consumerDataStandardsStrings.SMALL_BUSINESS
import typings.consumerDataStandards.consumerDataStandardsStrings.SPECIFIC_LOCATION
import typings.consumerDataStandards.consumerDataStandardsStrings.SPORT_CLUB_MEMBER
import typings.consumerDataStandards.consumerDataStandardsStrings.THIRD_PARTY_ONLY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanEligibility
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A description of the eligibility restriction
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Information of the eligibility restriction specific to the type of the restriction
    */
  var information: String
  
  /**
    * The type of the eligibility restriction.<br/>The CONTINGENT_PLAN value indicates that the plan is contingent on the customer taking up an alternate fuel plan from the same retailer (for instance, if the fuelType is ELECTRICITY then a GAS plan from the same retailer must be taken up)
    */
  var `type`: EXISTING_CUST | EXISTING_POOL | EXISTING_SOLAR | EXISTING_BATTERY | EXISTING_SMART_METER | EXISTING_BASIC_METER | SENIOR_CARD | SMALL_BUSINESS | NO_SOLAR_FIT | NEW_CUSTOMER | ONLINE_ONLY | REQ_EQUIP_SUPPLIER | THIRD_PARTY_ONLY | SPORT_CLUB_MEMBER | ORG_MEMBER | SPECIFIC_LOCATION | MINIMUM_USAGE | LOYALTY_MEMBER | GROUP_BUY_MEMBER | CONTINGENT_PLAN | OTHER
}
object EnergyPlanEligibility {
  
  inline def apply(
    information: String,
    `type`: EXISTING_CUST | EXISTING_POOL | EXISTING_SOLAR | EXISTING_BATTERY | EXISTING_SMART_METER | EXISTING_BASIC_METER | SENIOR_CARD | SMALL_BUSINESS | NO_SOLAR_FIT | NEW_CUSTOMER | ONLINE_ONLY | REQ_EQUIP_SUPPLIER | THIRD_PARTY_ONLY | SPORT_CLUB_MEMBER | ORG_MEMBER | SPECIFIC_LOCATION | MINIMUM_USAGE | LOYALTY_MEMBER | GROUP_BUY_MEMBER | CONTINGENT_PLAN | OTHER
  ): EnergyPlanEligibility = {
    val __obj = js.Dynamic.literal(information = information.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanEligibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyPlanEligibility] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInformation(value: String): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: EXISTING_CUST | EXISTING_POOL | EXISTING_SOLAR | EXISTING_BATTERY | EXISTING_SMART_METER | EXISTING_BASIC_METER | SENIOR_CARD | SMALL_BUSINESS | NO_SOLAR_FIT | NEW_CUSTOMER | ONLINE_ONLY | REQ_EQUIP_SUPPLIER | THIRD_PARTY_ONLY | SPORT_CLUB_MEMBER | ORG_MEMBER | SPECIFIC_LOCATION | MINIMUM_USAGE | LOYALTY_MEMBER | GROUP_BUY_MEMBER | CONTINGENT_PLAN | OTHER
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
