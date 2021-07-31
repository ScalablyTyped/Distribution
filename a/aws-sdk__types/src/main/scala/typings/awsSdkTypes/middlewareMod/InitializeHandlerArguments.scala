package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeHandlerArguments[Input /* <: js.Object */] extends StObject {
  
  /**
    * User input to a command. Reflects the userland representation of the
    * union of data types the command can effectively handle.
    */
  var input: Input
}
object InitializeHandlerArguments {
  
  @scala.inline
  def apply[Input /* <: js.Object */](input: Input): InitializeHandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeHandlerArguments[Input]]
  }
  
  @scala.inline
  implicit class InitializeHandlerArgumentsMutableBuilder[Self <: InitializeHandlerArguments[?], Input /* <: js.Object */] (val x: Self & InitializeHandlerArguments[Input]) extends AnyVal {
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
