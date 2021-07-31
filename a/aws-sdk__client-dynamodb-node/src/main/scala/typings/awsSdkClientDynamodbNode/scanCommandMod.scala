package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
import typings.awsSdkClientDynamodbNode.typesScanOutputMod.ScanOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/ScanCommand", "ScanCommand")
  @js.native
  class ScanCommand protected ()
    extends StObject
       with Command[InputTypesUnion, ScanInput, OutputTypesUnion, ScanOutput, DynamoDBResolvedConfiguration] {
    def this(input: ScanInput) = this()
    
    /* CompleteClass */
    override val input: ScanInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ScanInput, ScanOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ScanInput, ScanOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[ScanInput, ScanOutput] = js.native
  }
}
