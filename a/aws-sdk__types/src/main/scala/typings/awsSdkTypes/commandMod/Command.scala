package typings.awsSdkTypes.commandMod

import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command[ClientInput /* <: js.Object */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration] extends js.Object {
  
  val input: InputType = js.native
  
  val middlewareStack: MiddlewareStack[InputType, OutputType] = js.native
  
  def resolveMiddleware(
    stack: MiddlewareStack[ClientInput, ClientOutput],
    configuration: ResolvedConfiguration,
    options: js.Any
  ): Handler[InputType, OutputType] = js.native
}
object Command {
  
  @scala.inline
  def apply[ClientInput /* <: js.Object */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration](
    input: InputType,
    middlewareStack: MiddlewareStack[InputType, OutputType],
    resolveMiddleware: (MiddlewareStack[ClientInput, ClientOutput], ResolvedConfiguration, js.Any) => Handler[InputType, OutputType]
  ): Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], middlewareStack = middlewareStack.asInstanceOf[js.Any], resolveMiddleware = js.Any.fromFunction3(resolveMiddleware))
    __obj.asInstanceOf[Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration]]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command[_, _, _, _, _], ClientInput /* <: js.Object */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration] (val x: Self with (Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration])) extends AnyVal {
    
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
    def setMiddlewareStack(value: MiddlewareStack[InputType, OutputType]): Self = this.set("middlewareStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveMiddleware(
      value: (MiddlewareStack[ClientInput, ClientOutput], ResolvedConfiguration, js.Any) => Handler[InputType, OutputType]
    ): Self = this.set("resolveMiddleware", js.Any.fromFunction3(value))
  }
}
