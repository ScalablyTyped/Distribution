package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
import typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deregisterStreamConsumerCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DeregisterStreamConsumerCommand", "DeregisterStreamConsumerCommand")
  @js.native
  class DeregisterStreamConsumerCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeregisterStreamConsumerInput, 
          OutputTypesUnion, 
          DeregisterStreamConsumerOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DeregisterStreamConsumerInput) = this()
    
    /* CompleteClass */
    override val input: DeregisterStreamConsumerInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
  }
}
