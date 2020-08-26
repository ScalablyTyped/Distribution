package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The names of the data sources.
    */
  var dataSourceNames: js.UndefOr[DataSourceNames] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The name of the simulation job.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * A list of simulation job robot application names.
    */
  var robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.native
  /**
    * A list of simulation job simulation application names.
    */
  var simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.native
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.native
}

object SimulationJobSummary {
  @scala.inline
  def apply(): SimulationJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationJobSummary]
  }
  @scala.inline
  implicit class SimulationJobSummaryOps[Self <: SimulationJobSummary] (val x: Self) extends AnyVal {
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
    def setDataSourceNamesVarargs(value: Name*): Self = this.set("dataSourceNames", js.Array(value :_*))
    @scala.inline
    def setDataSourceNames(value: DataSourceNames): Self = this.set("dataSourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceNames: Self = this.set("dataSourceNames", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRobotApplicationNamesVarargs(value: Name*): Self = this.set("robotApplicationNames", js.Array(value :_*))
    @scala.inline
    def setRobotApplicationNames(value: RobotApplicationNames): Self = this.set("robotApplicationNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobotApplicationNames: Self = this.set("robotApplicationNames", js.undefined)
    @scala.inline
    def setSimulationApplicationNamesVarargs(value: Name*): Self = this.set("simulationApplicationNames", js.Array(value :_*))
    @scala.inline
    def setSimulationApplicationNames(value: SimulationApplicationNames): Self = this.set("simulationApplicationNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulationApplicationNames: Self = this.set("simulationApplicationNames", js.undefined)
    @scala.inline
    def setStatus(value: SimulationJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

