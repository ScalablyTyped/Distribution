package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
import typings.awsSdkClientLambdaNode.typesListTagsOutputMod.ListTagsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listTagsCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/ListTagsCommand", "ListTagsCommand")
  @js.native
  class ListTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsInput, 
          OutputTypesUnion, 
          ListTagsOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: ListTagsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
  }
}
