package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizeHandlerArguments[Input /* <: js.Object */] extends SerializeHandlerArguments[Input]
object FinalizeHandlerArguments {
  
  @scala.inline
  def apply[Input /* <: js.Object */](input: Input): FinalizeHandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeHandlerArguments[Input]]
  }
}
