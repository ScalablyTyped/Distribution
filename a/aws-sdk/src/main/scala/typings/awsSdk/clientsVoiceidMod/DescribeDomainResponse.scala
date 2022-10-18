package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainResponse extends StObject {
  
  /**
    * Information about the specified domain.
    */
  var Domain: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Domain] = js.undefined
}
object DescribeDomainResponse {
  
  inline def apply(): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  extension [Self <: DescribeDomainResponse](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
