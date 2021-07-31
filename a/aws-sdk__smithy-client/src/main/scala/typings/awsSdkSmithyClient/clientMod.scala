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
  
  @JSImport("@aws-sdk/smithy-client/dist/cjs/client", "Client")
  @js.native
  class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
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
    /* CompleteClass */
    override def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: js.Any
    ): js.Promise[OutputType] | Unit = js.native
    /* CompleteClass */
    override def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: js.Any,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
    /* CompleteClass */
    override def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: Unit,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
    /* CompleteClass */
    @JSName("send")
    override def send_InputType_InputOutputType_Output_Promise[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] = js.native
    /* CompleteClass */
    @JSName("send")
    override def send_InputType_InputOutputType_Output_Promise[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: js.Any
    ): js.Promise[OutputType] = js.native
    /* CompleteClass */
    @JSName("send")
    override def send_InputType_InputOutputType_Output_Unit[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
      command: Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedClientConfiguration],
      options: js.Any,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
    /* CompleteClass */
    @JSName("send")
    var send_Original: InvokeFunction[ClientInput, ClientOutput, ResolvedClientConfiguration] = js.native
  }
  
  trait SmithyConfiguration[HandlerOptions] extends StObject {
    
    val apiVersion: String
    
    var requestHandler: RequestHandler[js.Any, js.Any, HandlerOptions]
  }
  object SmithyConfiguration {
    
    @scala.inline
    def apply[HandlerOptions](apiVersion: String, requestHandler: RequestHandler[js.Any, js.Any, HandlerOptions]): SmithyConfiguration[HandlerOptions] = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmithyConfiguration[HandlerOptions]]
    }
    
    @scala.inline
    implicit class SmithyConfigurationMutableBuilder[Self <: SmithyConfiguration[?], HandlerOptions] (val x: Self & SmithyConfiguration[HandlerOptions]) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHandler(value: RequestHandler[js.Any, js.Any, HandlerOptions]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
  
  type SmithyResolvedConfiguration[HandlerOptions] = SmithyConfiguration[HandlerOptions]
}
