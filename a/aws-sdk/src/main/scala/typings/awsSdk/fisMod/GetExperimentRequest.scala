package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExperimentRequest extends StObject {
  
  /**
    * The ID of the experiment.
    */
  var id: ExperimentId
}
object GetExperimentRequest {
  
  inline def apply(id: ExperimentId): GetExperimentRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExperimentRequest]
  }
  
  extension [Self <: GetExperimentRequest](x: Self) {
    
    inline def setId(value: ExperimentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
