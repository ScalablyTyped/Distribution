package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelBiasJobDefinitionRequest extends StObject {
  
  /**
    * The name of the model bias job definition. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
}
object DescribeModelBiasJobDefinitionRequest {
  
  inline def apply(JobDefinitionName: MonitoringJobDefinitionName): DescribeModelBiasJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelBiasJobDefinitionRequest]
  }
  
  extension [Self <: DescribeModelBiasJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
  }
}
