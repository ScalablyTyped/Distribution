package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2Specification extends StObject {
  
  /**
    * Whether you want a recommendation for standard or convertible reservations.
    */
  var OfferingClass: js.UndefOr[typings.awsSdk.costexplorerMod.OfferingClass] = js.undefined
}
object EC2Specification {
  
  inline def apply(): EC2Specification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2Specification]
  }
  
  extension [Self <: EC2Specification](x: Self) {
    
    inline def setOfferingClass(value: OfferingClass): Self = StObject.set(x, "OfferingClass", value.asInstanceOf[js.Any])
    
    inline def setOfferingClassUndefined: Self = StObject.set(x, "OfferingClass", js.undefined)
  }
}
