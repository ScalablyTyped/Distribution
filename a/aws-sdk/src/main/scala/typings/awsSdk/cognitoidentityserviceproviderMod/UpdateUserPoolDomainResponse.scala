package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserPoolDomainResponse extends StObject {
  
  /**
    * The Amazon CloudFront endpoint that Amazon Cognito set up when you added the custom domain to your user pool.
    */
  var CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
}
object UpdateUserPoolDomainResponse {
  
  @scala.inline
  def apply(): UpdateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserPoolDomainResponse]
  }
  
  @scala.inline
  implicit class UpdateUserPoolDomainResponseMutableBuilder[Self <: UpdateUserPoolDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFrontDomain(value: DomainType): Self = StObject.set(x, "CloudFrontDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontDomainUndefined: Self = StObject.set(x, "CloudFrontDomain", js.undefined)
  }
}
