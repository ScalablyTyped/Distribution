package typings.cypressRecurse

import typings.cypress.Chai.Assertion
import typings.cypress.Cypress.Chainable
import typings.cypressRecurse.cypressRecurseStrings.both
import typings.cypressRecurse.cypressRecurseStrings.reduced
import typings.cypressRecurse.cypressRecurseStrings.value
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cypress-recurse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cypress-recurse", "RecurseDefaults")
  @js.native
  val RecurseDefaults: RecurseOptions[Any] = js.native
  
  inline def each(commandsFn: js.Function1[/* x */ Any, Any | Chainable[Any]]): Any | (Chainable[Any | Unit | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any]).asInstanceOf[Any | (Chainable[Any | Unit | Null])]
  inline def each(
    commandsFn: js.Function1[/* x */ Any, Any | Chainable[Any]],
    checkFn: js.Function1[/* x */ Any, Boolean | Unit | Assertion]
  ): Any | (Chainable[Any | Unit | Null]) = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Any | (Chainable[Any | Unit | Null])]
  
  inline def each_Chainable(commandsFn: js.Function1[/* x */ Any, Any]): Chainable[Any | Unit | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any]).asInstanceOf[Chainable[Any | Unit | Null]]
  inline def each_Chainable(
    commandsFn: js.Function1[/* x */ Any, Any],
    checkFn: js.Function1[/* x */ Any, Boolean | Unit | Assertion]
  ): Chainable[Any | Unit | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Chainable[Any | Unit | Null]]
  
  inline def each_T_Chainable[T](commandsFn: js.Function1[/* x */ T, Chainable[js.Promise[T] | T]]): Chainable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any]).asInstanceOf[Chainable[js.Array[T]]]
  inline def each_T_Chainable[T](
    commandsFn: js.Function1[/* x */ T, Chainable[js.Promise[T] | T]],
    checkFn: js.Function1[/* x */ T, Assertion | Boolean | Unit]
  ): Chainable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Chainable[js.Array[T]]]
  
  inline def recurse[T](
    commandsFn: js.Function0[Chainable[js.Promise[T] | T]],
    checkFn: js.Function2[/* x */ T, js.UndefOr[Any], Assertion | Boolean | Unit]
  ): Chainable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("recurse")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Chainable[T]]
  inline def recurse[T](
    commandsFn: js.Function0[Chainable[js.Promise[T] | T]],
    checkFn: js.Function2[/* x */ T, js.UndefOr[Any], Assertion | Boolean | Unit],
    options: Partial[RecurseOptions[T]]
  ): Chainable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("recurse")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chainable[T]]
  
  type LogOption[T] = Boolean | String | (js.Function1[/* arg */ T, Unit])
  
  type PostFunction[T] = js.Function1[/* opts */ PostFunctionOptions[T], Unit | Chainable[Any]]
  
  trait PostFunctionOptions[T] extends StObject {
    
    /**
      * Time since the recursion started, ms
      */
    var elapsed: Double
    
    /**
      * The remaining number of iterations
      */
    var limit: Double
    
    /**
      * The current reduced value, if any
      */
    var reduced: Any
    
    /**
      * Result of the predicate function,
      * is false for all but the last values
      */
    var success: Boolean
    
    /**
      * The value produced by the last iteration
      */
    var value: T
  }
  object PostFunctionOptions {
    
    inline def apply[T](elapsed: Double, limit: Double, reduced: Any, success: Boolean, value: T): PostFunctionOptions[T] = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], reduced = reduced.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostFunctionOptions[T]]
    }
    
    extension [Self <: PostFunctionOptions[?], T](x: Self & PostFunctionOptions[T]) {
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setReduced(value: Any): Self = StObject.set(x, "reduced", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecurseOptions[T] extends StObject {
    
    /** Internal: print the current options to Command Log */
    var debugLog: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Between iterations, milliseconds
      */
    var delay: Double
    
    /**
      * Error message to display when timed out or max limit reached
      */
    var error: js.UndefOr[String] = js.undefined
    
    /** Internal: the current iteration count */
    var iteration: js.UndefOr[Double] = js.undefined
    
    /**
      * The max number of iterations
      */
    var limit: Double
    
    /**
      * Log to Command Log, could be true|false,
      * a message to be printed once at the end,
      * or a custom function
      */
    var log: LogOption[T]
    
    /**
      * Function that can run additional Cypress commands after each iteration
      */
    var post: js.UndefOr[PostFunction[T]] = js.undefined
    
    /**
      * Call "post" with the last value during recursion,
      * default is false
      */
    var postLastValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update the accumulator with the given value,
      * synchronous function
      */
    def reduce(accumulator: Any, item: T): Any
    
    // options for accumulator
    /** Starting value for the accumulator */
    var reduceFrom: Any
    
    /** Include the last value in the accumulator */
    var reduceLastValue: Boolean
    
    /**
      * Internal: tracks the timestamp of the very first iteration
      */
    var started: js.UndefOr[Double] = js.undefined
    
    /**
      * In milliseconds
      */
    var timeout: Double
    
    /**
      * What to yield to the next command, usually it is
      * the last value, but sometimes can be the accumulator.
      * If you need both, pass "both" and "reduce" will
      * yield an object with {value, reduced} properties
      */
    var `yield`: value | reduced | both
  }
  object RecurseOptions {
    
    inline def apply[T](
      delay: Double,
      limit: Double,
      log: LogOption[T],
      reduce: (Any, T) => Any,
      reduceFrom: Any,
      reduceLastValue: Boolean,
      timeout: Double,
      `yield`: value | reduced | both
    ): RecurseOptions[T] = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), reduceFrom = reduceFrom.asInstanceOf[js.Any], reduceLastValue = reduceLastValue.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("yield")(`yield`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurseOptions[T]]
    }
    
    extension [Self <: RecurseOptions[?], T](x: Self & RecurseOptions[T]) {
      
      inline def setDebugLog(value: Boolean): Self = StObject.set(x, "debugLog", value.asInstanceOf[js.Any])
      
      inline def setDebugLogUndefined: Self = StObject.set(x, "debugLog", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setIterationUndefined: Self = StObject.set(x, "iteration", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LogOption[T]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogFunction1(value: T => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setPost(value: /* opts */ PostFunctionOptions[T] => Unit | Chainable[Any]): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
      inline def setPostLastValue(value: Boolean): Self = StObject.set(x, "postLastValue", value.asInstanceOf[js.Any])
      
      inline def setPostLastValueUndefined: Self = StObject.set(x, "postLastValue", js.undefined)
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setReduce(value: (Any, T) => Any): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      inline def setReduceFrom(value: Any): Self = StObject.set(x, "reduceFrom", value.asInstanceOf[js.Any])
      
      inline def setReduceLastValue(value: Boolean): Self = StObject.set(x, "reduceLastValue", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setYield(value: value | reduced | both): Self = StObject.set(x, "yield", value.asInstanceOf[js.Any])
    }
  }
}
