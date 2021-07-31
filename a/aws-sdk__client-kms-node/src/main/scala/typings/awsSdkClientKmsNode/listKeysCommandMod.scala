package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput
import typings.awsSdkClientKmsNode.typesListKeysOutputMod.ListKeysOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listKeysCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/ListKeysCommand", "ListKeysCommand")
  @js.native
  class ListKeysCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListKeysInput, 
          OutputTypesUnion, 
          ListKeysOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListKeysInput) = this()
    
    /* CompleteClass */
    override val input: ListKeysInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListKeysInput, ListKeysOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeysInput, ListKeysOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[ListKeysInput, ListKeysOutput] = js.native
  }
}
