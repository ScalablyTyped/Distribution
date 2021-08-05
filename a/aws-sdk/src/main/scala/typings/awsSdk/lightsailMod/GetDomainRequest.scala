package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainRequest extends StObject {
  
  /**
    * The domain name for which your want to return information about.
    */
  var domainName: DomainName
}
object GetDomainRequest {
  
  inline def apply(domainName: DomainName): GetDomainRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainRequest]
  }
  
  extension [Self <: GetDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
