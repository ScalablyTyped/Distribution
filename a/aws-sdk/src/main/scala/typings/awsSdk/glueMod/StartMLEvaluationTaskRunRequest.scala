package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMLEvaluationTaskRunRequest extends StObject {
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}
object StartMLEvaluationTaskRunRequest {
  
  inline def apply(TransformId: HashString): StartMLEvaluationTaskRunRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMLEvaluationTaskRunRequest]
  }
  
  extension [Self <: StartMLEvaluationTaskRunRequest](x: Self) {
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
