package typings.cypressRecurse

import typings.cypress.Chai.Assertion
import typings.cypressRecurse.cypressRecurseStrings.both
import typings.cypressRecurse.cypressRecurseStrings.reduced
import typings.cypressRecurse.cypressRecurseStrings.value
import typings.cypressRecurse.srcCommandsMod.global.Cypress.Chainable
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
  
  inline def each(commandsFn: js.Function1[/* x */ Any, Any | Chainable]): Any | Chainable = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any]).asInstanceOf[Any | Chainable]
  inline def each(
    commandsFn: js.Function1[/* x */ Any, Any | Chainable],
    checkFn: js.Function1[/* x */ Any, Boolean | Unit | Assertion]
  ): Any | Chainable = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Any | Chainable]
  
  inline def each_Chainable(commandsFn: js.Function1[/* x */ Any, Any]): Chainable = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any]).asInstanceOf[Chainable]
  inline def each_Chainable(
    commandsFn: js.Function1[/* x */ Any, Any],
    checkFn: js.Function1[/* x */ Any, Boolean | Unit | Assertion]
  ): Chainable = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Chainable]
  
  inline def each_T_Chainable[T](commandsFn: js.Function1[/* x */ T, Chainable]): Chainable = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any]).asInstanceOf[Chainable]
  inline def each_T_Chainable[T](
    commandsFn: js.Function1[/* x */ T, Chainable],
    checkFn: js.Function1[/* x */ T, Assertion | Boolean | Unit]
  ): Chainable = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Chainable]
  
  inline def recurse[T](
    commandsFn: js.Function0[Chainable],
    checkFn: js.Function2[/* x */ T, js.UndefOr[Any], Assertion | Boolean | Unit]
  ): Chainable = (^.asInstanceOf[js.Dynamic].applyDynamic("recurse")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any])).asInstanceOf[Chainable]
  inline def recurse[T](
    commandsFn: js.Function0[Chainable],
    checkFn: js.Function2[/* x */ T, js.UndefOr[Any], Assertion | Boolean | Unit],
    options: Partial[RecurseOptions[T]]
  ): Chainable = (^.asInstanceOf[js.Dynamic].applyDynamic("recurse")(commandsFn.asInstanceOf[js.Any], checkFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chainable]
  
  /**
    * Data about the current iteration passed to the user log function.
    */
  trait LogData[T] extends StObject {
    
    /**
      * Elapsed number of milliseconds
      */
    var elapsed: Double
    
    /**
      * Human elapsed duration, like "2 seconds"
      */
    var elapsedDuration: String
    
    /**
      * Current iteration
      */
    var iteration: Double
    
    /**
      * Remaining number of iterations allowed
      */
    var limit: Double
    
    /**
      * The current iteration successfully passed the predicate check
      */
    var successful: Boolean
    
    /**
      * The value produced by the current iteration
      */
    var value: T
  }
  object LogData {
    
    inline def apply[T](
      elapsed: Double,
      elapsedDuration: String,
      iteration: Double,
      limit: Double,
      successful: Boolean,
      value: T
    ): LogData[T] = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], elapsedDuration = elapsedDuration.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogData[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogData[?], T] (val x: Self & LogData[T]) extends AnyVal {
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setElapsedDuration(value: String): Self = StObject.set(x, "elapsedDuration", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type LogOption[T] = Boolean | String | (js.Function2[/* arg */ T, /* data */ LogData[T], Unit])
  
  type PostFunction[T] = js.Function1[/* opts */ PostFunctionOptions[T], Unit | Chainable]
  
  trait PostFunctionOptions[T] extends StObject {
    
    /**
      * Time since the recursion started, ms
      */
    var elapsed: Double
    
    /**
      * Human-readable elapsed duration, like "5 seconds"
      */
    var elapsedDuration: String
    
    /**
      * Current iteration
      */
    var iteration: Double
    
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
    
    inline def apply[T](
      elapsed: Double,
      elapsedDuration: String,
      iteration: Double,
      limit: Double,
      reduced: Any,
      success: Boolean,
      value: T
    ): PostFunctionOptions[T] = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], elapsedDuration = elapsedDuration.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], reduced = reduced.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostFunctionOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostFunctionOptions[?], T] (val x: Self & PostFunctionOptions[T]) extends AnyVal {
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setElapsedDuration(value: String): Self = StObject.set(x, "elapsedDuration", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
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
      * When recursion ends, if the predicate is still false,
      * continue without failing the test
      */
    var doNotFail: Boolean
    
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
      doNotFail: Boolean,
      limit: Double,
      log: LogOption[T],
      reduce: (Any, T) => Any,
      reduceFrom: Any,
      reduceLastValue: Boolean,
      timeout: Double,
      `yield`: value | reduced | both
    ): RecurseOptions[T] = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], doNotFail = doNotFail.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), reduceFrom = reduceFrom.asInstanceOf[js.Any], reduceLastValue = reduceLastValue.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("yield")(`yield`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurseOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecurseOptions[?], T] (val x: Self & RecurseOptions[T]) extends AnyVal {
      
      inline def setDebugLog(value: Boolean): Self = StObject.set(x, "debugLog", value.asInstanceOf[js.Any])
      
      inline def setDebugLogUndefined: Self = StObject.set(x, "debugLog", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDoNotFail(value: Boolean): Self = StObject.set(x, "doNotFail", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setIterationUndefined: Self = StObject.set(x, "iteration", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LogOption[T]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogFunction2(value: (T, /* data */ LogData[T]) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setPost(value: /* opts */ PostFunctionOptions[T] => Unit | Chainable): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
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
