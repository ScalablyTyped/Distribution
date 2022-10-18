package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typings.awsSdkClientXrayNode.typesCreateSamplingRuleOutputMod.CreateSamplingRuleOutput
import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateSamplingRuleCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/CreateSamplingRuleCommand", "CreateSamplingRuleCommand")
  @js.native
  open class CreateSamplingRuleCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateSamplingRuleInput, 
          OutputTypesUnion, 
          CreateSamplingRuleOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: CreateSamplingRuleInput) = this()
    
    /* CompleteClass */
    override val input: CreateSamplingRuleInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
  }
}
