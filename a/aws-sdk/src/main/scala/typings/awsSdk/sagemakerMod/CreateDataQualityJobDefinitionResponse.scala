package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataQualityJobDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the job definition.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
}
object CreateDataQualityJobDefinitionResponse {
  
  inline def apply(JobDefinitionArn: MonitoringJobDefinitionArn): CreateDataQualityJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataQualityJobDefinitionResponse]
  }
  
  extension [Self <: CreateDataQualityJobDefinitionResponse](x: Self) {
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
  }
}
