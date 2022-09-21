package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainResponse extends StObject {
  
  /**
    * The status of the newly created domain.
    */
  var DomainStatus: js.UndefOr[typings.awsSdk.opensearchMod.DomainStatus] = js.undefined
}
object CreateDomainResponse {
  
  inline def apply(): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResponse]
  }
  
  extension [Self <: CreateDomainResponse](x: Self) {
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
