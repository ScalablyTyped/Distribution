package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersInputMod.TestRepositoryTriggersInput
import typings.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod.TestRepositoryTriggersOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testRepositoryTriggersCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/TestRepositoryTriggersCommand", "TestRepositoryTriggersCommand")
  @js.native
  class TestRepositoryTriggersCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          TestRepositoryTriggersInput, 
          OutputTypesUnion, 
          TestRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: TestRepositoryTriggersInput) = this()
    
    /* CompleteClass */
    override val input: TestRepositoryTriggersInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: js.Any
    ): Handler[TestRepositoryTriggersInput, TestRepositoryTriggersOutput] = js.native
  }
}
