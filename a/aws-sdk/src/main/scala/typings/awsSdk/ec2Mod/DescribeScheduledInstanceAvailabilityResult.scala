package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledInstanceAvailabilityResult extends js.Object {
  
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
  implicit class DescribeScheduledInstanceAvailabilityResultOps[Self <: DescribeScheduledInstanceAvailabilityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setScheduledInstanceAvailabilitySetVarargs(value: ScheduledInstanceAvailability*): Self = this.set("ScheduledInstanceAvailabilitySet", js.Array(value :_*))
    
    @scala.inline
    def setScheduledInstanceAvailabilitySet(value: ScheduledInstanceAvailabilitySet): Self = this.set("ScheduledInstanceAvailabilitySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledInstanceAvailabilitySet: Self = this.set("ScheduledInstanceAvailabilitySet", js.undefined)
  }
}
