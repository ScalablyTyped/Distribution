package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobTemplateRequest extends StObject {
  
  /**
    * The unique identifier of the job template to delete.
    */
  var jobTemplateId: JobTemplateId
}
object DeleteJobTemplateRequest {
  
  inline def apply(jobTemplateId: JobTemplateId): DeleteJobTemplateRequest = {
    val __obj = js.Dynamic.literal(jobTemplateId = jobTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobTemplateRequest]
  }
  
  extension [Self <: DeleteJobTemplateRequest](x: Self) {
    
    inline def setJobTemplateId(value: JobTemplateId): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
  }
}
