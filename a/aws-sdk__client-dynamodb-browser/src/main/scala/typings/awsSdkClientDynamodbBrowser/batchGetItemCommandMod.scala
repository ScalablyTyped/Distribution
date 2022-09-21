package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput
import typings.awsSdkClientDynamodbBrowser.typesBatchGetItemOutputMod.BatchGetItemOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchGetItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/BatchGetItemCommand", "BatchGetItemCommand")
  @js.native
  open class BatchGetItemCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          BatchGetItemInput, 
          OutputTypesUnion, 
          BatchGetItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: BatchGetItemInput) = this()
    
    /* CompleteClass */
    override val input: BatchGetItemInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[BatchGetItemInput, BatchGetItemOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
  }
}
