package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput
import typings.awsSdkClientDynamodbNode.typesBatchWriteItemOutputMod.BatchWriteItemOutput
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsBatchWriteItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/BatchWriteItemCommand", "BatchWriteItemCommand")
  @js.native
  open class BatchWriteItemCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          BatchWriteItemInput, 
          OutputTypesUnion, 
          BatchWriteItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: BatchWriteItemInput) = this()
    
    /* CompleteClass */
    override val input: BatchWriteItemInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[BatchWriteItemInput, BatchWriteItemOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
  }
}
