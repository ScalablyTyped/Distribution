package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionConnectionInfo extends js.Object {
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typings.awsSdk.gameliftMod.DnsName] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it.
    */
  var GameSessionArn: js.UndefOr[ArnStringModel] = js.native
  /**
    * IP address of the instance that is running the game session. When connecting to a Amazon GameLift game server, a client needs to reference an IP address (or DNS name) and port number.
    */
  var IpAddress: js.UndefOr[StringModel] = js.native
  /**
    * A collection of player session IDs, one for each player ID that was included in the original matchmaking request. 
    */
  var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.native
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PositiveInteger] = js.native
}

object GameSessionConnectionInfo {
  @scala.inline
  def apply(
    DnsName: DnsName = null,
    GameSessionArn: ArnStringModel = null,
    IpAddress: StringModel = null,
    MatchedPlayerSessions: MatchedPlayerSessionList = null,
    Port: js.UndefOr[PositiveInteger] = js.undefined
  ): GameSessionConnectionInfo = {
    val __obj = js.Dynamic.literal()
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (GameSessionArn != null) __obj.updateDynamic("GameSessionArn")(GameSessionArn.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (MatchedPlayerSessions != null) __obj.updateDynamic("MatchedPlayerSessions")(MatchedPlayerSessions.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionConnectionInfo]
  }
}

