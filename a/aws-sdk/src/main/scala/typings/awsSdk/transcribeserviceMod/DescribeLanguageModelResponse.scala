package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLanguageModelResponse extends StObject {
  
  /**
    * Provides information about the specified custom language model. This parameter also shows if the base language model you used to create your custom language model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the updated base model. If you tried to create a new custom language model and the request wasn't successful, you can use this DescribeLanguageModel to help identify the reason for this failure.
    */
  var LanguageModel: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageModel] = js.undefined
}
object DescribeLanguageModelResponse {
  
  inline def apply(): DescribeLanguageModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLanguageModelResponse]
  }
  
  extension [Self <: DescribeLanguageModelResponse](x: Self) {
    
    inline def setLanguageModel(value: LanguageModel): Self = StObject.set(x, "LanguageModel", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelUndefined: Self = StObject.set(x, "LanguageModel", js.undefined)
  }
}
