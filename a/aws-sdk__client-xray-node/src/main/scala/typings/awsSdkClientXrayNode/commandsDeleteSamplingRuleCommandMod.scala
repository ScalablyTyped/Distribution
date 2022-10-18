package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typings.awsSdkClientXrayNode.typesDeleteSamplingRuleOutputMod.DeleteSamplingRuleOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteSamplingRuleCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/DeleteSamplingRuleCommand", "DeleteSamplingRuleCommand")
  @js.native
  open class DeleteSamplingRuleCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteSamplingRuleInput, 
          OutputTypesUnion, 
          DeleteSamplingRuleOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: DeleteSamplingRuleInput) = this()
    
    /* CompleteClass */
    override val input: DeleteSamplingRuleInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
  }
}
