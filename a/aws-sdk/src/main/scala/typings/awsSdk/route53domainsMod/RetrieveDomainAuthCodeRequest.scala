package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveDomainAuthCodeRequest extends js.Object {
  /**
    * The name of the domain that you want to get an authorization code for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object RetrieveDomainAuthCodeRequest {
  @scala.inline
  def apply(DomainName: DomainName): RetrieveDomainAuthCodeRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeRequest]
  }
}

