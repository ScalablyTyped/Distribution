package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsFunc[Args /* <: js.Array[Any] */, Result] extends StObject {
  
  /* The arguments to carry into a provided function. This is only valid if the func parameter is specified. These arguments must be JSON-serializable. */
  var args: Args
  
  /* A JavaScript function to inject. This function will be serialized, and then deserialized for injection. This means that any bound parameters and execution context will be lost. Exactly one of files and function must be specified. */
  def func(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Result
}
object ArgsFunc {
  
  inline def apply[Args /* <: js.Array[Any] */, Result](args: Args, func: Args => Result): ArgsFunc[Args, Result] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = js.Any.fromFunction1(func))
    __obj.asInstanceOf[ArgsFunc[Args, Result]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgsFunc[?, ?], Args /* <: js.Array[Any] */, Result] (val x: Self & (ArgsFunc[Args, Result])) extends AnyVal {
    
    inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: Args => Result): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
  }
}
