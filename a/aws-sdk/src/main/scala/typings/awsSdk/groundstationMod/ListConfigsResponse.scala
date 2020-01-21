package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigsResponse extends js.Object {
  /**
    * List of Config items.
    */
  var configList: js.UndefOr[ConfigList] = js.native
  /**
    * Next token returned in the response of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListConfigsResponse {
  @scala.inline
  def apply(configList: ConfigList = null, nextToken: String = null): ListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (configList != null) __obj.updateDynamic("configList")(configList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigsResponse]
  }
}

