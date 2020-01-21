package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsResponse extends js.Object {
  /**
    * An object that contains a list of configuration sets for your account in the current region.
    */
  var ConfigurationSets: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.ConfigurationSets] = js.native
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position in the list of configuration sets.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
}

object ListConfigurationSetsResponse {
  @scala.inline
  def apply(ConfigurationSets: ConfigurationSets = null, NextToken: NextTokenString = null): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSets != null) __obj.updateDynamic("ConfigurationSets")(ConfigurationSets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
}

