package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserPoolDomainRequest extends StObject {
  
  /**
    * The domain string.
    */
  var Domain: DomainType
}
object DescribeUserPoolDomainRequest {
  
  inline def apply(Domain: DomainType): DescribeUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolDomainRequest]
  }
  
  extension [Self <: DescribeUserPoolDomainRequest](x: Self) {
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
