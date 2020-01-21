package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchLocalGatewayRoutesResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[LocalGatewayRouteList] = js.native
}

object SearchLocalGatewayRoutesResult {
  @scala.inline
  def apply(NextToken: String = null, Routes: LocalGatewayRouteList = null): SearchLocalGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Routes != null) __obj.updateDynamic("Routes")(Routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLocalGatewayRoutesResult]
  }
}

