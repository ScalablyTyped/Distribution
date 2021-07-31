package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
import typings.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateShardCountCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/UpdateShardCountCommand", "UpdateShardCountCommand")
  @js.native
  class UpdateShardCountCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateShardCountInput, 
          OutputTypesUnion, 
          UpdateShardCountOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: UpdateShardCountInput) = this()
    
    /* CompleteClass */
    override val input: UpdateShardCountInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateShardCountInput, UpdateShardCountOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
  }
}
