package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserPoolDomainResponse extends js.Object {
  /**
    * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name Service (DNS) provider.
    */
  var CloudFrontDomain: js.UndefOr[DomainType] = js.native
}

object CreateUserPoolDomainResponse {
  @scala.inline
  def apply(CloudFrontDomain: DomainType = null): CreateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontDomain != null) __obj.updateDynamic("CloudFrontDomain")(CloudFrontDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolDomainResponse]
  }
}

