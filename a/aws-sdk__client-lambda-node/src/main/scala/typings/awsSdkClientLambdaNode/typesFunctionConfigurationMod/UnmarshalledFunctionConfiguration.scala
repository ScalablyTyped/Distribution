package typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod

import typings.awsSdkClientLambdaNode.typesDeadLetterConfigMod.UnmarshalledDeadLetterConfig
import typings.awsSdkClientLambdaNode.typesEnvironmentResponseMod.UnmarshalledEnvironmentResponse
import typings.awsSdkClientLambdaNode.typesTracingConfigResponseMod.UnmarshalledTracingConfigResponse
import typings.awsSdkClientLambdaNode.typesVpcConfigResponseMod.UnmarshalledVpcConfigResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledFunctionConfiguration extends FunctionConfiguration {
  /**
    * <p>The function's dead letter queue.</p>
    */
  @JSName("DeadLetterConfig")
  var DeadLetterConfig_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledDeadLetterConfig] = js.native
  /**
    * <p>The function's environment variables.</p>
    */
  @JSName("Environment")
  var Environment_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledEnvironmentResponse] = js.native
  /**
    * <p>The function's AWS X-Ray tracing configuration.</p>
    */
  @JSName("TracingConfig")
  var TracingConfig_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledTracingConfigResponse] = js.native
  /**
    * <p>The function's networking configuration.</p>
    */
  @JSName("VpcConfig")
  var VpcConfig_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledVpcConfigResponse] = js.native
}

object UnmarshalledFunctionConfiguration {
  @scala.inline
  def apply(): UnmarshalledFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledFunctionConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledFunctionConfigurationOps[Self <: UnmarshalledFunctionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeadLetterConfig(value: UnmarshalledDeadLetterConfig): Self = this.set("DeadLetterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadLetterConfig: Self = this.set("DeadLetterConfig", js.undefined)
    @scala.inline
    def setEnvironment(value: UnmarshalledEnvironmentResponse): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    @scala.inline
    def setTracingConfig(value: UnmarshalledTracingConfigResponse): Self = this.set("TracingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracingConfig: Self = this.set("TracingConfig", js.undefined)
    @scala.inline
    def setVpcConfig(value: UnmarshalledVpcConfigResponse): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

