package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceResult extends StObject {
  
  /**
    * An object that contains information about the requested device.
    */
  var device: js.UndefOr[Device] = js.native
}
object GetDeviceResult {
  
  @scala.inline
  def apply(): GetDeviceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceResult]
  }
  
  @scala.inline
  implicit class GetDeviceResultMutableBuilder[Self <: GetDeviceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
