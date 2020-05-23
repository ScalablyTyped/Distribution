package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationsResponse extends js.Object {
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[listOfConfiguration] = js.native
  /**
    * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(
    Configurations: listOfConfiguration = null,
    MaxResults: js.UndefOr[integer] = js.undefined,
    NextToken: string = null
  ): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
}

