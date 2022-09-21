package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitlementUsage extends StObject {
  
  /**
    * Resource usage consumed.
    */
  var ConsumedValue: String
  
  /**
    * Maximum entitlement usage count.
    */
  var MaxCount: js.UndefOr[String] = js.undefined
  
  /**
    * Entitlement usage name.
    */
  var Name: String
  
  /**
    * Entitlement usage unit.
    */
  var Unit: EntitlementDataUnit
}
object EntitlementUsage {
  
  inline def apply(ConsumedValue: String, Name: String, Unit: EntitlementDataUnit): EntitlementUsage = {
    val __obj = js.Dynamic.literal(ConsumedValue = ConsumedValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitlementUsage]
  }
  
  extension [Self <: EntitlementUsage](x: Self) {
    
    inline def setConsumedValue(value: String): Self = StObject.set(x, "ConsumedValue", value.asInstanceOf[js.Any])
    
    inline def setMaxCount(value: String): Self = StObject.set(x, "MaxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "MaxCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: EntitlementDataUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
  }
}
