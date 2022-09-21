package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiCallActionDomainDetails extends StObject {
  
  /**
    * The name of the DNS domain that issued the API call.
    */
  var Domain: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsApiCallActionDomainDetails {
  
  inline def apply(): AwsApiCallActionDomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiCallActionDomainDetails]
  }
  
  extension [Self <: AwsApiCallActionDomainDetails](x: Self) {
    
    inline def setDomain(value: NonEmptyString): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
