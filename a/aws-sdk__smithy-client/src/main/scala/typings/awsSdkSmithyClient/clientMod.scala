package typings.awsSdkSmithyClient

import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.transferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("@aws-sdk/smithy-client/dist/cjs/client", "Client")
  @js.native
  class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
    extends typings.awsSdkTypes.clientMod.Client[ClientInput, ClientOutput, ResolvedClientConfiguration] {
    def this(config: ResolvedClientConfiguration) = this()
    
    def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[
          ClientInput, 
          InputType, 
          ClientOutput, 
          OutputType, 
          SmithyResolvedConfiguration[HandlerOptions]
        ],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
    def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[
          ClientInput, 
          InputType, 
          ClientOutput, 
          OutputType, 
          SmithyResolvedConfiguration[HandlerOptions]
        ],
      options: HandlerOptions
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[
          ClientInput, 
          InputType, 
          ClientOutput, 
          OutputType, 
          SmithyResolvedConfiguration[HandlerOptions]
        ],
      options: HandlerOptions,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait SmithyConfiguration[HandlerOptions] extends StObject {
    
    val apiVersion: String = js.native
    
    var requestHandler: RequestHandler[_, _, HandlerOptions] = js.native
  }
  object SmithyConfiguration {
    
    @scala.inline
    def apply[HandlerOptions](apiVersion: String, requestHandler: RequestHandler[_, _, HandlerOptions]): SmithyConfiguration[HandlerOptions] = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmithyConfiguration[HandlerOptions]]
    }
    
    @scala.inline
    implicit class SmithyConfigurationMutableBuilder[Self <: SmithyConfiguration[_], HandlerOptions] (val x: Self with SmithyConfiguration[HandlerOptions]) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHandler(value: RequestHandler[_, _, HandlerOptions]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
  
  type SmithyResolvedConfiguration[HandlerOptions] = SmithyConfiguration[HandlerOptions]
}
