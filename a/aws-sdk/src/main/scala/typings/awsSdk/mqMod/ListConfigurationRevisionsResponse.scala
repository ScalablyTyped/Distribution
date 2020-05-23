package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationRevisionsResponse extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[string] = js.native
  /**
    * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The list of all revisions for the specified configuration.
    */
  var Revisions: js.UndefOr[listOfConfigurationRevision] = js.native
}

object ListConfigurationRevisionsResponse {
  @scala.inline
  def apply(
    ConfigurationId: string = null,
    MaxResults: js.UndefOr[integer] = js.undefined,
    NextToken: string = null,
    Revisions: listOfConfigurationRevision = null
  ): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationId != null) __obj.updateDynamic("ConfigurationId")(ConfigurationId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
}

