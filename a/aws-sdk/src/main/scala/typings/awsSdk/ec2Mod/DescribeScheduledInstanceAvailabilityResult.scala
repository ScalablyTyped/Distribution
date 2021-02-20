package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledInstanceAvailabilityResult extends StObject {
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the available Scheduled Instances.
    */
  var ScheduledInstanceAvailabilitySet: js.UndefOr[typings.awsSdk.ec2Mod.ScheduledInstanceAvailabilitySet] = js.native
}
object DescribeScheduledInstanceAvailabilityResult {
  
  @scala.inline
  def apply(): DescribeScheduledInstanceAvailabilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstanceAvailabilityResult]
  }
  
  @scala.inline
  implicit class DescribeScheduledInstanceAvailabilityResultMutableBuilder[Self <: DescribeScheduledInstanceAvailabilityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScheduledInstanceAvailabilitySet(value: ScheduledInstanceAvailabilitySet): Self = StObject.set(x, "ScheduledInstanceAvailabilitySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledInstanceAvailabilitySetUndefined: Self = StObject.set(x, "ScheduledInstanceAvailabilitySet", js.undefined)
    
    @scala.inline
    def setScheduledInstanceAvailabilitySetVarargs(value: ScheduledInstanceAvailability*): Self = StObject.set(x, "ScheduledInstanceAvailabilitySet", js.Array(value :_*))
  }
}
