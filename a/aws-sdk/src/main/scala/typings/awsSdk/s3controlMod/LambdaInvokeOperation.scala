package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaInvokeOperation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke for each object in the manifest.
    */
  var FunctionArn: js.UndefOr[FunctionArnString] = js.undefined
}
object LambdaInvokeOperation {
  
  @scala.inline
  def apply(): LambdaInvokeOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaInvokeOperation]
  }
  
  @scala.inline
  implicit class LambdaInvokeOperationMutableBuilder[Self <: LambdaInvokeOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArn(value: FunctionArnString): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
  }
}
