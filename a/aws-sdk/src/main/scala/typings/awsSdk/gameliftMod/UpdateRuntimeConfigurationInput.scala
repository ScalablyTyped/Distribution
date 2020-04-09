package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuntimeConfigurationInput extends js.Object {
  /**
    * A unique identifier for a fleet to update runtime configuration for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  /**
    * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime Servers script. The runtime configuration lists the types of server processes to run on an instance and includes the following configuration settings: the server executable or launch script file, launch parameters, and the number of processes to run concurrently on each instance. A CreateFleet request must include a runtime configuration with at least one server process configuration.
    */
  var RuntimeConfiguration: typings.awsSdk.gameliftMod.RuntimeConfiguration = js.native
}

object UpdateRuntimeConfigurationInput {
  @scala.inline
  def apply(FleetId: FleetIdOrArn, RuntimeConfiguration: RuntimeConfiguration): UpdateRuntimeConfigurationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], RuntimeConfiguration = RuntimeConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRuntimeConfigurationInput]
  }
}

