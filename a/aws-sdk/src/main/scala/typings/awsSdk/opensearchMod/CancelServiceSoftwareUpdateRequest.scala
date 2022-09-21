package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * The name of the domain that you want to stop the latest service software update on.
    */
  var DomainName: typings.awsSdk.opensearchMod.DomainName
}
object CancelServiceSoftwareUpdateRequest {
  
  inline def apply(DomainName: DomainName): CancelServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelServiceSoftwareUpdateRequest]
  }
  
  extension [Self <: CancelServiceSoftwareUpdateRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
