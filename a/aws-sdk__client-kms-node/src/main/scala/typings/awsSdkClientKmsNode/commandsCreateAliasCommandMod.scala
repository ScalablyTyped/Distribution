package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
import typings.awsSdkClientKmsNode.typesCreateAliasOutputMod.CreateAliasOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateAliasCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/CreateAliasCommand", "CreateAliasCommand")
  @js.native
  open class CreateAliasCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  }
}
