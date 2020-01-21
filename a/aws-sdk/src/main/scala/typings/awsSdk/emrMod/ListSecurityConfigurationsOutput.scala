package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityConfigurationsOutput extends js.Object {
  /**
    * A pagination token that indicates the next set of results to retrieve. Include the marker in the next ListSecurityConfiguration call to retrieve the next page of results, if required.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
  /**
    * The creation date and time, and name, of each security configuration.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.native
}

object ListSecurityConfigurationsOutput {
  @scala.inline
  def apply(Marker: Marker = null, SecurityConfigurations: SecurityConfigurationList = null): ListSecurityConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (SecurityConfigurations != null) __obj.updateDynamic("SecurityConfigurations")(SecurityConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityConfigurationsOutput]
  }
}

