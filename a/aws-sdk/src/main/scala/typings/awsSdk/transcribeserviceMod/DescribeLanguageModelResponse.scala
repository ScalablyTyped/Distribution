package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLanguageModelResponse extends StObject {
  
  /**
    * The name of the custom language model you requested more information about.
    */
  var LanguageModel: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageModel] = js.undefined
}
object DescribeLanguageModelResponse {
  
  @scala.inline
  def apply(): DescribeLanguageModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLanguageModelResponse]
  }
  
  @scala.inline
  implicit class DescribeLanguageModelResponseMutableBuilder[Self <: DescribeLanguageModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageModel(value: LanguageModel): Self = StObject.set(x, "LanguageModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageModelUndefined: Self = StObject.set(x, "LanguageModel", js.undefined)
  }
}
