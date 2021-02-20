package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDevicePoolRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Device Farm device pool to update.
    */
  var arn: AmazonResourceName = js.native
  
  /**
    * Sets whether the maxDevices parameter applies to your device pool. If you set this parameter to true, the maxDevices parameter does not apply, and Device Farm does not limit the number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that meet the criteria specified in the rules parameter. If you use this parameter in your request, you cannot use the maxDevices parameter in the same request.
    */
  var clearMaxDevices: js.UndefOr[Boolean] = js.native
  
  /**
    * A description of the device pool to update.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and that meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests. If you use this parameter in your request, you cannot use the clearMaxDevices parameter in the same request.
    */
  var maxDevices: js.UndefOr[Integer] = js.native
  
  /**
    * A string that represents the name of the device pool to update.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * Represents the rules to modify for the device pool. Updating rules is optional. If you update rules for your request, the update replaces the existing rules.
    */
  var rules: js.UndefOr[Rules] = js.native
}
object UpdateDevicePoolRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicePoolRequest]
  }
  
  @scala.inline
  implicit class UpdateDevicePoolRequestMutableBuilder[Self <: UpdateDevicePoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearMaxDevices(value: Boolean): Self = StObject.set(x, "clearMaxDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearMaxDevicesUndefined: Self = StObject.set(x, "clearMaxDevices", js.undefined)
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMaxDevices(value: Integer): Self = StObject.set(x, "maxDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDevicesUndefined: Self = StObject.set(x, "maxDevices", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
