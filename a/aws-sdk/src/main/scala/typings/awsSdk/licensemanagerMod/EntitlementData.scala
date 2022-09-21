package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitlementData extends StObject {
  
  /**
    * Entitlement data name.
    */
  var Name: String
  
  /**
    * Entitlement data unit.
    */
  var Unit: EntitlementDataUnit
  
  /**
    * Entitlement data value.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object EntitlementData {
  
  inline def apply(Name: String, Unit: EntitlementDataUnit): EntitlementData = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitlementData]
  }
  
  extension [Self <: EntitlementData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: EntitlementDataUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
