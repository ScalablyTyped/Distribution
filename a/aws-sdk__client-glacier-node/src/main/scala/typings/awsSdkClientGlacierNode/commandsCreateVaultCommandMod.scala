package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
import typings.awsSdkClientGlacierNode.typesCreateVaultOutputMod.CreateVaultOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/CreateVaultCommand", "CreateVaultCommand")
  @js.native
  open class CreateVaultCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateVaultInput, 
          OutputTypesUnion, 
          CreateVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: CreateVaultInput) = this()
    
    /* CompleteClass */
    override val input: CreateVaultInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateVaultInput, CreateVaultOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[CreateVaultInput, CreateVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[CreateVaultInput, CreateVaultOutput] = js.native
  }
}
