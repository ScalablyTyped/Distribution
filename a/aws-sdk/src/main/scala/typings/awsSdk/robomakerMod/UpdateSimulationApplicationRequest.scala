package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSimulationApplicationRequest extends StObject {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn
  
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
  
  /**
    * Information about the robot software suite (ROS distribution).
    */
  var robotSoftwareSuite: RobotSoftwareSuite
  
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: SimulationSoftwareSuite
  
  /**
    * The sources of the simulation application.
    */
  var sources: SourceConfigs
}
object UpdateSimulationApplicationRequest {
  
  @scala.inline
  def apply(
    application: Arn,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite,
    sources: SourceConfigs
  ): UpdateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], simulationSoftwareSuite = simulationSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSimulationApplicationRequest]
  }
  
  @scala.inline
  implicit class UpdateSimulationApplicationRequestMutableBuilder[Self <: UpdateSimulationApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionId(value: RevisionId): Self = StObject.set(x, "currentRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionIdUndefined: Self = StObject.set(x, "currentRevisionId", js.undefined)
    
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
  }
}
