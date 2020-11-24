package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleOutputMod.DeleteSamplingRuleOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/DeleteSamplingRuleCommand", JSImport.Namespace)
@js.native
object deleteSamplingRuleCommandMod extends js.Object {
  
  @js.native
  class DeleteSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSamplingRuleInput, 
          OutputTypesUnion, 
          DeleteSamplingRuleOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: DeleteSamplingRuleInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
  }
}
