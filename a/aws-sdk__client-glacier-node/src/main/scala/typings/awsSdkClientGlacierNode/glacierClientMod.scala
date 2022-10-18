package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierConfiguration
import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glacierClientMod {
  
  @JSImport("@aws-sdk/client-glacier-node/GlacierClient", "GlacierClient")
  @js.native
  open class GlacierClient protected () extends StObject {
    def this(configuration: GlacierConfiguration) = this()
    
    /* protected */ val config: GlacierResolvedConfiguration = js.native
    
    def destroy(): Unit = js.native
    
    val middlewareStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any = js.native
    
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, GlacierResolvedConfiguration]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, GlacierResolvedConfiguration],
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
}
