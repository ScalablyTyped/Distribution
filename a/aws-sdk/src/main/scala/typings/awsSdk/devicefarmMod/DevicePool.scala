package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePool extends StObject {
  
  /**
    * The device pool's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The device pool's description.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests.
    */
  var maxDevices: js.UndefOr[Integer] = js.undefined
  
  /**
    * The device pool's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * Information about the device pool's rules.
    */
  var rules: js.UndefOr[Rules] = js.undefined
  
  /**
    * The device pool's type. Allowed values include:   CURATED: A device pool that is created and managed by AWS Device Farm.   PRIVATE: A device pool that is created and managed by the device pool developer.  
    */
  var `type`: js.UndefOr[DevicePoolType] = js.undefined
}
object DevicePool {
  
  inline def apply(): DevicePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePool]
  }
  
  extension [Self <: DevicePool](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMaxDevices(value: Integer): Self = StObject.set(x, "maxDevices", value.asInstanceOf[js.Any])
    
    inline def setMaxDevicesUndefined: Self = StObject.set(x, "maxDevices", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    inline def setType(value: DevicePoolType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
