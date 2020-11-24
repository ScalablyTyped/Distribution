package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput
import typings.awsSdkClientKmsBrowser.typesCreateGrantOutputMod.CreateGrantOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/commands/CreateGrantCommand", JSImport.Namespace)
@js.native
object createGrantCommandMod extends js.Object {
  
  @js.native
  class CreateGrantCommand protected () extends Command[
          InputTypesUnion, 
          CreateGrantInput, 
          OutputTypesUnion, 
          CreateGrantOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CreateGrantInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
  }
}
