package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput
import typings.awsSdkClientDynamodbNode.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeLimitsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeLimitsCommand", "DescribeLimitsCommand")
  @js.native
  class DescribeLimitsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeLimitsInput, 
          OutputTypesUnion, 
          DescribeLimitsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeLimitsInput) = this()
    
    /* CompleteClass */
    override val input: DescribeLimitsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeLimitsInput, DescribeLimitsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: js.Any
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  }
}
