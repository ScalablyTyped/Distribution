package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args[T] extends StObject {
  
  var args: T
}
object Args {
  
  inline def apply[T](args: T): Args[T] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Args[?], T] (val x: Self & Args[T]) extends AnyVal {
    
    inline def setArgs(value: T): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
  }
}
