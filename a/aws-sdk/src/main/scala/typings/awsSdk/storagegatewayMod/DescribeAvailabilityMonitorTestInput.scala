package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailabilityMonitorTestInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object DescribeAvailabilityMonitorTestInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeAvailabilityMonitorTestInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityMonitorTestInput]
  }
  
  @scala.inline
  implicit class DescribeAvailabilityMonitorTestInputMutableBuilder[Self <: DescribeAvailabilityMonitorTestInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
