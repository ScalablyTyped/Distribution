package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
import typings.awsSdkClientGlacierNode.typesListVaultsOutputMod.ListVaultsOutput
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListVaultsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListVaultsCommand", "ListVaultsCommand")
  @js.native
  open class ListVaultsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListVaultsInput, 
          OutputTypesUnion, 
          ListVaultsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListVaultsInput) = this()
    
    /* CompleteClass */
    override val input: ListVaultsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListVaultsInput, ListVaultsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[ListVaultsInput, ListVaultsOutput] = js.native
  }
}
