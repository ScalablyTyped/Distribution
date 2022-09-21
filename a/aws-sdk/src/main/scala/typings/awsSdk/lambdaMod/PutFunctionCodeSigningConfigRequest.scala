package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFunctionCodeSigningConfigRequest extends StObject {
  
  /**
    * The The Amazon Resource Name (ARN) of the code signing configuration.
    */
  var CodeSigningConfigArn: typings.awsSdk.lambdaMod.CodeSigningConfigArn
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName
}
object PutFunctionCodeSigningConfigRequest {
  
  inline def apply(CodeSigningConfigArn: CodeSigningConfigArn, FunctionName: FunctionName): PutFunctionCodeSigningConfigRequest = {
    val __obj = js.Dynamic.literal(CodeSigningConfigArn = CodeSigningConfigArn.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFunctionCodeSigningConfigRequest]
  }
  
  extension [Self <: PutFunctionCodeSigningConfigRequest](x: Self) {
    
    inline def setCodeSigningConfigArn(value: CodeSigningConfigArn): Self = StObject.set(x, "CodeSigningConfigArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
