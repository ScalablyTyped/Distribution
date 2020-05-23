package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServersRequest extends js.Object {
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opsworkscmMod.MaxResults] = js.native
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opsworkscmMod.NextToken] = js.native
  /**
    * Describes the server with the specified ServerName.
    */
  var ServerName: js.UndefOr[typings.awsSdk.opsworkscmMod.ServerName] = js.native
}

object DescribeServersRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ServerName: ServerName = null
  ): DescribeServersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServersRequest]
  }
}

