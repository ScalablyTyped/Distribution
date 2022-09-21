package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeLimitsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeLimitsCommand", "DescribeLimitsCommand")
  @js.native
  open class DescribeLimitsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  }
}
