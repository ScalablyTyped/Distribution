package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulationApplicationSummary extends StObject {
  
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
    * Information about a robot software suite (ROS distribution).
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
  def apply(): SimulationApplicationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationApplicationSummary]
  }
  
  @scala.inline
  implicit class SimulationApplicationSummaryMutableBuilder[Self <: SimulationApplicationSummary] (val x: Self) extends AnyVal {
    
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
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotSoftwareSuiteUndefined: Self = StObject.set(x, "robotSoftwareSuite", js.undefined)
    
    @scala.inline
    def setSimulationSoftwareSuite(value: SimulationSoftwareSuite): Self = StObject.set(x, "simulationSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationSoftwareSuiteUndefined: Self = StObject.set(x, "simulationSoftwareSuite", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
