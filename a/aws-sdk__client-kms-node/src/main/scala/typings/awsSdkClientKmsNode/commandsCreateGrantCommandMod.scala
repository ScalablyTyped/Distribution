package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput
import typings.awsSdkClientKmsNode.typesCreateGrantOutputMod.CreateGrantOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateGrantCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/CreateGrantCommand", "CreateGrantCommand")
  @js.native
  open class CreateGrantCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateGrantInput, 
          OutputTypesUnion, 
          CreateGrantOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CreateGrantInput) = this()
    
    /* CompleteClass */
    override val input: CreateGrantInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateGrantInput, CreateGrantOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
  }
}
