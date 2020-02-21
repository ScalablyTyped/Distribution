package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSimulationApplicationResponse extends js.Object {
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
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.native
  /**
    * The revision id of the simulation application.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
  /**
    * Information about the robot software suite (ROS distribution).
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.native
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.native
  /**
    * The sources of the simulation application.
    */
  var sources: js.UndefOr[Sources] = js.native
  /**
    * The list of all tags added to the simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The version of the simulation application.
    */
  var version: js.UndefOr[Version] = js.native
}

object CreateSimulationApplicationResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    lastUpdatedAt: LastUpdatedAt = null,
    name: Name = null,
    renderingEngine: RenderingEngine = null,
    revisionId: RevisionId = null,
    robotSoftwareSuite: RobotSoftwareSuite = null,
    simulationSoftwareSuite: SimulationSoftwareSuite = null,
    sources: Sources = null,
    tags: TagMap = null,
    version: Version = null
  ): CreateSimulationApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (renderingEngine != null) __obj.updateDynamic("renderingEngine")(renderingEngine.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (robotSoftwareSuite != null) __obj.updateDynamic("robotSoftwareSuite")(robotSoftwareSuite.asInstanceOf[js.Any])
    if (simulationSoftwareSuite != null) __obj.updateDynamic("simulationSoftwareSuite")(simulationSoftwareSuite.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationResponse]
  }
}

