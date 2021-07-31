package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserPoolDomainResponse extends StObject {
  
  /**
    * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name Service (DNS) provider.
    */
  var CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
}
object CreateUserPoolDomainResponse {
  
  @scala.inline
  def apply(): CreateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserPoolDomainResponse]
  }
  
  @scala.inline
  implicit class CreateUserPoolDomainResponseMutableBuilder[Self <: CreateUserPoolDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontDomain(value: DomainType): Self = StObject.set(x, "CloudFrontDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontDomainUndefined: Self = StObject.set(x, "CloudFrontDomain", js.undefined)
  }
}
