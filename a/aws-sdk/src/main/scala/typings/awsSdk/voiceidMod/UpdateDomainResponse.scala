package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainResponse extends StObject {
  
  /**
    * Details about the updated domain
    */
  var Domain: js.UndefOr[typings.awsSdk.voiceidMod.Domain] = js.undefined
}
object UpdateDomainResponse {
  
  inline def apply(): UpdateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainResponse]
  }
  
  extension [Self <: UpdateDomainResponse](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
