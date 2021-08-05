package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrialRequest extends StObject {
  
  /**
    * The name of the trial to delete.
    */
  var TrialName: ExperimentEntityName
}
object DeleteTrialRequest {
  
  inline def apply(TrialName: ExperimentEntityName): DeleteTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrialRequest]
  }
  
  extension [Self <: DeleteTrialRequest](x: Self) {
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
