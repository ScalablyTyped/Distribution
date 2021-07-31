package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
import typings.awsSdkClientKinesisBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getShardIteratorCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/GetShardIteratorCommand", "GetShardIteratorCommand")
  @js.native
  class GetShardIteratorCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetShardIteratorInput, 
          OutputTypesUnion, 
          GetShardIteratorOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: GetShardIteratorInput) = this()
    
    /* CompleteClass */
    override val input: GetShardIteratorInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetShardIteratorInput, GetShardIteratorOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
  }
}
