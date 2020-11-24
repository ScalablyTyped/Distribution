package typings.bull.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSettings extends js.Object {
  
  /**
    * Define a custom backoff strategy
    */
  var backoffStrategies: js.UndefOr[
    StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ Error, Double]]
  ] = js.native
  
  /**
    * A timeout for when the queue is in `drained` state (empty waiting for jobs).
    * It is used when calling `queue.getNextJob()`, which will pass it to `.brpoplpush` on the Redis client.
    */
  var drainDelay: js.UndefOr[Double] = js.native
  
  /**
    * Poll interval for delayed jobs and added jobs
    */
  var guardInterval: js.UndefOr[Double] = js.native
  
  /**
    * Key expiration time for job locks
    */
  var lockDuration: js.UndefOr[Double] = js.native
  
  /**
    * Interval in milliseconds on which to acquire the job lock.
    */
  var lockRenewTime: js.UndefOr[Double] = js.native
  
  /**
    * Max amount of times a stalled job will be re-processed
    */
  var maxStalledCount: js.UndefOr[Double] = js.native
  
  /**
    * Delay before processing next job in case of internal error
    */
  var retryProcessDelay: js.UndefOr[Double] = js.native
  
  /**
    * How often check for stalled jobs (use 0 for never checking)
    */
  var stalledInterval: js.UndefOr[Double] = js.native
}
object AdvancedSettings {
  
  @scala.inline
  def apply(): AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSettings]
  }
  
  @scala.inline
  implicit class AdvancedSettingsOps[Self <: AdvancedSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackoffStrategies(value: StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ Error, Double]]): Self = this.set("backoffStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoffStrategies: Self = this.set("backoffStrategies", js.undefined)
    
    @scala.inline
    def setDrainDelay(value: Double): Self = this.set("drainDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrainDelay: Self = this.set("drainDelay", js.undefined)
    
    @scala.inline
    def setGuardInterval(value: Double): Self = this.set("guardInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardInterval: Self = this.set("guardInterval", js.undefined)
    
    @scala.inline
    def setLockDuration(value: Double): Self = this.set("lockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockDuration: Self = this.set("lockDuration", js.undefined)
    
    @scala.inline
    def setLockRenewTime(value: Double): Self = this.set("lockRenewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockRenewTime: Self = this.set("lockRenewTime", js.undefined)
    
    @scala.inline
    def setMaxStalledCount(value: Double): Self = this.set("maxStalledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStalledCount: Self = this.set("maxStalledCount", js.undefined)
    
    @scala.inline
    def setRetryProcessDelay(value: Double): Self = this.set("retryProcessDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryProcessDelay: Self = this.set("retryProcessDelay", js.undefined)
    
    @scala.inline
    def setStalledInterval(value: Double): Self = this.set("stalledInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStalledInterval: Self = this.set("stalledInterval", js.undefined)
  }
}
