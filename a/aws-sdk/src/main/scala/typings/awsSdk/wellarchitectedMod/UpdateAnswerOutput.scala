package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnswerOutput extends StObject {
  
  var Answer: js.UndefOr[typings.awsSdk.wellarchitectedMod.Answer] = js.undefined
  
  var LensAlias: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensArn] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
}
object UpdateAnswerOutput {
  
  inline def apply(): UpdateAnswerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAnswerOutput]
  }
  
  extension [Self <: UpdateAnswerOutput](x: Self) {
    
    inline def setAnswer(value: Answer): Self = StObject.set(x, "Answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "Answer", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
