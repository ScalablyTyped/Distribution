package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainRequest extends js.Object {
  /**
    * The specific domain name to delete.
    */
  var domainName: DomainName = js.native
}

object DeleteDomainRequest {
  @scala.inline
  def apply(domainName: DomainName): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}

