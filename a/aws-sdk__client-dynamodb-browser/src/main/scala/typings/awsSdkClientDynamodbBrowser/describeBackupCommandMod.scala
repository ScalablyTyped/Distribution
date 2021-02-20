package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeBackupOutputMod.DescribeBackupOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeBackupCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeBackupCommand", "DescribeBackupCommand")
  @js.native
  class DescribeBackupCommand protected () extends Command[
          InputTypesUnion, 
          DescribeBackupInput, 
          OutputTypesUnion, 
          DescribeBackupOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeBackupInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeBackupInput, DescribeBackupOutput] = js.native
  }
}
