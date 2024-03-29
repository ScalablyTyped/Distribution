package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typings.awsSdkClientXrayNode.typesUpdateSamplingRuleOutputMod.UpdateSamplingRuleOutput
import typings.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateSamplingRuleCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/UpdateSamplingRuleCommand", "UpdateSamplingRuleCommand")
  @js.native
  open class UpdateSamplingRuleCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateSamplingRuleInput, 
          OutputTypesUnion, 
          UpdateSamplingRuleOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: UpdateSamplingRuleInput) = this()
    
    /* CompleteClass */
    override val input: UpdateSamplingRuleInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
  }
}
