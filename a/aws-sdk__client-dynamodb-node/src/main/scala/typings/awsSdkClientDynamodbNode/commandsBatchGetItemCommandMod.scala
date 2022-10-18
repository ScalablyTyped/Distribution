package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
import typings.awsSdkClientDynamodbNode.typesBatchGetItemOutputMod.BatchGetItemOutput
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsBatchGetItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/BatchGetItemCommand", "BatchGetItemCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
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
