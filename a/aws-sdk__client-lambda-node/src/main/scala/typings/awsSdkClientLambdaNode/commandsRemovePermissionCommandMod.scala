package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput
import typings.awsSdkClientLambdaNode.typesRemovePermissionOutputMod.RemovePermissionOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRemovePermissionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/RemovePermissionCommand", "RemovePermissionCommand")
  @js.native
  open class RemovePermissionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RemovePermissionInput, 
          OutputTypesUnion, 
          RemovePermissionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: RemovePermissionInput) = this()
    
    /* CompleteClass */
    override val input: RemovePermissionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RemovePermissionInput, RemovePermissionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
  }
}
