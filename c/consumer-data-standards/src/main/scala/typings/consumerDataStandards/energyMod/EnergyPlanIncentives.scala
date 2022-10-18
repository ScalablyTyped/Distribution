package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACCOUNT_CREDIT
import typings.consumerDataStandards.consumerDataStandardsStrings.GIFT
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanIncentives
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The type of the incentive
    */
  var category: GIFT | ACCOUNT_CREDIT | OTHER
  
  /**
    * The description of the incentive
    */
  var description: String
  
  /**
    * The display name of the incentive
    */
  var displayName: String
  
  /**
    * A display message outlining an eligibility criteria that may apply
    */
  var eligibility: js.UndefOr[String] = js.undefined
}
object EnergyPlanIncentives {
  
  inline def apply(category: GIFT | ACCOUNT_CREDIT | OTHER, description: String, displayName: String): EnergyPlanIncentives = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanIncentives]
  }
  
  extension [Self <: EnergyPlanIncentives](x: Self) {
    
    inline def setCategory(value: GIFT | ACCOUNT_CREDIT | OTHER): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEligibility(value: String): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
  }
}
