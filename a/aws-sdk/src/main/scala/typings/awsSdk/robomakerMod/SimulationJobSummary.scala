package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The names of the data sources.
    */
  var dataSourceNames: js.UndefOr[DataSourceNames] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  
  /**
    * The name of the simulation job.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * A list of simulation job robot application names.
    */
  var robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.undefined
  
  /**
    * A list of simulation job simulation application names.
    */
  var simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.undefined
  
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.undefined
}
object SimulationJobSummary {
  
  @scala.inline
  def apply(): SimulationJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationJobSummary]
  }
  
  @scala.inline
  implicit class SimulationJobSummaryMutableBuilder[Self <: SimulationJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDataSourceNames(value: DataSourceNames): Self = StObject.set(x, "dataSourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceNamesUndefined: Self = StObject.set(x, "dataSourceNames", js.undefined)
    
    @scala.inline
    def setDataSourceNamesVarargs(value: Name*): Self = StObject.set(x, "dataSourceNames", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRobotApplicationNames(value: RobotApplicationNames): Self = StObject.set(x, "robotApplicationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotApplicationNamesUndefined: Self = StObject.set(x, "robotApplicationNames", js.undefined)
    
    @scala.inline
    def setRobotApplicationNamesVarargs(value: Name*): Self = StObject.set(x, "robotApplicationNames", js.Array(value :_*))
    
    @scala.inline
    def setSimulationApplicationNames(value: SimulationApplicationNames): Self = StObject.set(x, "simulationApplicationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationApplicationNamesUndefined: Self = StObject.set(x, "simulationApplicationNames", js.undefined)
    
    @scala.inline
    def setSimulationApplicationNamesVarargs(value: Name*): Self = StObject.set(x, "simulationApplicationNames", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: SimulationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
