package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput
import typings.awsSdkClientKmsNode.typesListResourceTagsOutputMod.ListResourceTagsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listResourceTagsCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ListResourceTagsCommand", "ListResourceTagsCommand")
  @js.native
  open class ListResourceTagsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListResourceTagsInput, 
          OutputTypesUnion, 
          ListResourceTagsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListResourceTagsInput) = this()
    
    /* CompleteClass */
    override val input: ListResourceTagsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListResourceTagsInput, ListResourceTagsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
  }
}
