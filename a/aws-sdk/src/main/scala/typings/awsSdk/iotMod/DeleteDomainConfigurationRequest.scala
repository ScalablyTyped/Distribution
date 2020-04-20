package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainConfigurationRequest extends js.Object {
  /**
    * The name of the domain configuration to be deleted.
    */
  var domainConfigurationName: DomainConfigurationName = js.native
}

object DeleteDomainConfigurationRequest {
  @scala.inline
  def apply(domainConfigurationName: DomainConfigurationName): DeleteDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainConfigurationRequest]
  }
}

