package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsLambdaFunctionDeadLetterConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[NonEmptyString] = js.native
}
object AwsLambdaFunctionDeadLetterConfig {
  
  @scala.inline
  def apply(): AwsLambdaFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDeadLetterConfig]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionDeadLetterConfigMutableBuilder[Self <: AwsLambdaFunctionDeadLetterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetArn(value: NonEmptyString): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
