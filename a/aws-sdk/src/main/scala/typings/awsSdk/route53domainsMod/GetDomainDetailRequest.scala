package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainDetailRequest extends js.Object {
  /**
    * The name of the domain that you want to get detailed information about.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object GetDomainDetailRequest {
  @scala.inline
  def apply(DomainName: DomainName): GetDomainDetailRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainDetailRequest]
  }
}

