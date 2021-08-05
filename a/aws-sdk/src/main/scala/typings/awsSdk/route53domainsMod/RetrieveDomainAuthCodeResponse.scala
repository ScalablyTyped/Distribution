package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveDomainAuthCodeResponse extends StObject {
  
  /**
    * The authorization code for the domain.
    */
  var AuthCode: DomainAuthCode
}
object RetrieveDomainAuthCodeResponse {
  
  inline def apply(AuthCode: DomainAuthCode): RetrieveDomainAuthCodeResponse = {
    val __obj = js.Dynamic.literal(AuthCode = AuthCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
  }
  
  extension [Self <: RetrieveDomainAuthCodeResponse](x: Self) {
    
    inline def setAuthCode(value: DomainAuthCode): Self = StObject.set(x, "AuthCode", value.asInstanceOf[js.Any])
  }
}
