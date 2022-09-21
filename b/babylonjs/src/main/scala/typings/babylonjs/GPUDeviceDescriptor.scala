package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDeviceDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var defaultQueue: js.UndefOr[GPUQueueDescriptor] = js.undefined
  
  var requiredFeatures: js.UndefOr[js.Array[GPUFeatureName]] = js.undefined
  
  var requiredLimits: js.UndefOr[StringDictionary[GPUSize64]] = js.undefined
}
object GPUDeviceDescriptor {
  
  inline def apply(): GPUDeviceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUDeviceDescriptor]
  }
  
  extension [Self <: GPUDeviceDescriptor](x: Self) {
    
    inline def setDefaultQueue(value: GPUQueueDescriptor): Self = StObject.set(x, "defaultQueue", value.asInstanceOf[js.Any])
    
    inline def setDefaultQueueUndefined: Self = StObject.set(x, "defaultQueue", js.undefined)
    
    inline def setRequiredFeatures(value: js.Array[GPUFeatureName]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredFeaturesVarargs(value: GPUFeatureName*): Self = StObject.set(x, "requiredFeatures", js.Array(value*))
    
    inline def setRequiredLimits(value: StringDictionary[GPUSize64]): Self = StObject.set(x, "requiredLimits", value.asInstanceOf[js.Any])
    
    inline def setRequiredLimitsUndefined: Self = StObject.set(x, "requiredLimits", js.undefined)
  }
}
