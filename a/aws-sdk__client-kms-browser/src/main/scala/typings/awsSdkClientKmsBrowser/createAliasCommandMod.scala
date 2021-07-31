package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput
import typings.awsSdkClientKmsBrowser.typesCreateAliasOutputMod.CreateAliasOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAliasCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/CreateAliasCommand", "CreateAliasCommand")
  @js.native
  class CreateAliasCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateAliasInput, 
          OutputTypesUnion, 
          CreateAliasOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CreateAliasInput) = this()
    
    /* CompleteClass */
    override val input: CreateAliasInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateAliasInput, CreateAliasOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  }
}
