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
  
  @scala.inline
  def apply(Domain: DomainType): DescribeUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolDomainRequest]
  }
  
  @scala.inline
  implicit class DescribeUserPoolDomainRequestMutableBuilder[Self <: DescribeUserPoolDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
