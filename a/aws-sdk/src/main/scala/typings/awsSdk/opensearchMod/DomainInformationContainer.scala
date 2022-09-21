package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainInformationContainer extends StObject {
  
  var AWSDomainInformation: js.UndefOr[typings.awsSdk.opensearchMod.AWSDomainInformation] = js.undefined
}
object DomainInformationContainer {
  
  inline def apply(): DomainInformationContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainInformationContainer]
  }
  
  extension [Self <: DomainInformationContainer](x: Self) {
    
    inline def setAWSDomainInformation(value: AWSDomainInformation): Self = StObject.set(x, "AWSDomainInformation", value.asInstanceOf[js.Any])
    
    inline def setAWSDomainInformationUndefined: Self = StObject.set(x, "AWSDomainInformation", js.undefined)
  }
}
