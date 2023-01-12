package typings.bull.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSettings extends StObject {
  
  /**
    * Define a custom backoff strategy
    */
  var backoffStrategies: js.UndefOr[
    StringDictionary[
      js.Function3[
        /* attemptsMade */ Double, 
        /* err */ js.Error, 
        /* strategyOptions */ js.UndefOr[Any], 
        Double
      ]
    ]
  ] = js.undefined
  
  /**
    * A timeout for when the queue is in `drained` state (empty waiting for jobs).
    * It is used when calling `queue.getNextJob()`, which will pass it to `.brpoplpush` on the Redis client.
    */
  var drainDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Poll interval for delayed jobs and added jobs
    */
  var guardInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Key expiration time for job locks
    */
  var lockDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Interval in milliseconds on which to acquire the job lock.
    */
  var lockRenewTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Max amount of times a stalled job will be re-processed
    */
  var maxStalledCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Delay before processing next job in case of internal error
    */
  var retryProcessDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * How often check for stalled jobs (use 0 for never checking)
    */
  var stalledInterval: js.UndefOr[Double] = js.undefined
}
object AdvancedSettings {
  
  inline def apply(): AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedSettings] (val x: Self) extends AnyVal {
    
    inline def setBackoffStrategies(
      value: StringDictionary[
          js.Function3[
            /* attemptsMade */ Double, 
            /* err */ js.Error, 
            /* strategyOptions */ js.UndefOr[Any], 
            Double
          ]
        ]
    ): Self = StObject.set(x, "backoffStrategies", value.asInstanceOf[js.Any])
    
    inline def setBackoffStrategiesUndefined: Self = StObject.set(x, "backoffStrategies", js.undefined)
    
    inline def setDrainDelay(value: Double): Self = StObject.set(x, "drainDelay", value.asInstanceOf[js.Any])
    
    inline def setDrainDelayUndefined: Self = StObject.set(x, "drainDelay", js.undefined)
    
    inline def setGuardInterval(value: Double): Self = StObject.set(x, "guardInterval", value.asInstanceOf[js.Any])
    
    inline def setGuardIntervalUndefined: Self = StObject.set(x, "guardInterval", js.undefined)
    
    inline def setLockDuration(value: Double): Self = StObject.set(x, "lockDuration", value.asInstanceOf[js.Any])
    
    inline def setLockDurationUndefined: Self = StObject.set(x, "lockDuration", js.undefined)
    
    inline def setLockRenewTime(value: Double): Self = StObject.set(x, "lockRenewTime", value.asInstanceOf[js.Any])
    
    inline def setLockRenewTimeUndefined: Self = StObject.set(x, "lockRenewTime", js.undefined)
    
    inline def setMaxStalledCount(value: Double): Self = StObject.set(x, "maxStalledCount", value.asInstanceOf[js.Any])
    
    inline def setMaxStalledCountUndefined: Self = StObject.set(x, "maxStalledCount", js.undefined)
    
    inline def setRetryProcessDelay(value: Double): Self = StObject.set(x, "retryProcessDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryProcessDelayUndefined: Self = StObject.set(x, "retryProcessDelay", js.undefined)
    
    inline def setStalledInterval(value: Double): Self = StObject.set(x, "stalledInterval", value.asInstanceOf[js.Any])
    
    inline def setStalledIntervalUndefined: Self = StObject.set(x, "stalledInterval", js.undefined)
  }
}
