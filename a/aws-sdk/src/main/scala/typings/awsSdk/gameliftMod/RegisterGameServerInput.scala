package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterGameServerInput extends js.Object {
  /**
    * Information needed to make inbound client connections to the game server. This might include IP address and port, DNS name, etc.
    */
  var ConnectionInfo: js.UndefOr[GameServerConnectionInfo] = js.native
  /**
    * A game server tag that can be used to request sorted lists of game servers using ListGameServers. Custom sort keys are developer-defined based on how you want to organize the retrieved game server information.
    */
  var CustomSortKey: js.UndefOr[GameServerSortKey] = js.native
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service when it requests information on a game servers using ListGameServers or ClaimGameServer. 
    */
  var GameServerData: js.UndefOr[typings.awsSdk.gameliftMod.GameServerData] = js.native
  /**
    * An identifier for the game server group where the game server is running. You can use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and must be unique across all game server groups in your AWS account.
    */
  var GameServerId: typings.awsSdk.gameliftMod.GameServerId = js.native
  /**
    * The unique identifier for the instance where the game server is running. This ID is available in the instance metadata.
    */
  var InstanceId: GameServerInstanceId = js.native
  /**
    * A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management, and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object RegisterGameServerInput {
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupNameOrArn,
    GameServerId: GameServerId,
    InstanceId: GameServerInstanceId
  ): RegisterGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterGameServerInput]
  }
  @scala.inline
  implicit class RegisterGameServerInputOps[Self <: RegisterGameServerInput] (val x: Self) extends AnyVal {
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
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameServerId(value: GameServerId): Self = this.set("GameServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: GameServerInstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionInfo(value: GameServerConnectionInfo): Self = this.set("ConnectionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionInfo: Self = this.set("ConnectionInfo", js.undefined)
    @scala.inline
    def setCustomSortKey(value: GameServerSortKey): Self = this.set("CustomSortKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSortKey: Self = this.set("CustomSortKey", js.undefined)
    @scala.inline
    def setGameServerData(value: GameServerData): Self = this.set("GameServerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServerData: Self = this.set("GameServerData", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

