package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPeriod extends StObject {
  
  /**
    * The number of days that your data is kept.  If you specified a value for this parameter, the unlimited parameter must be false. 
    */
  var numberOfDays: js.UndefOr[NumberOfDays] = js.undefined
  
  /**
    * If true, your data is kept indefinitely.  If configured to true, you must not specify a value for the numberOfDays parameter. 
    */
  var unlimited: js.UndefOr[Unlimited] = js.undefined
}
object RetentionPeriod {
  
  inline def apply(): RetentionPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPeriod]
  }
  
  extension [Self <: RetentionPeriod](x: Self) {
    
    inline def setNumberOfDays(value: NumberOfDays): Self = StObject.set(x, "numberOfDays", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDaysUndefined: Self = StObject.set(x, "numberOfDays", js.undefined)
    
    inline def setUnlimited(value: Unlimited): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    inline def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
  }
}
