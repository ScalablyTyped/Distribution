package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
import typings.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsOutputMod.DescribeContinuousBackupsOutput
import typings.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeContinuousBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
  @js.native
  open class DescribeContinuousBackupsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeContinuousBackupsInput, 
          OutputTypesUnion, 
          DescribeContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: DescribeContinuousBackupsInput) = this()
    
    /* CompleteClass */
    override val input: DescribeContinuousBackupsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
  }
}
