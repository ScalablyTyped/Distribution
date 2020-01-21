package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityConfigurationsResponse extends js.Object {
  /**
    * A continuation token, if there are more security configurations to return.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of security configurations.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.native
}

object GetSecurityConfigurationsResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, SecurityConfigurations: SecurityConfigurationList = null): GetSecurityConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SecurityConfigurations != null) __obj.updateDynamic("SecurityConfigurations")(SecurityConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityConfigurationsResponse]
  }
}

