package typings.awsSdkSmithyClient

import typings.awsSdkTypes.clientMod.InvokeFunction
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.transferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/client", "Client")
  @js.native
  open class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
    extends StObject
       with typings.awsSdkTypes.clientMod.Client[ClientInput, ClientOutput, ResolvedClientConfiguration] {
    def this(config: ResolvedClientConfiguration) = this()
    
    /* CompleteClass */
    override val config: ResolvedClientConfiguration = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var middlewareStack: MiddlewareStack[ClientInput, ClientOutput] = js.native
    
    /* CompleteClass */
    override def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] | Unit = js.native
    def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[
          ClientInput, 
          InputType, 
          ClientOutput, 
          OutputType, 
          SmithyResolvedConfiguration[HandlerOptions]
        ],
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
    /* CompleteClass */
    override def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: Any
    ): js.Promise[OutputType] | Unit = js.native
    /* CompleteClass */
    override def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: Any,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
    /* CompleteClass */
    override def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: Unit,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
    /* CompleteClass */
    @JSName("send")
    override def send_InputType_InputOutputType_Output_Promise[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] = js.native
    /* CompleteClass */
    @JSName("send")
    override def send_InputType_InputOutputType_Output_Promise[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: Any
    ): js.Promise[OutputType] = js.native
    /* CompleteClass */
    @JSName("send")
    override def send_InputType_InputOutputType_Output_Unit[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: Any,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
    /* CompleteClass */
    @JSName("send")
    var send_Original: InvokeFunction[ClientInput, ClientOutput, ResolvedClientConfiguration] = js.native
  }
  
  trait SmithyConfiguration[HandlerOptions] extends StObject {
    
    /**
      * The API version set internally by the SDK, and is
      * not planned to be used by customer code.
      * @internal
      */
    val apiVersion: String
    
    var requestHandler: RequestHandler[Any, Any, HandlerOptions]
  }
  object SmithyConfiguration {
    
    inline def apply[HandlerOptions](apiVersion: String, requestHandler: RequestHandler[Any, Any, HandlerOptions]): SmithyConfiguration[HandlerOptions] = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmithyConfiguration[HandlerOptions]]
    }
    
    extension [Self <: SmithyConfiguration[?], HandlerOptions](x: Self & SmithyConfiguration[HandlerOptions]) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setRequestHandler(value: RequestHandler[Any, Any, HandlerOptions]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
  
  type SmithyResolvedConfiguration[HandlerOptions] = SmithyConfiguration[HandlerOptions]
}
