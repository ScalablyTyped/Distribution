package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput
import typings.awsSdkClientGlacierNode.typesListPartsOutputMod.ListPartsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listPartsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListPartsCommand", "ListPartsCommand")
  @js.native
  open class ListPartsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListPartsInput, 
          OutputTypesUnion, 
          ListPartsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListPartsInput) = this()
    
    /* CompleteClass */
    override val input: ListPartsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListPartsInput, ListPartsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListPartsInput, ListPartsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[ListPartsInput, ListPartsOutput] = js.native
  }
}
