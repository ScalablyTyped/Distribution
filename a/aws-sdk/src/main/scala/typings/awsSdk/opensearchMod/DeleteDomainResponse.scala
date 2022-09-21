package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainResponse extends StObject {
  
  /**
    * The status of the domain being deleted.
    */
  var DomainStatus: js.UndefOr[typings.awsSdk.opensearchMod.DomainStatus] = js.undefined
}
object DeleteDomainResponse {
  
  inline def apply(): DeleteDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDomainResponse]
  }
  
  extension [Self <: DeleteDomainResponse](x: Self) {
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
