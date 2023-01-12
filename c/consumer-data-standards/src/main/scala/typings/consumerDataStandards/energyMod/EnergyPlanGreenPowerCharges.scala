package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.PercentGreen
import typings.consumerDataStandards.consumerDataStandardsStrings.FIXED_PER_DAY
import typings.consumerDataStandards.consumerDataStandardsStrings.FIXED_PER_MONTH
import typings.consumerDataStandards.consumerDataStandardsStrings.FIXED_PER_UNIT
import typings.consumerDataStandards.consumerDataStandardsStrings.FIXED_PER_WEEK
import typings.consumerDataStandards.consumerDataStandardsStrings.GREENPOWER
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PERCENT_OF_BILL
import typings.consumerDataStandards.consumerDataStandardsStrings.PERCENT_OF_USE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanGreenPowerCharges
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The description of the charge
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the charge
    */
  var displayName: String
  
  /**
    * The applicable green power scheme
    */
  var scheme: GREENPOWER | OTHER
  
  /**
    * Array of charge tiers based on the percentage of green power used for the period implied by the type.  Array is in order of increasing percentage of green power
    */
  var tiers: js.Array[PercentGreen]
  
  /**
    * The type of charge
    */
  var `type`: FIXED_PER_DAY | FIXED_PER_WEEK | FIXED_PER_MONTH | FIXED_PER_UNIT | PERCENT_OF_USE | PERCENT_OF_BILL
}
object EnergyPlanGreenPowerCharges {
  
  inline def apply(
    displayName: String,
    scheme: GREENPOWER | OTHER,
    tiers: js.Array[PercentGreen],
    `type`: FIXED_PER_DAY | FIXED_PER_WEEK | FIXED_PER_MONTH | FIXED_PER_UNIT | PERCENT_OF_USE | PERCENT_OF_BILL
  ): EnergyPlanGreenPowerCharges = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], tiers = tiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanGreenPowerCharges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyPlanGreenPowerCharges] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: GREENPOWER | OTHER): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setTiers(value: js.Array[PercentGreen]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
    
    inline def setTiersVarargs(value: PercentGreen*): Self = StObject.set(x, "tiers", js.Array(value*))
    
    inline def setType(
      value: FIXED_PER_DAY | FIXED_PER_WEEK | FIXED_PER_MONTH | FIXED_PER_UNIT | PERCENT_OF_USE | PERCENT_OF_BILL
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
