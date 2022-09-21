package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSummary extends StObject {
  
  /**
    * A string that specifies a location name.
    */
  var LocationName: js.UndefOr[CidrLocationNameDefaultAllowed] = js.undefined
}
object LocationSummary {
  
  inline def apply(): LocationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationSummary]
  }
  
  extension [Self <: LocationSummary](x: Self) {
    
    inline def setLocationName(value: CidrLocationNameDefaultAllowed): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "LocationName", js.undefined)
  }
}
