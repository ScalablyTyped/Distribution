package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeDeviceClaimRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
  
  /**
    * A collection of key/value pairs defining the resource tags. For example, {
    "tags": {"key1": "value1", "key2": "value2"} }. For more information, see AWS
    Tagging Strategies.
    
    
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object FinalizeDeviceClaimRequest {
  
  inline def apply(DeviceId: string): FinalizeDeviceClaimRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeDeviceClaimRequest]
  }
  
  extension [Self <: FinalizeDeviceClaimRequest](x: Self) {
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
