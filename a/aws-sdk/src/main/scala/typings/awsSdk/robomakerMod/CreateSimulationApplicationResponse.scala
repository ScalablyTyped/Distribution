package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSimulationApplicationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation application.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  
  /**
    * The name of the simulation application.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
  
  /**
    * The revision id of the simulation application.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * Information about the robot software suite (ROS distribution).
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
  
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined
  
  /**
    * The sources of the simulation application.
    */
  var sources: js.UndefOr[Sources] = js.undefined
  
  /**
    * The list of all tags added to the simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The version of the simulation application.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object CreateSimulationApplicationResponse {
  
  @scala.inline
  def apply(): CreateSimulationApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSimulationApplicationResponse]
  }
  
  @scala.inline
  implicit class CreateSimulationApplicationResponseMutableBuilder[Self <: CreateSimulationApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRenderingEngine(value: RenderingEngine): Self = StObject.set(x, "renderingEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingEngineUndefined: Self = StObject.set(x, "renderingEngine", js.undefined)
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotSoftwareSuiteUndefined: Self = StObject.set(x, "robotSoftwareSuite", js.undefined)
    
    @scala.inline
    def setSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = StObject.set(x, "simulationSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationSoftwareSuiteUndefined: Self = StObject.set(x, "simulationSoftwareSuite", js.undefined)
    
    @scala.inline
    def setSources(value: Sources): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
