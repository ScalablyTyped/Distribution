package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDetail extends js.Object {
  /**
    * The domain configuration. Currently, this includes only the domain's retention period.
    */
  var configuration: DomainConfiguration = js.native
  /**
    * The basic information about a domain, such as its name, status, and description.
    */
  var domainInfo: DomainInfo = js.native
}

object DomainDetail {
  @scala.inline
  def apply(configuration: DomainConfiguration, domainInfo: DomainInfo): DomainDetail = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], domainInfo = domainInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainDetail]
  }
}

