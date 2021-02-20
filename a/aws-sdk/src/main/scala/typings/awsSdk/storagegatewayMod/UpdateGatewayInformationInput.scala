package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayInformationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that you want to use to monitor and log events in the gateway. For more information, see What is Amazon CloudWatch Logs? 
    */
  var CloudWatchLogGroupARN: js.UndefOr[typings.awsSdk.storagegatewayMod.CloudWatchLogGroupARN] = js.native
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  var GatewayName: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayName] = js.native
  
  /**
    * A value that indicates the time zone of the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayTimezone] = js.native
}
object UpdateGatewayInformationInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): UpdateGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInformationInput]
  }
  
  @scala.inline
  implicit class UpdateGatewayInformationInputMutableBuilder[Self <: UpdateGatewayInformationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogGroupARN(value: CloudWatchLogGroupARN): Self = StObject.set(x, "CloudWatchLogGroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogGroupARNUndefined: Self = StObject.set(x, "CloudWatchLogGroupARN", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayName(value: GatewayName): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
    
    @scala.inline
    def setGatewayTimezone(value: GatewayTimezone): Self = StObject.set(x, "GatewayTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayTimezoneUndefined: Self = StObject.set(x, "GatewayTimezone", js.undefined)
  }
}
