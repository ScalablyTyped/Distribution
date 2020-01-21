package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceServersResponse extends js.Object {
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The resource servers.
    */
  var ResourceServers: ResourceServersListType = js.native
}

object ListResourceServersResponse {
  @scala.inline
  def apply(ResourceServers: ResourceServersListType, NextToken: PaginationKeyType = null): ListResourceServersResponse = {
    val __obj = js.Dynamic.literal(ResourceServers = ResourceServers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceServersResponse]
  }
}

