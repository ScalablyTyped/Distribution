package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
import typings.awsSdkClientGlacierNode.typesListJobsOutputMod.ListJobsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listJobsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListJobsCommand", "ListJobsCommand")
  @js.native
  class ListJobsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListJobsInput, 
          OutputTypesUnion, 
          ListJobsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListJobsInput) = this()
    
    /* CompleteClass */
    override val input: ListJobsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListJobsInput, ListJobsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
  }
}
