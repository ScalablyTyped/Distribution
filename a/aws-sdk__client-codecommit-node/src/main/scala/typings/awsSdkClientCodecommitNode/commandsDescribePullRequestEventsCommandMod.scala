package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput
import typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribePullRequestEventsCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/DescribePullRequestEventsCommand", "DescribePullRequestEventsCommand")
  @js.native
  open class DescribePullRequestEventsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribePullRequestEventsInput, 
          OutputTypesUnion, 
          DescribePullRequestEventsOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DescribePullRequestEventsInput) = this()
    
    /* CompleteClass */
    override val input: DescribePullRequestEventsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
  }
}
