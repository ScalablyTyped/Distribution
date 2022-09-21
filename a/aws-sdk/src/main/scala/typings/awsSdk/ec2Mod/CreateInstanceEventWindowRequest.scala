package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceEventWindowRequest extends StObject {
  
  /**
    * The cron expression for the event window, for example, * 0-4,20-23 * * 1,5. If you specify a cron expression, you can't specify a time range. Constraints:   Only hour and day of the week values are supported.   For day of the week values, you can specify either integers 0 through 6, or alternative single values SUN through SAT.   The minute, month, and year must be specified by *.   The hour value must be one or a multiple range, for example, 0-4 or 0-4,20-23.   Each hour range must be &gt;= 2 hours, for example, 0-2 or 20-23.   The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4 hours.   For more information about cron expressions, see cron on the Wikipedia website.
    */
  var CronExpression: js.UndefOr[InstanceEventWindowCronExpression] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the event window.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to apply to the event window.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The time range for the event window. If you specify a time range, you can't specify a cron expression.
    */
  var TimeRanges: js.UndefOr[InstanceEventWindowTimeRangeRequestSet] = js.undefined
}
object CreateInstanceEventWindowRequest {
  
  inline def apply(): CreateInstanceEventWindowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceEventWindowRequest]
  }
  
  extension [Self <: CreateInstanceEventWindowRequest](x: Self) {
    
    inline def setCronExpression(value: InstanceEventWindowCronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTimeRanges(value: InstanceEventWindowTimeRangeRequestSet): Self = StObject.set(x, "TimeRanges", value.asInstanceOf[js.Any])
    
    inline def setTimeRangesUndefined: Self = StObject.set(x, "TimeRanges", js.undefined)
    
    inline def setTimeRangesVarargs(value: InstanceEventWindowTimeRangeRequest*): Self = StObject.set(x, "TimeRanges", js.Array(value*))
  }
}
