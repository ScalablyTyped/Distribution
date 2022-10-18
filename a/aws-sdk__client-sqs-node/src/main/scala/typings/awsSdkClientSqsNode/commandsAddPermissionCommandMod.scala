package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput
import typings.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsAddPermissionCommandMod {
  
  @JSImport("@aws-sdk/client-sqs-node/commands/AddPermissionCommand", "AddPermissionCommand")
  @js.native
  open class AddPermissionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          AddPermissionInput, 
          OutputTypesUnion, 
          AddPermissionOutput, 
          SQSResolvedConfiguration
        ] {
    def this(input: AddPermissionInput) = this()
    
    /* CompleteClass */
    override val input: AddPermissionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[AddPermissionInput, AddPermissionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: SQSResolvedConfiguration
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: SQSResolvedConfiguration,
      options: Any
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
  }
}
