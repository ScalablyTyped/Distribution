package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaCodeHook extends StObject {
  
  /**
    * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
    */
  var codeHookInterfaceVersion: CodeHookInterfaceVersion
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var lambdaARN: LambdaARN
}
object LambdaCodeHook {
  
  inline def apply(codeHookInterfaceVersion: CodeHookInterfaceVersion, lambdaARN: LambdaARN): LambdaCodeHook = {
    val __obj = js.Dynamic.literal(codeHookInterfaceVersion = codeHookInterfaceVersion.asInstanceOf[js.Any], lambdaARN = lambdaARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaCodeHook]
  }
  
  extension [Self <: LambdaCodeHook](x: Self) {
    
    inline def setCodeHookInterfaceVersion(value: CodeHookInterfaceVersion): Self = StObject.set(x, "codeHookInterfaceVersion", value.asInstanceOf[js.Any])
    
    inline def setLambdaARN(value: LambdaARN): Self = StObject.set(x, "lambdaARN", value.asInstanceOf[js.Any])
  }
}
