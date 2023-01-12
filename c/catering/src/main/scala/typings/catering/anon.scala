package typings.catering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Promise[T] extends StObject {
    
    var promise: js.UndefOr[js.Promise[T]] = js.undefined
  }
  object Promise {
    
    inline def apply[T](): Promise[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Promise[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Promise[?], T] (val x: Self & Promise[T]) extends AnyVal {
      
      inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
}
