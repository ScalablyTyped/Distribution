package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledAuditRequest extends StObject {
  
  /**
    * The name of the scheduled audit whose information you want to get.
    */
  var scheduledAuditName: ScheduledAuditName = js.native
}
object DescribeScheduledAuditRequest {
  
  @scala.inline
  def apply(scheduledAuditName: ScheduledAuditName): DescribeScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledAuditRequest]
  }
  
  @scala.inline
  implicit class DescribeScheduledAuditRequestMutableBuilder[Self <: DescribeScheduledAuditRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
  }
}
