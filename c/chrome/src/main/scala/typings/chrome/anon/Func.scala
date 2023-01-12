package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func[Result] extends StObject {
  
  /* A JavaScript function to inject. This function will be serialized, and then deserialized for injection. This means that any bound parameters and execution context will be lost. Exactly one of files and function must be specified. */
  def func(): Result
}
object Func {
  
  inline def apply[Result](func: () => Result): Func[Result] = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction0(func))
    __obj.asInstanceOf[Func[Result]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Func[?], Result] (val x: Self & Func[Result]) extends AnyVal {
    
    inline def setFunc(value: () => Result): Self = StObject.set(x, "func", js.Any.fromFunction0(value))
  }
}
