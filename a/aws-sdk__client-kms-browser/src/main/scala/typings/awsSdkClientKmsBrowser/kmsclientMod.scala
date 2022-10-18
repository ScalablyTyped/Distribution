package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSConfiguration
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmsclientMod {
  
  @JSImport("@aws-sdk/client-kms-browser/KMSClient", "KMSClient")
  @js.native
  open class KMSClient protected () extends StObject {
    def this(configuration: KMSConfiguration) = this()
    
    /* protected */ val config: KMSResolvedConfiguration = js.native
    
    def destroy(): Unit = js.native
    
    val middlewareStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any = js.native
    
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, KMSResolvedConfiguration]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, KMSResolvedConfiguration],
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
}
