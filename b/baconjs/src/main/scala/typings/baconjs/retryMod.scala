package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMod {
  
  @JSImport("baconjs/types/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](options: RetryOptions[V]): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
  
  trait RetryContext extends StObject {
    
    var error: js.Any
    
    var retriesDone: Double
  }
  object RetryContext {
    
    @scala.inline
    def apply(error: js.Any, retriesDone: Double): RetryContext = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], retriesDone = retriesDone.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryContext]
    }
    
    @scala.inline
    implicit class RetryContextMutableBuilder[Self <: RetryContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesDone(value: Double): Self = StObject.set(x, "retriesDone", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryOptions[V] extends StObject {
    
    /**
      *  Optional. A function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a context object with the keys ```error``` (the error that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay e.g. for an incremental backoff.
      */
    var delay: js.UndefOr[js.Function1[/* context */ RetryContext, Double]] = js.undefined
    
    /**
      * Optional. A function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The error that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
      */
    var isRetryable: js.UndefOr[js.Function1[/* error */ js.Any, Boolean]] = js.undefined
    
    /**
      * Required. The number of times to retry the `source` function _in addition to the initial attempt_. The default value is 0 (zero) for retrying indefinitely.
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * Required. A function that produces an Observable. The function gets attempt number (starting from zero) as its argument.
      */
    def source(attemptNumber: Double): default[V]
  }
  object RetryOptions {
    
    @scala.inline
    def apply[V](source: Double => default[V]): RetryOptions[V] = {
      val __obj = js.Dynamic.literal(source = js.Any.fromFunction1(source))
      __obj.asInstanceOf[RetryOptions[V]]
    }
    
    @scala.inline
    implicit class RetryOptionsMutableBuilder[Self <: RetryOptions[?], V] (val x: Self & RetryOptions[V]) extends AnyVal {
      
      @scala.inline
      def setDelay(value: /* context */ RetryContext => Double): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setIsRetryable(value: /* error */ js.Any => Boolean): Self = StObject.set(x, "isRetryable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRetryableUndefined: Self = StObject.set(x, "isRetryable", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setSource(value: Double => default[V]): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    }
  }
}
