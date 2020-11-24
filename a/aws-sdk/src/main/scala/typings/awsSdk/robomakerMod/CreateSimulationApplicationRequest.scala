package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSimulationApplicationRequest extends js.Object {
  
  /**
    * The name of the simulation application.
    */
  var name: Name = js.native
  
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.native
  
  /**
    * The robot software suite (ROS distribution) used by the simulation application.
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
  
  /**
    * A map that contains tag keys and tag values that are attached to the simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateSimulationApplicationRequest {
  
  @scala.inline
  def apply(
    name: Name,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite,
    sources: SourceConfigs
  ): CreateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], simulationSoftwareSuite = simulationSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationRequest]
  }
  
  @scala.inline
  implicit class CreateSimulationApplicationRequestOps[Self <: CreateSimulationApplicationRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = this.set("robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = this.set("simulationSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: SourceConfig*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: SourceConfigs): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingEngine(value: RenderingEngine): Self = this.set("renderingEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingEngine: Self = this.set("renderingEngine", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
