package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSummary extends StObject {
  
  /**
    * The ID of the job used to order the device.
    */
  var associatedWithJob: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var managedDeviceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the device.
    */
  var managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways, such as by purpose, owner, or environment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object DeviceSummary {
  
  inline def apply(): DeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSummary]
  }
  
  extension [Self <: DeviceSummary](x: Self) {
    
    inline def setAssociatedWithJob(value: String): Self = StObject.set(x, "associatedWithJob", value.asInstanceOf[js.Any])
    
    inline def setAssociatedWithJobUndefined: Self = StObject.set(x, "associatedWithJob", js.undefined)
    
    inline def setManagedDeviceArn(value: String): Self = StObject.set(x, "managedDeviceArn", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceArnUndefined: Self = StObject.set(x, "managedDeviceArn", js.undefined)
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceIdUndefined: Self = StObject.set(x, "managedDeviceId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
