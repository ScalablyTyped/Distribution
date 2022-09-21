package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput
import typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod.PutRecordOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putRecordCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordCommand", "PutRecordCommand")
  @js.native
  open class PutRecordCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutRecordInput, 
          OutputTypesUnion, 
          PutRecordOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: PutRecordInput) = this()
    
    /* CompleteClass */
    override val input: PutRecordInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutRecordInput, PutRecordOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
  }
}
