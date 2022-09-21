package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenewalSettings extends StObject {
  
  /**
    * Automatic renewal status for the reservation
    */
  var AutomaticRenewal: js.UndefOr[ReservationAutomaticRenewal] = js.undefined
  
  /**
    * Count for the reservation renewal
    */
  var RenewalCount: js.UndefOr[integerMin1] = js.undefined
}
object RenewalSettings {
  
  inline def apply(): RenewalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewalSettings]
  }
  
  extension [Self <: RenewalSettings](x: Self) {
    
    inline def setAutomaticRenewal(value: ReservationAutomaticRenewal): Self = StObject.set(x, "AutomaticRenewal", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRenewalUndefined: Self = StObject.set(x, "AutomaticRenewal", js.undefined)
    
    inline def setRenewalCount(value: integerMin1): Self = StObject.set(x, "RenewalCount", value.asInstanceOf[js.Any])
    
    inline def setRenewalCountUndefined: Self = StObject.set(x, "RenewalCount", js.undefined)
  }
}
