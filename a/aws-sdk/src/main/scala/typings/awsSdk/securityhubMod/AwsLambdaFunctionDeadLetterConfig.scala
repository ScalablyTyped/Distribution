package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionDeadLetterConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsLambdaFunctionDeadLetterConfig {
  
  inline def apply(): AwsLambdaFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDeadLetterConfig]
  }
  
  extension [Self <: AwsLambdaFunctionDeadLetterConfig](x: Self) {
    
    inline def setTargetArn(value: NonEmptyString): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
