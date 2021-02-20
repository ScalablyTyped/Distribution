package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaFunctionSucceededEventDetails extends StObject {
  
  /**
    * The JSON data output by the lambda function. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var output: js.UndefOr[SensitiveData] = js.native
  
  /**
    * Contains details about the output of an execution history event.
    */
  var outputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.native
}
object LambdaFunctionSucceededEventDetails {
  
  @scala.inline
  def apply(): LambdaFunctionSucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionSucceededEventDetails]
  }
  
  @scala.inline
  implicit class LambdaFunctionSucceededEventDetailsMutableBuilder[Self <: LambdaFunctionSucceededEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: SensitiveData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "outputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDetailsUndefined: Self = StObject.set(x, "outputDetails", js.undefined)
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
