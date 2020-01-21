package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainConfigurationRequest extends js.Object {
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: ReservedDomainConfigurationName = js.native
}

object DescribeDomainConfigurationRequest {
  @scala.inline
  def apply(domainConfigurationName: ReservedDomainConfigurationName): DescribeDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDomainConfigurationRequest]
  }
}

