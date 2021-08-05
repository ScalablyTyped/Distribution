package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeHandlerArguments[Input /* <: js.Object */]
  extends StObject
     with SerializeHandlerArguments[Input]
object FinalizeHandlerArguments {
  
  inline def apply[Input /* <: js.Object */](input: Input): FinalizeHandlerArguments[Input] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeHandlerArguments[Input]]
  }
}
