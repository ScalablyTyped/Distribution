package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionTracingConfig extends StObject {
  
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsLambdaFunctionTracingConfig {
  
  @scala.inline
  def apply(): AwsLambdaFunctionTracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionTracingConfig]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionTracingConfigMutableBuilder[Self <: AwsLambdaFunctionTracingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: NonEmptyString): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
