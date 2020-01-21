package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationApplicationSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation application.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The name of the simulation application.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * Information about a robot software suite.
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.native
  /**
    * Information about a simulation software suite.
    */
  var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.native
  /**
    * The version of the simulation application.
    */
  var version: js.UndefOr[Version] = js.native
}

object SimulationApplicationSummary {
  @scala.inline
  def apply(
    arn: Arn = null,
    lastUpdatedAt: LastUpdatedAt = null,
    name: Name = null,
    robotSoftwareSuite: RobotSoftwareSuite = null,
    simulationSoftwareSuite: SimulationSoftwareSuite = null,
    version: Version = null
  ): SimulationApplicationSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (robotSoftwareSuite != null) __obj.updateDynamic("robotSoftwareSuite")(robotSoftwareSuite.asInstanceOf[js.Any])
    if (simulationSoftwareSuite != null) __obj.updateDynamic("simulationSoftwareSuite")(simulationSoftwareSuite.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationApplicationSummary]
  }
}

