package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput
import typings.awsSdkClientKmsBrowser.typesListAliasesOutputMod.ListAliasesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAliasesCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ListAliasesCommand", "ListAliasesCommand")
  @js.native
  class ListAliasesCommand protected () extends Command[
          InputTypesUnion, 
          ListAliasesInput, 
          OutputTypesUnion, 
          ListAliasesOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListAliasesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListAliasesInput, ListAliasesOutput] = js.native
  }
}
