package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.native
  /**
    * Information about the robot software suite (ROS distribution).
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: SimulationSoftwareSuite = js.native
  /**
    * The sources of the simulation application.
    */
  var sources: SourceConfigs = js.native
}

object UpdateSimulationApplicationRequest {
  @scala.inline
  def apply(
    application: Arn,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite,
    sources: SourceConfigs,
    currentRevisionId: RevisionId = null,
    renderingEngine: RenderingEngine = null
  ): UpdateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], simulationSoftwareSuite = simulationSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    if (currentRevisionId != null) __obj.updateDynamic("currentRevisionId")(currentRevisionId.asInstanceOf[js.Any])
    if (renderingEngine != null) __obj.updateDynamic("renderingEngine")(renderingEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSimulationApplicationRequest]
  }
}

