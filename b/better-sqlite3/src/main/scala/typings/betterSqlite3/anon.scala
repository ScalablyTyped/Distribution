package typings.betterSqlite3

import typings.betterSqlite3.mod.ElementOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Inverse[T] extends StObject {
    
    var inverse: js.UndefOr[js.Function2[/* total */ T, /* dropped */ T, T]] = js.undefined
    
    var result: js.UndefOr[js.Function1[/* total */ T, Any]] = js.undefined
    
    var start: js.UndefOr[T | js.Function0[T]] = js.undefined
    
    def step(total: T, next: ElementOf[T]): T | Unit
  }
  object Inverse {
    
    inline def apply[T](step: (T, ElementOf[T]) => T | Unit): Inverse[T] = {
      val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
      __obj.asInstanceOf[Inverse[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inverse[?], T] (val x: Self & Inverse[T]) extends AnyVal {
      
      inline def setInverse(value: (/* total */ T, /* dropped */ T) => T): Self = StObject.set(x, "inverse", js.Any.fromFunction2(value))
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setResult(value: /* total */ T => Any): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setStart(value: T | js.Function0[T]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction0(value: () => T): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: (T, ElementOf[T]) => T | Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    }
  }
}
