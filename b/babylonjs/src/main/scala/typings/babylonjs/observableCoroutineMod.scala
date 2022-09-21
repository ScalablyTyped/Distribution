package typings.babylonjs

import typings.babylonjs.coroutineMod.AsyncCoroutine
import typings.babylonjs.coroutineMod.CoroutineScheduler
import typings.babylonjs.coroutineMod.CoroutineStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableCoroutineMod {
  
  /* augmented module */
  object babylonjsMiscObservableAugmentingMod {
    
    trait Observable[T] extends StObject {
      
      /**
        * Internal observable-based coroutine scheduler instance.
        */
      var _coroutineScheduler: js.UndefOr[CoroutineScheduler[Unit]] = js.undefined
      
      /**
        * Internal disposal method for observable-based coroutine scheduler instance.
        */
      var _coroutineSchedulerDispose: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * Cancels all coroutines currently running on this observable
        */
      def cancelAllCoroutines(): Unit
      
      /**
        * Runs a coroutine asynchronously on this observable
        * @param coroutine the iterator resulting from having started the coroutine
        * @returns a promise which will be resolved when the coroutine finishes or rejected if the coroutine is cancelled
        */
      def runCoroutineAsync(coroutine: AsyncCoroutine[Unit]): js.Promise[Unit]
    }
    object Observable {
      
      inline def apply[T](cancelAllCoroutines: () => Unit, runCoroutineAsync: AsyncCoroutine[Unit] => js.Promise[Unit]): Observable[T] = {
        val __obj = js.Dynamic.literal(cancelAllCoroutines = js.Any.fromFunction0(cancelAllCoroutines), runCoroutineAsync = js.Any.fromFunction1(runCoroutineAsync))
        __obj.asInstanceOf[Observable[T]]
      }
      
      extension [Self <: Observable[?], T](x: Self & Observable[T]) {
        
        inline def setCancelAllCoroutines(value: () => Unit): Self = StObject.set(x, "cancelAllCoroutines", js.Any.fromFunction0(value))
        
        inline def setRunCoroutineAsync(value: AsyncCoroutine[Unit] => js.Promise[Unit]): Self = StObject.set(x, "runCoroutineAsync", js.Any.fromFunction1(value))
        
        inline def set_coroutineScheduler(
          value: (/* coroutine */ AsyncCoroutine[Unit], /* onStep */ js.Function1[/* stepResult */ CoroutineStep[Unit], Unit], /* onError */ js.Function1[/* stepError */ Any, Unit]) => Unit
        ): Self = StObject.set(x, "_coroutineScheduler", js.Any.fromFunction3(value))
        
        inline def set_coroutineSchedulerDispose(value: () => Unit): Self = StObject.set(x, "_coroutineSchedulerDispose", js.Any.fromFunction0(value))
        
        inline def set_coroutineSchedulerDisposeUndefined: Self = StObject.set(x, "_coroutineSchedulerDispose", js.undefined)
        
        inline def set_coroutineSchedulerUndefined: Self = StObject.set(x, "_coroutineScheduler", js.undefined)
      }
    }
  }
}
