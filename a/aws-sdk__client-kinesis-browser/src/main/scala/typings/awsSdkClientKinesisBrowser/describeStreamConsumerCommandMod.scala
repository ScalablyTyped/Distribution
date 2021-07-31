package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput
import typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod.DescribeStreamConsumerOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeStreamConsumerCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamConsumerCommand", "DescribeStreamConsumerCommand")
  @js.native
  class DescribeStreamConsumerCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeStreamConsumerInput, 
          OutputTypesUnion, 
          DescribeStreamConsumerOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DescribeStreamConsumerInput) = this()
    
    /* CompleteClass */
    override val input: DescribeStreamConsumerInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
  }
}
