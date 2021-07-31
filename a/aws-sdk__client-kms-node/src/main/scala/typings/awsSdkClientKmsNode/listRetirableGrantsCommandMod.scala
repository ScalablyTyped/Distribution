package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typings.awsSdkClientKmsNode.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listRetirableGrantsCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ListRetirableGrantsCommand", "ListRetirableGrantsCommand")
  @js.native
  class ListRetirableGrantsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListRetirableGrantsInput, 
          OutputTypesUnion, 
          ListRetirableGrantsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListRetirableGrantsInput) = this()
    
    /* CompleteClass */
    override val input: ListRetirableGrantsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  }
}
