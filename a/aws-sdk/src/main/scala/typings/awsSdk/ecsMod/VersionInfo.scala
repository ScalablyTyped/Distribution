package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionInfo extends js.Object {
  /**
    * The Git commit hash for the Amazon ECS container agent build on the amazon-ecs-agent  GitHub repository.
    */
  var agentHash: js.UndefOr[String] = js.native
  /**
    * The version number of the Amazon ECS container agent.
    */
  var agentVersion: js.UndefOr[String] = js.native
  /**
    * The Docker version running on the container instance.
    */
  var dockerVersion: js.UndefOr[String] = js.native
}

object VersionInfo {
  @scala.inline
  def apply(agentHash: String = null, agentVersion: String = null, dockerVersion: String = null): VersionInfo = {
    val __obj = js.Dynamic.literal()
    if (agentHash != null) __obj.updateDynamic("agentHash")(agentHash.asInstanceOf[js.Any])
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion.asInstanceOf[js.Any])
    if (dockerVersion != null) __obj.updateDynamic("dockerVersion")(dockerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionInfo]
  }
}

