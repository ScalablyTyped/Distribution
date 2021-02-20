package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInputDeviceRequest extends StObject {
  
  /**
    * The unique ID of this input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
}
object DescribeInputDeviceRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): DescribeInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputDeviceRequest]
  }
  
  @scala.inline
  implicit class DescribeInputDeviceRequestMutableBuilder[Self <: DescribeInputDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
