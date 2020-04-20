package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveDomainAuthCodeResponse extends js.Object {
  /**
    * The authorization code for the domain.
    */
  var AuthCode: DomainAuthCode = js.native
}

object RetrieveDomainAuthCodeResponse {
  @scala.inline
  def apply(AuthCode: DomainAuthCode): RetrieveDomainAuthCodeResponse = {
    val __obj = js.Dynamic.literal(AuthCode = AuthCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
  }
}

