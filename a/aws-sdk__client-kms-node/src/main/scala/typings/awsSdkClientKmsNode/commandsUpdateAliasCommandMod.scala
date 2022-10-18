package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput
import typings.awsSdkClientKmsNode.typesUpdateAliasOutputMod.UpdateAliasOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateAliasCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/UpdateAliasCommand", "UpdateAliasCommand")
  @js.native
  open class UpdateAliasCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateAliasInput, 
          OutputTypesUnion, 
          UpdateAliasOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: UpdateAliasInput) = this()
    
    /* CompleteClass */
    override val input: UpdateAliasInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateAliasInput, UpdateAliasOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
  }
}
