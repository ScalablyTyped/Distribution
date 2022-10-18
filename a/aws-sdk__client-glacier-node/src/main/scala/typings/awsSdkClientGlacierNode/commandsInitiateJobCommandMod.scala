package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
import typings.awsSdkClientGlacierNode.typesInitiateJobOutputMod.InitiateJobOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsInitiateJobCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/InitiateJobCommand", "InitiateJobCommand")
  @js.native
  open class InitiateJobCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          InitiateJobInput, 
          OutputTypesUnion, 
          InitiateJobOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: InitiateJobInput) = this()
    
    /* CompleteClass */
    override val input: InitiateJobInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[InitiateJobInput, InitiateJobOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
  }
}
