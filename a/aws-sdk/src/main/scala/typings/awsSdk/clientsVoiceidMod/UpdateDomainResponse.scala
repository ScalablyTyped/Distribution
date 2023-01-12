package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainResponse extends StObject {
  
  /**
    * Details about the updated domain
    */
  var Domain: js.UndefOr[typings.awsSdk.clientsVoiceidMod.Domain] = js.undefined
}
object UpdateDomainResponse {
  
  inline def apply(): UpdateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
