package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHostsOutput extends js.Object {
  /**
    * A list of hosts and the details for each host, such as status, endpoint, and provider type.
    */
  var Hosts: js.UndefOr[HostList] = js.native
  /**
    * A token that can be used in the next ListHosts call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarconnectionsMod.NextToken] = js.native
}

object ListHostsOutput {
  @scala.inline
  def apply(Hosts: HostList = null, NextToken: NextToken = null): ListHostsOutput = {
    val __obj = js.Dynamic.literal()
    if (Hosts != null) __obj.updateDynamic("Hosts")(Hosts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostsOutput]
  }
}

