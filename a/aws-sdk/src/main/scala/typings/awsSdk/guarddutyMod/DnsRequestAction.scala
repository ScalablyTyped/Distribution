package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRequestAction extends StObject {
  
  /**
    * The domain information for the API request.
    */
  var Domain: js.UndefOr[String] = js.undefined
}
object DnsRequestAction {
  
  inline def apply(): DnsRequestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRequestAction]
  }
  
  extension [Self <: DnsRequestAction](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
