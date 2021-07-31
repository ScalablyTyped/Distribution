package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowLogsConfigurationResult extends StObject {
  
  /**
    * Denotes whether VPC flow logs is enabled as a data source.
    */
  var Status: DataSourceStatus
}
object FlowLogsConfigurationResult {
  
  @scala.inline
  def apply(Status: DataSourceStatus): FlowLogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLogsConfigurationResult]
  }
  
  @scala.inline
  implicit class FlowLogsConfigurationResultMutableBuilder[Self <: FlowLogsConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
