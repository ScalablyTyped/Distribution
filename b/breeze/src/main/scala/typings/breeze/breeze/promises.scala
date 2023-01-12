package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Promises interface used by Breeze.  Usually implemented by Q (https://github.com/kriskowal/q) or angular.$q using breeze.config.setQ(impl) */
object promises {
  
  trait IDeferred[T] extends StObject {
    
    var promise: js.Promise[T]
    
    def reject(reason: Any): Unit
    
    def resolve(value: T): Unit
  }
  object IDeferred {
    
    inline def apply[T](promise: js.Promise[T], reject: Any => Unit, resolve: T => Unit): IDeferred[T] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[IDeferred[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDeferred[?], T] (val x: Self & IDeferred[T]) extends AnyVal {
      
      inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReject(value: Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: T => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IPromiseService extends StObject {
    
    def defer[T](): IDeferred[T] = js.native
    
    def reject(): js.Promise[Any] = js.native
    def reject(reason: Any): js.Promise[Any] = js.native
    
    def resolve[T](`object`: T): js.Promise[T] = js.native
    def resolve[T](`object`: js.Promise[T]): js.Promise[T] = js.native
  }
}
