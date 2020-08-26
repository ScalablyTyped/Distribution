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
  def apply(): GameSessionConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionConnectionInfo]
  }
  @scala.inline
  implicit class GameSessionConnectionInfoOps[Self <: GameSessionConnectionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDnsName(value: DnsName): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    @scala.inline
    def setGameSessionArn(value: ArnStringModel): Self = this.set("GameSessionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionArn: Self = this.set("GameSessionArn", js.undefined)
    @scala.inline
    def setIpAddress(value: StringModel): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    @scala.inline
    def setMatchedPlayerSessionsVarargs(value: MatchedPlayerSession*): Self = this.set("MatchedPlayerSessions", js.Array(value :_*))
    @scala.inline
    def setMatchedPlayerSessions(value: MatchedPlayerSessionList): Self = this.set("MatchedPlayerSessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchedPlayerSessions: Self = this.set("MatchedPlayerSessions", js.undefined)
    @scala.inline
    def setPort(value: PositiveInteger): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
  }
  
}

