package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDeviceRequest extends StObject {
  
  /**
    * The unique ID for the device.
    */
  var Id: js.UndefOr[string] = js.native
}
object InputDeviceRequest {
  
  @scala.inline
  def apply(): InputDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceRequest]
  }
  
  @scala.inline
  implicit class InputDeviceRequestMutableBuilder[Self <: InputDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
