package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDomainConfigType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for the subdomain of your custom domain.
    */
  var CertificateArn: ArnType = js.native
}
object CustomDomainConfigType {
  
  @scala.inline
  def apply(CertificateArn: ArnType): CustomDomainConfigType = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDomainConfigType]
  }
  
  @scala.inline
  implicit class CustomDomainConfigTypeMutableBuilder[Self <: CustomDomainConfigType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: ArnType): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
  }
}
