package typings.branchy

import typings.betterQueue.mod.QueueOptions
import typings.branchy.branchyStrings.auto
import typings.branchy.branchyStrings.stack
import typings.std.Parameters
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: String): js.Function1[/* repeated */ Any, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, js.Promise[Any]]]
  inline def apply(callback: String, options: Options[js.Function1[/* repeated */ Any, Any]]): js.Function1[/* repeated */ Any, js.Promise[Any]] = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Promise[Any]]]
  /**
    * Comfortly run Node.js functions in a separate process.
    *
    * @example
    * import branchy = require('branchy')
    *
    * (async () => {
    *   // Synchronous "add", returns number
    *   const adder = (a: number, b: number) => a + b
    *
    *   // Asynchronous "add" in a child process, returns Promise that resolves to number
    *   const forkedAdder = branchy(adder)
    *
    *   // Don't forget to wrap in async function
    *   await forkedAdder(2, 3) // 5
    * })();
    */
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](callback: TFn): js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRet> ? std.Promise<TRet> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRet> ? std.Promise<TRet> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ]]
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](callback: TFn, options: Options[TFn]): js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRet> ? std.Promise<TRet> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRet> ? std.Promise<TRet> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ]]
  
  @JSImport("branchy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a concurrency context to apply to branchy tasks.
    *
    * @param options Concurrency options
    *
    * @example
    * import branchy = require('branchy')
    *
    * const ctx = branchy.createContext({
    *   concurrent: 2
    * })
    *
    * const inc = branchy((num: number) => num + 1, { concurrent: ctx })
    * const dec = branchy((num: number) => num - 1, { concurrent: ctx })
    *
    * // This opens 2 processes
    * inc(1)
    * inc(2)
    * inc(3)
    *
    * // This correctly queues dec() calls after inc() calls
    * dec(1)
    * dec(2)
    * dec(3)
    */
  inline def createContext[T, K](): ConcurrencyContext[T, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[ConcurrencyContext[T, K]]
  inline def createContext[T, K](options: Partial[QueueOptions[T, K]]): ConcurrencyContext[T, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(options.asInstanceOf[js.Any]).asInstanceOf[ConcurrencyContext[T, K]]
  
  type ConcurrencyContext[T, K] = typings.betterQueue.mod.^[T, K]
  
  trait ConcurrencyOptions[TFn /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    /**
      * The priority of each call can be specified depending on its arguments.
      *
      * @example
      * import branchy = require('branchy')
      *
      * const call = branchy((name: string) => console.log('Call %s', name), {
      *   concurrent: {
      *     threads: 1, // Only one at a time for demoing purposes
      *     priority: name => (name === 'Ghostbusters' ? 100 : 1)
      *   }
      * })
      *
      * call('Alice')
      * call('Bob')
      * call('Ghostbusters')
      *
      * // "Call Ghostbusters", "Call Alice", "Call Bob"
      */
    var priority: js.UndefOr[js.Function1[/* args */ Parameters[TFn], Double | js.Promise[Double]]] = js.undefined
    
    /**
      * By default, the queue starts processes in the order functions were called
      * ([first-in, first-out](https://en.wikipedia.org/wiki/FIFO_(computing_and_electronics))).
      * However the queue can be made to handle the latest calls first (technically making it a
      * [Stack](https://en.wikipedia.org/wiki/Stack_(abstract_data_type))) by setting the strategy.
      *
      * @example
      * import branchy = require('branchy')
      *
      * branchy((a: number, b: number) => a + b, {
      *   concurrent: {
      *     strategy: 'stack'
      *   }
      * })
      */
    var strategy: js.UndefOr[stack] = js.undefined
    
    /**
      * Concurrency control can be enabled by specifying number of concurrent threads.
      *
      * To restrict concurrency to the number of available CPU cores, the value `'auto'` can be used.
      *
      * @default Infinity
      */
    var threads: js.UndefOr[Double | auto] = js.undefined
  }
  object ConcurrencyOptions {
    
    inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](): ConcurrencyOptions[TFn] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcurrencyOptions[TFn]]
    }
    
    extension [Self <: ConcurrencyOptions[?], TFn /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & ConcurrencyOptions[TFn]) {
      
      inline def setPriority(value: /* args */ Parameters[TFn] => Double | js.Promise[Double]): Self = StObject.set(x, "priority", js.Any.fromFunction1(value))
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setStrategy(value: stack): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setThreads(value: Double | auto): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  trait Options[TFn /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    /**
      * @default Infinity
      */
    var concurrent: js.UndefOr[ConcurrencyOptions[TFn] | Double | auto | (ConcurrencyContext[TFn, Any])] = js.undefined
  }
  object Options {
    
    inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](): Options[TFn] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TFn]]
    }
    
    extension [Self <: Options[?], TFn /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & Options[TFn]) {
      
      inline def setConcurrent(value: ConcurrencyOptions[TFn] | Double | auto | (ConcurrencyContext[TFn, Any])): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
    }
  }
}
