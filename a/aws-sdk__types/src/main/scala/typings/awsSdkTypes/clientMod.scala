package typings.awsSdkTypes

import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/types/dist/cjs/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  
  @js.native
  trait Client[Input /* <: js.Object */, Output /* <: MetadataBearer */, ResolvedClientConfiguration] extends js.Object {
    
    val config: ResolvedClientConfiguration = js.native
    
    def destroy(): Unit = js.native
    
    var middlewareStack: MiddlewareStack[Input, Output] = js.native
    
    def send[InputType /* <: Input */, OutputType /* <: Output */](command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] | Unit = js.native
    def send[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: js.UndefOr[scala.Nothing],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
    def send[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: js.Any
    ): js.Promise[OutputType] | Unit = js.native
    def send[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: js.Any,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
    @JSName("send")
    def send_InputType_InputOutputType_Output_Promise[InputType /* <: Input */, OutputType /* <: Output */](command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] = js.native
    @JSName("send")
    def send_InputType_InputOutputType_Output_Promise[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: js.Any
    ): js.Promise[OutputType] = js.native
    @JSName("send")
    def send_InputType_InputOutputType_Output_Unit[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: js.Any,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
    @JSName("send")
    var send_Original: InvokeFunction[Input, Output, ResolvedClientConfiguration] = js.native
  }
  
  /**
    * function definition for different overrides of client's 'send' function.
    */
  @js.native
  trait InvokeFunction[InputTypes /* <: js.Object */, OutputTypes /* <: MetadataBearer */, ResolvedClientConfiguration] extends js.Object {
    
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] | Unit = js.native
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](
      command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration],
      options: js.UndefOr[scala.Nothing],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](
      command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration],
      options: js.Any
    ): js.Promise[OutputType] | Unit = js.native
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](
      command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration],
      options: js.Any,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
  }
}
