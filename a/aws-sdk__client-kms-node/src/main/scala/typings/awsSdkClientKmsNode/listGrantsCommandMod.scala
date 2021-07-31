package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput
import typings.awsSdkClientKmsNode.typesListGrantsOutputMod.ListGrantsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGrantsCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ListGrantsCommand", "ListGrantsCommand")
  @js.native
  class ListGrantsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListGrantsInput, 
          OutputTypesUnion, 
          ListGrantsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListGrantsInput) = this()
    
    /* CompleteClass */
    override val input: ListGrantsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListGrantsInput, ListGrantsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
  }
}
