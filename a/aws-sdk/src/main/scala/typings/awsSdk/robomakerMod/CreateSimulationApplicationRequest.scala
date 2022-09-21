package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSimulationApplicationRequest extends StObject {
  
  /**
    * The object that contains the Docker image URI used to create your simulation application.
    */
  var environment: js.UndefOr[Environment] = js.undefined
  
  /**
    * The name of the simulation application.
    */
  var name: Name
  
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
  
  /**
    * The robot software suite (ROS distribution) used by the simulation application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite
  
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: SimulationSoftwareSuite
  
  /**
    * The sources of the simulation application.
    */
  var sources: js.UndefOr[SourceConfigs] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSimulationApplicationRequest {
  
  inline def apply(
    name: Name,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite
  ): CreateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], simulationSoftwareSuite = simulationSoftwareSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationRequest]
  }
  
  extension [Self <: CreateSimulationApplicationRequest](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRenderingEngine(value: RenderingEngine): Self = StObject.set(x, "renderingEngine", value.asInstanceOf[js.Any])
    
    inline def setRenderingEngineUndefined: Self = StObject.set(x, "renderingEngine", js.undefined)
    
    inline def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    inline def setSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = StObject.set(x, "simulationSoftwareSuite", value.asInstanceOf[js.Any])
    
    inline def setSources(value: SourceConfigs): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SourceConfig*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
