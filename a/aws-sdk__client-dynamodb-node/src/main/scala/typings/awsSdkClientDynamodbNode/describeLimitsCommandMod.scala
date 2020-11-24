package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput
import typings.awsSdkClientDynamodbNode.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeLimitsCommand", JSImport.Namespace)
@js.native
object describeLimitsCommandMod extends js.Object {
  
  @js.native
  class DescribeLimitsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeLimitsInput, 
          OutputTypesUnion, 
          DescribeLimitsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeLimitsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  }
}
