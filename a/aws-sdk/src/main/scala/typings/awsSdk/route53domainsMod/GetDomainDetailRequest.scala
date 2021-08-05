package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainDetailRequest extends StObject {
  
  /**
    * The name of the domain that you want to get detailed information about.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
}
object GetDomainDetailRequest {
  
  inline def apply(DomainName: DomainName): GetDomainDetailRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDetailRequest]
  }
  
  extension [Self <: GetDomainDetailRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
