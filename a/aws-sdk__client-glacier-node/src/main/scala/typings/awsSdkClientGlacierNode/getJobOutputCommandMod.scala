package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
import typings.awsSdkClientGlacierNode.typesGetJobOutputOutputMod.GetJobOutputOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getJobOutputCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/GetJobOutputCommand", "GetJobOutputCommand")
  @js.native
  class GetJobOutputCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetJobOutputInput, 
          OutputTypesUnion, 
          GetJobOutputOutput[Readable], 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetJobOutputInput) = this()
    
    /* CompleteClass */
    override val input: GetJobOutputInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[GetJobOutputInput, GetJobOutputOutput[Readable]] = js.native
  }
}
