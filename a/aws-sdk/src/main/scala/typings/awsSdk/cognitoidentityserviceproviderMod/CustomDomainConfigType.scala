package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDomainConfigType extends js.Object {
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
}

