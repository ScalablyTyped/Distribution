package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVTLDeviceTypeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the medium changer you have selected.
    */
  var VTLDeviceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceARN] = js.undefined
}
object UpdateVTLDeviceTypeOutput {
  
  @scala.inline
  def apply(): UpdateVTLDeviceTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVTLDeviceTypeOutput]
  }
  
  @scala.inline
  implicit class UpdateVTLDeviceTypeOutputMutableBuilder[Self <: UpdateVTLDeviceTypeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVTLDeviceARN(value: VTLDeviceARN): Self = StObject.set(x, "VTLDeviceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceARNUndefined: Self = StObject.set(x, "VTLDeviceARN", js.undefined)
  }
}
