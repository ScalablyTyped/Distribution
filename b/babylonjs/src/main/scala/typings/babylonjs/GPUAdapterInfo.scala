package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUAdapterInfo extends StObject {
  
  val architecture: String
  
  val description: String
  
  val device: String
  
  val vendor: String
}
object GPUAdapterInfo {
  
  inline def apply(architecture: String, description: String, device: String, vendor: String): GPUAdapterInfo = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUAdapterInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUAdapterInfo] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
