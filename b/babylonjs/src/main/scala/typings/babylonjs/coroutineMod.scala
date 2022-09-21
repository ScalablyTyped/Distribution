package typings.babylonjs

import typings.std.AbortSignal
import typings.std.IterableIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coroutineMod {
  
  @JSImport("babylonjs/Misc/coroutine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createYieldingScheduler[T](): js.Function3[
    /* coroutine */ AsyncCoroutine[T], 
    /* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
    /* onError */ js.Function1[/* stepError */ Any, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createYieldingScheduler")().asInstanceOf[js.Function3[
    /* coroutine */ AsyncCoroutine[T], 
    /* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
    /* onError */ js.Function1[/* stepError */ Any, Unit], 
    Unit
  ]]
  inline def createYieldingScheduler[T](yieldAfterMS: Double): js.Function3[
    /* coroutine */ AsyncCoroutine[T], 
    /* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
    /* onError */ js.Function1[/* stepError */ Any, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createYieldingScheduler")(yieldAfterMS.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* coroutine */ AsyncCoroutine[T], 
    /* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
    /* onError */ js.Function1[/* stepError */ Any, Unit], 
    Unit
  ]]
  
  inline def inlineScheduler[T](
    coroutine: AsyncCoroutine[T],
    onStep: js.Function1[/* stepResult */ CoroutineStep[T], Unit],
    onError: js.Function1[/* stepError */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineScheduler")(coroutine.asInstanceOf[js.Any], onStep.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def makeAsyncFunction[TParams /* <: js.Array[Any] */, TReturn](
    coroutineFactory: js.Function1[/* params */ TParams, AsyncCoroutine[TReturn]],
    scheduler: CoroutineScheduler[TReturn]
  ): js.Function1[/* params */ TParams, js.Promise[TReturn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAsyncFunction")(coroutineFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, js.Promise[TReturn]]]
  inline def makeAsyncFunction[TParams /* <: js.Array[Any] */, TReturn](
    coroutineFactory: js.Function1[/* params */ TParams, AsyncCoroutine[TReturn]],
    scheduler: CoroutineScheduler[TReturn],
    abortSignal: AbortSignal
  ): js.Function1[/* params */ TParams, js.Promise[TReturn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAsyncFunction")(coroutineFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, js.Promise[TReturn]]]
  
  inline def makeSyncFunction[TParams /* <: js.Array[Any] */, TReturn](coroutineFactory: js.Function1[/* params */ TParams, Coroutine[TReturn]]): js.Function1[/* params */ TParams, TReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSyncFunction")(coroutineFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ TParams, TReturn]]
  inline def makeSyncFunction[TParams /* <: js.Array[Any] */, TReturn](coroutineFactory: js.Function1[/* params */ TParams, Coroutine[TReturn]], abortSignal: AbortSignal): js.Function1[/* params */ TParams, TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSyncFunction")(coroutineFactory.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, TReturn]]
  
  inline def runCoroutine[T](
    coroutine: AsyncCoroutine[T],
    scheduler: CoroutineScheduler[T],
    onSuccess: js.Function1[/* result */ T, Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutine")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runCoroutine[T](
    coroutine: AsyncCoroutine[T],
    scheduler: CoroutineScheduler[T],
    onSuccess: js.Function1[/* result */ T, Unit],
    onError: js.Function1[/* error */ Any, Unit],
    abortSignal: AbortSignal
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutine")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def runCoroutineAsync[T](coroutine: AsyncCoroutine[T], scheduler: CoroutineScheduler[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineAsync")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runCoroutineAsync[T](coroutine: AsyncCoroutine[T], scheduler: CoroutineScheduler[T], abortSignal: AbortSignal): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineAsync")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def runCoroutineSync[T](coroutine: Coroutine[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineSync")(coroutine.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def runCoroutineSync[T](coroutine: Coroutine[T], abortSignal: AbortSignal): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineSync")(coroutine.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type AsyncCoroutine[T] = CoroutineBase[Unit | js.Promise[Unit], T]
  
  type Coroutine[T] = CoroutineBase[Unit, T]
  
  /**
    * A Coroutine<T> is the intersection of:
    * 1. An Iterator that yields void, returns a T, and is not passed values with calls to next.
    * 2. An IterableIterator of void (since it only yields void).
    */
  @js.native
  trait CoroutineBase[TStep, TReturn]
    extends StObject
       with IterableIterator[TStep]
  
  type CoroutineScheduler[T] = js.Function3[
    /* coroutine */ AsyncCoroutine[T], 
    /* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
    /* onError */ js.Function1[/* stepError */ Any, Unit], 
    Unit
  ]
  
  type CoroutineStep[T] = IteratorResult[Unit, T]
}
