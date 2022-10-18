package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
import typings.awsSdkClientGlacierNode.typesListJobsOutputMod.ListJobsOutput
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListJobsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListJobsCommand", "ListJobsCommand")
  @js.native
  open class ListJobsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[ListJobsInput, ListJobsOutput] = js.native
  }
}
