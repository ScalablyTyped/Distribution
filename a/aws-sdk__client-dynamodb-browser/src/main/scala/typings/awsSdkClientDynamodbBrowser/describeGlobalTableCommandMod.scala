package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableOutputMod.DescribeGlobalTableOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeGlobalTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeGlobalTableCommand", "DescribeGlobalTableCommand")
  @js.native
  class DescribeGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableInput, 
          OutputTypesUnion, 
          DescribeGlobalTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeGlobalTableInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
  }
}
