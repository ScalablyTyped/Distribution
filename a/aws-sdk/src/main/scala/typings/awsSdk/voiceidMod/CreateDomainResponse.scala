package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainResponse extends StObject {
  
  /**
    * Information about the newly created domain.
    */
  var Domain: js.UndefOr[typings.awsSdk.voiceidMod.Domain] = js.undefined
}
object CreateDomainResponse {
  
  inline def apply(): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResponse]
  }
  
  extension [Self <: CreateDomainResponse](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
