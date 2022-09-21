package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
import typings.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRecordsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/GetRecordsCommand", "GetRecordsCommand")
  @js.native
  open class GetRecordsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetRecordsInput, 
          OutputTypesUnion, 
          GetRecordsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: GetRecordsInput) = this()
    
    /* CompleteClass */
    override val input: GetRecordsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetRecordsInput, GetRecordsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
  }
}
