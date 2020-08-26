package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationData extends js.Object {
  /**
    * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string is decoded, it is presented in the format user:password for private registry authentication using docker login.
    */
  var authorizationToken: js.UndefOr[Base64] = js.native
  /**
    * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid for 12 hours.
    */
  var expiresAt: js.UndefOr[ExpirationTimestamp] = js.native
  /**
    * The registry URL to use for this authorization token in a docker login command. The Amazon ECR registry URL format is https://aws_account_id.dkr.ecr.region.amazonaws.com. For example, https://012345678910.dkr.ecr.us-east-1.amazonaws.com.. 
    */
  var proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.native
}

object AuthorizationData {
  @scala.inline
  def apply(): AuthorizationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationData]
  }
  @scala.inline
  implicit class AuthorizationDataOps[Self <: AuthorizationData] (val x: Self) extends AnyVal {
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
    def setAuthorizationToken(value: Base64): Self = this.set("authorizationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationToken: Self = this.set("authorizationToken", js.undefined)
    @scala.inline
    def setExpiresAt(value: ExpirationTimestamp): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresAt: Self = this.set("expiresAt", js.undefined)
    @scala.inline
    def setProxyEndpoint(value: ProxyEndpoint): Self = this.set("proxyEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyEndpoint: Self = this.set("proxyEndpoint", js.undefined)
  }
  
}

