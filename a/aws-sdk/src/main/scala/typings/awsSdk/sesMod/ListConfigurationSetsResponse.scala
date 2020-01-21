package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsResponse extends js.Object {
  /**
    * A list of configuration sets.
    */
  var ConfigurationSets: js.UndefOr[typings.awsSdk.sesMod.ConfigurationSets] = js.native
  /**
    * A token indicating that there are additional configuration sets available to be listed. Pass this token to successive calls of ListConfigurationSets. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}

object ListConfigurationSetsResponse {
  @scala.inline
  def apply(ConfigurationSets: ConfigurationSets = null, NextToken: NextToken = null): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSets != null) __obj.updateDynamic("ConfigurationSets")(ConfigurationSets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
}

