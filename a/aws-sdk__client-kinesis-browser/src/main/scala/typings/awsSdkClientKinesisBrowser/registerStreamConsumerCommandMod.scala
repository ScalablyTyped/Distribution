package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
import typings.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerStreamConsumerCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/RegisterStreamConsumerCommand", "RegisterStreamConsumerCommand")
  @js.native
  class RegisterStreamConsumerCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RegisterStreamConsumerInput, 
          OutputTypesUnion, 
          RegisterStreamConsumerOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: RegisterStreamConsumerInput) = this()
    
    /* CompleteClass */
    override val input: RegisterStreamConsumerInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
  }
}
