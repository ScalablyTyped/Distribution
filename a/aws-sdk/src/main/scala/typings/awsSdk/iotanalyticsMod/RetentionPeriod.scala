package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPeriod extends StObject {
  
  /**
    * The number of days that message data is kept. The unlimited parameter must be false.
    */
  var numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.undefined
  
  /**
    * If true, message data is kept indefinitely.
    */
  var unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.undefined
}
object RetentionPeriod {
  
  @scala.inline
  def apply(): RetentionPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPeriod]
  }
  
  @scala.inline
  implicit class RetentionPeriodMutableBuilder[Self <: RetentionPeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfDays(value: RetentionPeriodInDays): Self = StObject.set(x, "numberOfDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDaysUndefined: Self = StObject.set(x, "numberOfDays", js.undefined)
    
    @scala.inline
    def setUnlimited(value: UnlimitedRetentionPeriod): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
  }
}
