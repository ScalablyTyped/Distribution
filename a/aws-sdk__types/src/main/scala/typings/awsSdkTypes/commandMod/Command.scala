package typings.awsSdkTypes.commandMod

import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command[ClientInput /* <: CommandInput */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration, StreamType] extends js.Object {
  val input: InputType
  def resolveMiddleware(
    stack: MiddlewareStack[ClientInput, ClientOutput, StreamType],
    configuration: ResolvedConfiguration
  ): Handler[InputType, OutputType]
}

object Command {
  @scala.inline
  def apply[ClientInput /* <: CommandInput */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration, StreamType](
    input: InputType,
    resolveMiddleware: (MiddlewareStack[ClientInput, ClientOutput, StreamType], ResolvedConfiguration) => Handler[InputType, OutputType]
  ): Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], resolveMiddleware = js.Any.fromFunction2(resolveMiddleware))
    __obj.asInstanceOf[Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]]
  }
}

