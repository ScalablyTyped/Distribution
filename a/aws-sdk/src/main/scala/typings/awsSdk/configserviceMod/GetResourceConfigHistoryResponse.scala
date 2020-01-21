package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceConfigHistoryResponse extends js.Object {
  /**
    * A list that contains the configuration history of one or more resources.
    */
  var configurationItems: js.UndefOr[ConfigurationItemList] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetResourceConfigHistoryResponse {
  @scala.inline
  def apply(configurationItems: ConfigurationItemList = null, nextToken: NextToken = null): GetResourceConfigHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (configurationItems != null) __obj.updateDynamic("configurationItems")(configurationItems.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceConfigHistoryResponse]
  }
}

