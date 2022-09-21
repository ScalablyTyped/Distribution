package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput
import typings.awsSdkClientLambdaNode.typesAddPermissionOutputMod.AddPermissionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addPermissionCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/AddPermissionCommand", "AddPermissionCommand")
  @js.native
  open class AddPermissionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          AddPermissionInput, 
          OutputTypesUnion, 
          AddPermissionOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: AddPermissionInput) = this()
    
    /* CompleteClass */
    override val input: AddPermissionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[AddPermissionInput, AddPermissionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
  }
}
