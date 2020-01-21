package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserPoolDomainResponse extends js.Object {
  /**
    * The Amazon CloudFront endpoint that Amazon Cognito set up when you added the custom domain to your user pool.
    */
  var CloudFrontDomain: js.UndefOr[DomainType] = js.native
}

object UpdateUserPoolDomainResponse {
  @scala.inline
  def apply(CloudFrontDomain: DomainType = null): UpdateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontDomain != null) __obj.updateDynamic("CloudFrontDomain")(CloudFrontDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolDomainResponse]
  }
}

