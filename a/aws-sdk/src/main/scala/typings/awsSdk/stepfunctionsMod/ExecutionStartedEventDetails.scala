package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionStartedEventDetails extends StObject {
  
  /**
    * The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  
  /**
    * Contains details about the input for an execution history event.
    */
  var inputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
    */
  var roleArn: js.UndefOr[Arn] = js.native
}
object ExecutionStartedEventDetails {
  
  @scala.inline
  def apply(): ExecutionStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStartedEventDetails]
  }
  
  @scala.inline
  implicit class ExecutionStartedEventDetailsMutableBuilder[Self <: ExecutionStartedEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: SensitiveData): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "inputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDetailsUndefined: Self = StObject.set(x, "inputDetails", js.undefined)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
