package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typings.awsSdkClientDynamodbNode.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeEndpointsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeEndpointsCommand", "DescribeEndpointsCommand")
  @js.native
  open class DescribeEndpointsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeEndpointsInput, 
          OutputTypesUnion, 
          DescribeEndpointsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeEndpointsInput) = this()
    
    /* CompleteClass */
    override val input: DescribeEndpointsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  }
}
