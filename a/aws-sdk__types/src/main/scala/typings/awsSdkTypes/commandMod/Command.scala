package typings.awsSdkTypes.commandMod

import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command[ClientInput /* <: CommandInput */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration, StreamType] extends js.Object {
  val input: InputType = js.native
  def resolveMiddleware(
    stack: MiddlewareStack[ClientInput, ClientOutput, StreamType],
    configuration: ResolvedConfiguration
  ): Handler[InputType, OutputType] = js.native
}

object Command {
  @scala.inline
  def apply[/* <: typings.awsSdkTypes.commandMod.CommandInput */ ClientInput, /* <: ClientInput */ InputType, /* <: typings.awsSdkTypes.responseMod.MetadataBearer */ ClientOutput, /* <: ClientOutput */ OutputType, ResolvedConfiguration, StreamType](
    input: InputType,
    resolveMiddleware: (MiddlewareStack[ClientInput, ClientOutput, StreamType], ResolvedConfiguration) => Handler[InputType, OutputType]
  ): Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], resolveMiddleware = js.Any.fromFunction2(resolveMiddleware))
    __obj.asInstanceOf[Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command[_, _, _, _, _, _], /* <: typings.awsSdkTypes.commandMod.CommandInput */ ClientInput, /* <: ClientInput */ InputType, /* <: typings.awsSdkTypes.responseMod.MetadataBearer */ ClientOutput, /* <: ClientOutput */ OutputType, ResolvedConfiguration, StreamType] (val x: Self with (Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInput(value: InputType): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolveMiddleware(
      value: (MiddlewareStack[ClientInput, ClientOutput, StreamType], ResolvedConfiguration) => Handler[InputType, OutputType]
    ): Self = this.set("resolveMiddleware", js.Any.fromFunction2(value))
  }
  
}

