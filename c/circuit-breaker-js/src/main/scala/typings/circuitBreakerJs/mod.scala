package typings.circuitBreakerJs

import typings.circuitBreakerJs.circuitBreakerJsNumbers.`0`
import typings.circuitBreakerJs.circuitBreakerJsNumbers.`1`
import typings.circuitBreakerJs.circuitBreakerJsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("circuit-breaker-js", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with CircuitBreaker {
    def this(options: Options) = this()
  }
  @JSImport("circuit-breaker-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("circuit-breaker-js", "CLOSED")
  @js.native
  def CLOSED: `2` = js.native
  inline def CLOSED_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("circuit-breaker-js", "HALF_OPEN")
  @js.native
  def HALF_OPEN: `1` = js.native
  inline def HALF_OPEN_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HALF_OPEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("circuit-breaker-js", "OPEN")
  @js.native
  def OPEN: `0` = js.native
  inline def OPEN_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CircuitBreaker extends StObject {
    
    def forceClose(): Unit = js.native
    
    def forceOpen(): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def run(command: js.Function2[/* success */ js.Function0[Unit], /* failure */ js.Function0[Unit], Unit]): Unit = js.native
    def run(
      command: js.Function2[/* success */ js.Function0[Unit], /* failure */ js.Function0[Unit], Unit],
      fallback: js.Function0[Unit]
    ): Unit = js.native
    
    def unforce(): Unit = js.native
  }
  
  trait Metrics extends StObject {
    
    var errorCount: Double
    
    var errorPercentage: Double
    
    var totalCount: Double
  }
  object Metrics {
    
    inline def apply(errorCount: Double, errorPercentage: Double, totalCount: Double): Metrics = {
      val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], errorPercentage = errorPercentage.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    extension [Self <: Metrics](x: Self) {
      
      inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
      
      inline def setErrorPercentage(value: Double): Self = StObject.set(x, "errorPercentage", value.asInstanceOf[js.Any])
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var errorThreshold: js.UndefOr[Double] = js.undefined
    
    var numBuckets: js.UndefOr[Double] = js.undefined
    
    var onCircuitClose: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.undefined
    
    var onCircuitOpen: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.undefined
    
    var timeoutDuration: js.UndefOr[Double] = js.undefined
    
    var volumeThreshold: js.UndefOr[Double] = js.undefined
    
    var windowDuration: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setErrorThreshold(value: Double): Self = StObject.set(x, "errorThreshold", value.asInstanceOf[js.Any])
      
      inline def setErrorThresholdUndefined: Self = StObject.set(x, "errorThreshold", js.undefined)
      
      inline def setNumBuckets(value: Double): Self = StObject.set(x, "numBuckets", value.asInstanceOf[js.Any])
      
      inline def setNumBucketsUndefined: Self = StObject.set(x, "numBuckets", js.undefined)
      
      inline def setOnCircuitClose(value: /* m */ Metrics => Unit): Self = StObject.set(x, "onCircuitClose", js.Any.fromFunction1(value))
      
      inline def setOnCircuitCloseUndefined: Self = StObject.set(x, "onCircuitClose", js.undefined)
      
      inline def setOnCircuitOpen(value: /* m */ Metrics => Unit): Self = StObject.set(x, "onCircuitOpen", js.Any.fromFunction1(value))
      
      inline def setOnCircuitOpenUndefined: Self = StObject.set(x, "onCircuitOpen", js.undefined)
      
      inline def setTimeoutDuration(value: Double): Self = StObject.set(x, "timeoutDuration", value.asInstanceOf[js.Any])
      
      inline def setTimeoutDurationUndefined: Self = StObject.set(x, "timeoutDuration", js.undefined)
      
      inline def setVolumeThreshold(value: Double): Self = StObject.set(x, "volumeThreshold", value.asInstanceOf[js.Any])
      
      inline def setVolumeThresholdUndefined: Self = StObject.set(x, "volumeThreshold", js.undefined)
      
      inline def setWindowDuration(value: Double): Self = StObject.set(x, "windowDuration", value.asInstanceOf[js.Any])
      
      inline def setWindowDurationUndefined: Self = StObject.set(x, "windowDuration", js.undefined)
    }
  }
}
