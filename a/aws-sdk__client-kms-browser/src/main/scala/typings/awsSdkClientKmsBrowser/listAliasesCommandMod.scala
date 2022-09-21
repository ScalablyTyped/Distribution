package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput
import typings.awsSdkClientKmsBrowser.typesListAliasesOutputMod.ListAliasesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAliasesCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ListAliasesCommand", "ListAliasesCommand")
  @js.native
  open class ListAliasesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListAliasesInput, 
          OutputTypesUnion, 
          ListAliasesOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListAliasesInput) = this()
    
    /* CompleteClass */
    override val input: ListAliasesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListAliasesInput, ListAliasesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
  }
}
