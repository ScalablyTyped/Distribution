package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailabilityMonitorTestOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The time the High Availability monitoring test was started. If a test hasn't been performed, the value of this field is null.
    */
  var StartTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The status of the High Availability monitoring test. If a test hasn't been performed, the value of this field is null.
    */
  var Status: js.UndefOr[AvailabilityMonitorTestStatus] = js.undefined
}
object DescribeAvailabilityMonitorTestOutput {
  
  @scala.inline
  def apply(): DescribeAvailabilityMonitorTestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityMonitorTestOutput]
  }
  
  @scala.inline
  implicit class DescribeAvailabilityMonitorTestOutputMutableBuilder[Self <: DescribeAvailabilityMonitorTestOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setStartTime(value: Time): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: AvailabilityMonitorTestStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
