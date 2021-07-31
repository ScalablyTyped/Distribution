package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisConfiguration
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.commandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisClientMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/KinesisClient", "KinesisClient")
  @js.native
  class KinesisClient protected () extends StObject {
    def this(configuration: KinesisConfiguration) = this()
    
    val config: KinesisResolvedConfiguration = js.native
    
    def destroy(): Unit = js.native
    
    val middlewareStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any = js.native
    
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, KinesisResolvedConfiguration]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, KinesisResolvedConfiguration],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
}
