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
  
  inline def apply(): RetentionPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPeriod]
  }
  
  extension [Self <: RetentionPeriod](x: Self) {
    
    inline def setNumberOfDays(value: RetentionPeriodInDays): Self = StObject.set(x, "numberOfDays", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDaysUndefined: Self = StObject.set(x, "numberOfDays", js.undefined)
    
    inline def setUnlimited(value: UnlimitedRetentionPeriod): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    inline def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
  }
}
