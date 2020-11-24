package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
import typings.awsSdkClientGlacierNode.typesInitiateJobOutputMod.InitiateJobOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateJobCommand", JSImport.Namespace)
@js.native
object initiateJobCommandMod extends js.Object {
  
  @js.native
  class InitiateJobCommand protected () extends Command[
          InputTypesUnion, 
          InitiateJobInput, 
          OutputTypesUnion, 
          InitiateJobOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: InitiateJobInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateJobInput, InitiateJobOutput] = js.native
  }
}
