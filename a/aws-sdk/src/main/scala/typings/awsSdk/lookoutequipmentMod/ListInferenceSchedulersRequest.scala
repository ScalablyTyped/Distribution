package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceSchedulersRequest extends StObject {
  
  /**
    * The beginning of the name of the inference schedulers to be listed. 
    */
  var InferenceSchedulerNameBeginsWith: js.UndefOr[InferenceSchedulerIdentifier] = js.undefined
  
  /**
    *  Specifies the maximum number of inference schedulers to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.lookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    * The name of the ML model used by the inference scheduler to be listed. 
    */
  var ModelName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelName] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of inference schedulers. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.lookoutequipmentMod.NextToken] = js.undefined
}
object ListInferenceSchedulersRequest {
  
  inline def apply(): ListInferenceSchedulersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInferenceSchedulersRequest]
  }
  
  extension [Self <: ListInferenceSchedulersRequest](x: Self) {
    
    inline def setInferenceSchedulerNameBeginsWith(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerNameBeginsWith", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerNameBeginsWithUndefined: Self = StObject.set(x, "InferenceSchedulerNameBeginsWith", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
