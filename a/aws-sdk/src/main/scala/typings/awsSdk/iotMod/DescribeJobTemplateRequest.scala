package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobTemplateRequest extends StObject {
  
  /**
    * The unique identifier of the job template.
    */
  var jobTemplateId: JobTemplateId
}
object DescribeJobTemplateRequest {
  
  inline def apply(jobTemplateId: JobTemplateId): DescribeJobTemplateRequest = {
    val __obj = js.Dynamic.literal(jobTemplateId = jobTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobTemplateRequest]
  }
  
  extension [Self <: DescribeJobTemplateRequest](x: Self) {
    
    inline def setJobTemplateId(value: JobTemplateId): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
  }
}
