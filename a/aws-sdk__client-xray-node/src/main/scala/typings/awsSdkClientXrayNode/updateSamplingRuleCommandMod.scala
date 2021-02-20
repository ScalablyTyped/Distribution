package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleOutputMod.UpdateSamplingRuleOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateSamplingRuleCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/UpdateSamplingRuleCommand", "UpdateSamplingRuleCommand")
  @js.native
  class UpdateSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          UpdateSamplingRuleInput, 
          OutputTypesUnion, 
          UpdateSamplingRuleOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: UpdateSamplingRuleInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
  }
}
