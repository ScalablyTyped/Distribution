package typings.d3Queue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def queue(): Queue_ = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")().asInstanceOf[Queue_]
  inline def queue(concurrency: Double): Queue_ = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")(concurrency.asInstanceOf[js.Any]).asInstanceOf[Queue_]
  
  trait Queue_ extends StObject {
    
    /**
      * Aborts any active tasks, invoking each active task’s task.abort function, if any.
      * Also prevents any new tasks from starting, and immediately invokes the queue.await or
      * queue.awaitAll callback with an error indicating that the queue was aborted.
      */
    def abort(): this.type
    
    /**
      * Sets the callback to be invoked when all deferred tasks have finished (individual result arguments).
      *
      * @param callback Callback function to be executed, when error occurred or all deferred tasks have completed.
      * The first argument to the callback is the first error that occurred, or null if no error occurred.
      * If an error occurred, there are no additional arguments to the callback.
      * Otherwise, the callback is passed each result as an additional argument.
      * @throws If called several times or after `awaitAll`, will throw an `Error`.
      */
    def await(callback: js.Function2[/* error */ Any | Null, /* repeated */ Any, Unit]): this.type
    
    /**
      * Sets the callback to be invoked when all deferred tasks have finished (results array).
      *
      * @param callback Callback function to be executed, when error occurred or all deferred tasks have completed.
      * The first argument to the callback is the first error that occurred, or null if no error occurred.
      * If an error occurred, there are no additional arguments to the callback.
      * Otherwise, the callback is also passed an array of results as the second argument.
      * @throws If called several times or after `await`, will throw an `Error`.
      */
    def awaitAll(callback: js.Function2[/* error */ Any | Null, /* results */ js.UndefOr[js.Array[Any]], Unit]): this.type
    
    /**
      * Adds the specified asynchronous task callback to the queue, with any optional arguments.
      *
      * @param task Task to be executed.The task is a function that will be called when the task should start.
      * It is passed the specified optional arguments and an additional callback as the last argument;
      * the callback must be invoked by the task when it finishes.
      * The task must invoke the callback with two arguments: the error, if any, and the result of the task.
      * To return multiple results from a single callback, wrap the results in an object or array.
      * @param args Additional, optional arguments to be passed into deferred task on invocation.
      * @throws If called after an `await`, will throw an `Error`.
      */
    def defer(task: js.Function1[/* repeated */ Any, Unit], args: Any*): this.type
  }
  object Queue_ {
    
    inline def apply(
      abort: () => Queue_,
      await: js.Function2[/* error */ Any | Null, /* repeated */ Any, Unit] => Queue_,
      awaitAll: js.Function2[/* error */ Any | Null, /* results */ js.UndefOr[js.Array[Any]], Unit] => Queue_,
      defer: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => Queue_
    ): Queue_ = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), await = js.Any.fromFunction1(await), awaitAll = js.Any.fromFunction1(awaitAll), defer = js.Any.fromFunction2(defer))
      __obj.asInstanceOf[Queue_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Queue_] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Queue_): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setAwait(value: js.Function2[/* error */ Any | Null, /* repeated */ Any, Unit] => Queue_): Self = StObject.set(x, "await", js.Any.fromFunction1(value))
      
      inline def setAwaitAll(
        value: js.Function2[/* error */ Any | Null, /* results */ js.UndefOr[js.Array[Any]], Unit] => Queue_
      ): Self = StObject.set(x, "awaitAll", js.Any.fromFunction1(value))
      
      inline def setDefer(value: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => Queue_): Self = StObject.set(x, "defer", js.Any.fromFunction2(value))
    }
  }
}
