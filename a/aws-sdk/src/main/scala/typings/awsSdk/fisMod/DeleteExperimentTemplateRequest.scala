package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentTemplateRequest extends StObject {
  
  /**
    * The ID of the experiment template.
    */
  var id: ExperimentTemplateId
}
object DeleteExperimentTemplateRequest {
  
  inline def apply(id: ExperimentTemplateId): DeleteExperimentTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentTemplateRequest]
  }
  
  extension [Self <: DeleteExperimentTemplateRequest](x: Self) {
    
    inline def setId(value: ExperimentTemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
