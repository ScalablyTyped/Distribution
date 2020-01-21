package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConfiguration extends js.Object {
  /**
    * Enables AWS Organization integration.
    */
  var EnableIntegration: Boolean = js.native
}

object OrganizationConfiguration {
  @scala.inline
  def apply(EnableIntegration: Boolean): OrganizationConfiguration = {
    val __obj = js.Dynamic.literal(EnableIntegration = EnableIntegration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrganizationConfiguration]
  }
}

