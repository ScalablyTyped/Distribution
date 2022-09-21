package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledInstanceAvailabilityResult extends StObject {
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the available Scheduled Instances.
    */
  var ScheduledInstanceAvailabilitySet: js.UndefOr[typings.awsSdk.ec2Mod.ScheduledInstanceAvailabilitySet] = js.undefined
}
object DescribeScheduledInstanceAvailabilityResult {
  
  inline def apply(): DescribeScheduledInstanceAvailabilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstanceAvailabilityResult]
  }
  
  extension [Self <: DescribeScheduledInstanceAvailabilityResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledInstanceAvailabilitySet(value: ScheduledInstanceAvailabilitySet): Self = StObject.set(x, "ScheduledInstanceAvailabilitySet", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstanceAvailabilitySetUndefined: Self = StObject.set(x, "ScheduledInstanceAvailabilitySet", js.undefined)
    
    inline def setScheduledInstanceAvailabilitySetVarargs(value: ScheduledInstanceAvailability*): Self = StObject.set(x, "ScheduledInstanceAvailabilitySet", js.Array(value*))
  }
}
