package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSimulationApplicationRequest extends StObject {
  
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
  implicit class CreateSimulationApplicationRequestMutableBuilder[Self <: CreateSimulationApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingEngine(value: RenderingEngine): Self = StObject.set(x, "renderingEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingEngineUndefined: Self = StObject.set(x, "renderingEngine", js.undefined)
    
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = StObject.set(x, "simulationSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: SourceConfigs): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: SourceConfig*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
