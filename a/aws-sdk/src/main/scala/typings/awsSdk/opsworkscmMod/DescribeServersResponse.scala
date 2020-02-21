package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServersResponse extends js.Object {
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Contains the response to a DescribeServers request.  For Chef Automate servers: If DescribeServersResponse$Servers$EngineAttributes includes CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to Chef Automate 2. To be eligible for upgrade, a server running Chef Automate 1 must have had at least one successful maintenance run after November 1, 2019.  For Puppet Server: DescribeServersResponse$Servers$EngineAttributes contains PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number 8140. The CA certificate is also used to sign node certificates.
    */
  var Servers: js.UndefOr[typings.awsSdk.opsworkscmMod.Servers] = js.native
}

object DescribeServersResponse {
  @scala.inline
  def apply(NextToken: String = null, Servers: Servers = null): DescribeServersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Servers != null) __obj.updateDynamic("Servers")(Servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServersResponse]
  }
}

