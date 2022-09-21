package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput
import typings.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removePermissionCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/RemovePermissionCommand", "RemovePermissionCommand")
  @js.native
  open class RemovePermissionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RemovePermissionInput, 
          OutputTypesUnion, 
          RemovePermissionOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: RemovePermissionInput) = this()
    
    /* CompleteClass */
    override val input: RemovePermissionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RemovePermissionInput, RemovePermissionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
  }
}
