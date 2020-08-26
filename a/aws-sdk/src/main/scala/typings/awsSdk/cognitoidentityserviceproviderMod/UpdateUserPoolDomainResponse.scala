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
  def apply(): UpdateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserPoolDomainResponse]
  }
  @scala.inline
  implicit class UpdateUserPoolDomainResponseOps[Self <: UpdateUserPoolDomainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloudFrontDomain(value: DomainType): Self = this.set("CloudFrontDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudFrontDomain: Self = this.set("CloudFrontDomain", js.undefined)
  }
  
}

