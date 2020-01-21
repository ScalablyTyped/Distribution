package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServersResponse extends js.Object {
  /**
    * The time when the server was last modified.
    */
  var lastModifiedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The status of the server catalog.
    */
  var serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.native
  /**
    * Information about the servers.
    */
  var serverList: js.UndefOr[ServerList] = js.native
}

object GetServersResponse {
  @scala.inline
  def apply(
    lastModifiedOn: Timestamp = null,
    nextToken: NextToken = null,
    serverCatalogStatus: ServerCatalogStatus = null,
    serverList: ServerList = null
  ): GetServersResponse = {
    val __obj = js.Dynamic.literal()
    if (lastModifiedOn != null) __obj.updateDynamic("lastModifiedOn")(lastModifiedOn.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (serverCatalogStatus != null) __obj.updateDynamic("serverCatalogStatus")(serverCatalogStatus.asInstanceOf[js.Any])
    if (serverList != null) __obj.updateDynamic("serverList")(serverList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServersResponse]
  }
}

