package typings.backo2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backo2", JSImport.Namespace)
  @js.native
  class ^ () extends Backoff {
    def this(opts: BackoffOptions) = this()
  }
  
  @js.native
  trait Backoff extends StObject {
    
    /**
      * The number of previous attempts
      */
    var attempts: Double = js.native
    
    /**
      * Compute the backoff duration and increment the number of attempts
      */
    def duration(): Double = js.native
    
    /**
      * The base to which the attempt is raised as an exponent
      */
    var factor: Double = js.native
    
    /**
      * An upper bound on the variance around the duration between attempts
      */
    var jitter: Double = js.native
    
    /**
      * An upper bound on the duration between attempts
      */
    var max: Double = js.native
    
    /**
      * A lower bound on the duration between attempts
      */
    var ms: Double = js.native
    
    /**
      * Reset the number of attempts
      */
    def reset(): Unit = js.native
    
    /**
      * Set the jitter
      */
    def setJitter(jitter: Double): Unit = js.native
    
    /**
      * Set the maximum duration between attempts
      */
    def setMax(max: Double): Unit = js.native
    
    /**
      * Set the minimum duration between attempts
      */
    def setMin(min: Double): Unit = js.native
  }
  object Backoff {
    
    @scala.inline
    def apply(
      attempts: Double,
      duration: () => Double,
      factor: Double,
      jitter: Double,
      max: Double,
      ms: Double,
      reset: () => Unit,
      setJitter: Double => Unit,
      setMax: Double => Unit,
      setMin: Double => Unit
    ): Backoff = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], duration = js.Any.fromFunction0(duration), factor = factor.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setJitter = js.Any.fromFunction1(setJitter), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin))
      __obj.asInstanceOf[Backoff]
    }
    
    @scala.inline
    implicit class BackoffMutableBuilder[Self <: Backoff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: () => Double): Self = StObject.set(x, "duration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetJitter(value: Double => Unit): Self = StObject.set(x, "setJitter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMax(value: Double => Unit): Self = StObject.set(x, "setMax", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMin(value: Double => Unit): Self = StObject.set(x, "setMin", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<{  min :number,   max :number,   jitter :number,   factor :number}> */
  @js.native
  trait BackoffOptions extends StObject {
    
    var factor: js.UndefOr[Double] = js.native
    
    var jitter: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
  }
  object BackoffOptions {
    
    @scala.inline
    def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    @scala.inline
    implicit class BackoffOptionsMutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
