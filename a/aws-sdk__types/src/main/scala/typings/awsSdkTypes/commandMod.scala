package typings.awsSdkTypes

import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  trait Command[ClientInput /* <: js.Object */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration] extends StObject {
    
    val input: InputType
    
    val middlewareStack: MiddlewareStack[InputType, OutputType]
    
    def resolveMiddleware(
      stack: MiddlewareStack[ClientInput, ClientOutput],
      configuration: ResolvedConfiguration,
      options: js.Any
    ): Handler[InputType, OutputType]
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
    implicit class CommandMutableBuilder[Self <: Command[?, ?, ?, ?, ?], ClientInput /* <: js.Object */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration] (val x: Self & (Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration])) extends AnyVal {
      
      @scala.inline
      def setInput(value: InputType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewareStack(value: MiddlewareStack[InputType, OutputType]): Self = StObject.set(x, "middlewareStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveMiddleware(
        value: (MiddlewareStack[ClientInput, ClientOutput], ResolvedConfiguration, js.Any) => Handler[InputType, OutputType]
      ): Self = StObject.set(x, "resolveMiddleware", js.Any.fromFunction3(value))
    }
  }
}
