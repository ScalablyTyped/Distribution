package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSimulationApplicationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot simulation application.
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
    * The list of all tags added to the specified simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The version of the simulation application.
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeSimulationApplicationResponse {
  @scala.inline
  def apply(): DescribeSimulationApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSimulationApplicationResponse]
  }
  @scala.inline
  implicit class DescribeSimulationApplicationResponseOps[Self <: DescribeSimulationApplicationResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRenderingEngine(value: RenderingEngine): Self = this.set("renderingEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderingEngine: Self = this.set("renderingEngine", js.undefined)
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = this.set("robotSoftwareSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobotSoftwareSuite: Self = this.set("robotSoftwareSuite", js.undefined)
    @scala.inline
    def setSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = this.set("simulationSoftwareSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulationSoftwareSuite: Self = this.set("simulationSoftwareSuite", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: Sources): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

