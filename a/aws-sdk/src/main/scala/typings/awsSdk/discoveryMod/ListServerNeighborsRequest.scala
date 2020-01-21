package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServerNeighborsRequest extends js.Object {
  /**
    * Configuration ID of the server for which neighbors are being listed.
    */
  var configurationId: ConfigurationId = js.native
  /**
    * Maximum number of results to return in a single page of output.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * List of configuration IDs to test for one-hop-away.
    */
  var neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.native
  /**
    * Token to retrieve the next set of results. For example, if you previously specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Flag to indicate if port and protocol information is needed as part of the response.
    */
  var portInformationNeeded: js.UndefOr[Boolean] = js.native
}

object ListServerNeighborsRequest {
  @scala.inline
  def apply(
    configurationId: ConfigurationId,
    maxResults: Int | Double = null,
    neighborConfigurationIds: ConfigurationIdList = null,
    nextToken: String = null,
    portInformationNeeded: js.UndefOr[scala.Boolean] = js.undefined
  ): ListServerNeighborsRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (neighborConfigurationIds != null) __obj.updateDynamic("neighborConfigurationIds")(neighborConfigurationIds.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(portInformationNeeded)) __obj.updateDynamic("portInformationNeeded")(portInformationNeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsRequest]
  }
}

